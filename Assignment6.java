public class Day {

	private String day;
	private String [] daysNameAbreviated = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	

	public Day(){
		this.day = "Mon ";
	}

	public Day(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String nextDay(){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int afterToday = indexOfDay + 1;
		if(indexOfDay>=0){
			message = daysNameAbreviated[afterToday];
		} else {
			message = "Invalid day !";
		}
		
		return message;
	}

	private int getIndexOfDay(String day){
		for(int i=0; i< daysNameAbreviated.length; i ++){
			if(daysNameAbreviated[i]== this.day){
				return i;
			}
		}
			
		return (-1);
	}

	public String previousDay(){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int beforeToday;
		if(indexOfDay>=0){
			beforeToday = indexOfDay + 6;
			message = daysNameAbreviated[(beforeToday)%7];
		} else {
			message = "Invalid day !";
		}
		return message;
	}

	public String calculateOtherDays(int whatDays){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int futureDays;
		if(indexOfDay>=0){
			futureDays = indexOfDay + whatDays;
			message = daysNameAbreviated[(futureDays)%7];
		} else {
			message = "Invalid day !";
		}
		
		return message;
	}

	public String toString() {
		return day;
	}
	
}