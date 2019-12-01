import javax.swing.JOptionPane;

public class Prime_Or_Not {
	
	public static void main(String[] args) {
		
		boolean prime = true;
		int yeet = 2;
		String numberString = JOptionPane.showInputDialog(null, "Input a number");
		int number = Integer.parseInt(numberString);
		for(number=number; yeet<number; yeet+=1) {
			if(number%yeet==0) {
				System.out.println(number + " is not divisable by " + yeet + ", prime=" + prime);
				prime=false;
			}
			else {
				
				System.out.println(number + " is divisable by " + yeet + ", prime=" + prime);
			}
			}
		JOptionPane.showMessageDialog(null, prime);
		}
}