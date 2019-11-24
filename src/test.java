import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		String phrase = JOptionPane.showInputDialog("Input a Phrase.");
		for(int a = Integer. parseInt(phrase); a<7; a+=1) {
			for(int b = a; b>0; b-=1) {
				System.out.print(charAt(phrase));
			}
		System.out.println();
			}
	}
}
