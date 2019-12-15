import java.util.Random;

import javax.swing.JOptionPane;

public class pratice {
public static void main(String[] args) {
		skill4();
	}

static void skill1() {
	String dimesString = JOptionPane.showInputDialog(null, "How many dimes do you have?");
	int dimes = Integer.parseInt(dimesString);
	JOptionPane.showMessageDialog(null, "You have " + dimes*10 + " cents.");
	
	String heightString = JOptionPane.showInputDialog(null, "How tall are you?(in in.)");
	double height = Integer.parseInt(heightString);
	if(height<36) {
		JOptionPane.showMessageDialog(null, "Eat you Wheaties");
	}

}

static void skill2() {
	for(int i = 1; i<31; i+=1) {
		if(i%3 == 0) {
			System.out.println(i);
		}
	}
}

static void skill3() {
	Random r = new Random();
	int Random1 = r.nextInt(20);
	int Random2 = r.nextInt(10);
	System.out.println(Random1);
	System.out.println(Random2);
	JOptionPane.showMessageDialog(null, Random2-Random1);
	
}

static void skill4() {
	String city = JOptionPane.showInputDialog(null, "What city do you live in?");
	if(city.equalsIgnoreCase("san diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's Finest City ");
	} else {
		JOptionPane.showMessageDialog(null, "Move to san diego");
	} 
	int cars = 2;
	if(cars==0) {
		JOptionPane.showMessageDialog(null, "Bet you use public transportaion");
		
	
	} else if(cars==1) {
		JOptionPane.showMessageDialog(null, "Car model");
	} else {
		JOptionPane.showMessageDialog(null, "So " + cars*4 + " wheels.");
	}
}

static void skill5() {
	String school = JOptionPane.showInputDialog("What is the name of your school");
	JOptionPane.showMessageDialog(null, school + " is a fantasitic school");
}
}


