import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class DayDriver implements ActionListener {
	
		private JFrame frame = new JFrame();
		private JPanel panel = new JPanel();
		private JTextField [] jtxtField = new JTextField[7];
	
	public DayDriver(){	
		jtxtField[0]= new JTextField("   Monday   ");
		jtxtField[0].setForeground(Color.black);
		jtxtField[0].setBackground(Color.lightGray);
		jtxtField[1]= new JTextField("   Tuesday   ");
		jtxtField[1].setForeground(Color.BLACK);
		jtxtField[1].setBackground(Color.lightGray);
		jtxtField[2]= new JTextField("   Wednesday   ");
		jtxtField[2].setForeground(Color.black);
		jtxtField[2].setBackground(Color.lightGray);
		jtxtField[3]= new JTextField("   Thursday  ");
		jtxtField[3].setForeground(Color.BLACK);
		jtxtField[3].setBackground(Color.lightGray);
		jtxtField[4]= new JTextField("   Friday  ");
		jtxtField[4].setForeground(Color.BLACK);
		jtxtField[4].setBackground(Color.lightGray);
		jtxtField[5]= new JTextField("   Saturday  ");
		jtxtField[5].setForeground(Color.BLACK);
		jtxtField[5].setBackground(Color.lightGray);
		jtxtField[6]= new JTextField("   Sunday  ");
		jtxtField[6].setForeground(Color.BLACK);
		jtxtField[6].setBackground(Color.lightGray);

		frame = new JFrame("DAYS OF THE WEEK");
		frame.setVisible(true);
		frame.setSize(350,100 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		panel.setLayout(new FlowLayout());
		panel.add(jtxtField[0]);
		panel.add(jtxtField[1]);
		panel.add(jtxtField[2]);
		panel.add(jtxtField[3]);
		panel.add(jtxtField[4]);
		panel.add(jtxtField[5]);
		panel.add(jtxtField[6]);
		frame.add(panel);
	
	  }
		public void actionPerformed(ActionEvent e) {
		
		}
	
		public static void main(String[] args) {
		
		new DayDriver();
			
		Day thisWeek = new Day("Mon");
		System.out.println("Today is " + thisWeek.toString()+".");
		System.out.println("Tomorrow is " + thisWeek.nextDay()+".");
		System.out.println("Yesterday was " +thisWeek.previousDay()+".");
		System.out.println("In four days it will be " +thisWeek.calculateOtherDays(4)+".");
		
		Day differentWeek  = new Day("Tue");
		System.out.println("Today is " + differentWeek.toString()+".");
		System.out.println("In 13 days it will be " +differentWeek.calculateOtherDays(13)+".");

		}

	
	}
