
public class ForLoop {
public static void main(String[] args) {
	System.out.println("Challenge 1");
	
		for(int L1 = 0; L1<3; L1+=1)
		for(int L2 = 0; L2<3; L2+=1) {
			System.out.println(L1 + " " + L2);
		}

	
	System.out.println("Challenge 2");
		for(int i = 0; i<3; i+=1) {
			for(int e = 1; e<4; e+=1) {
				System.out.print(e+(i*3));
			}
		System.out.println();
			}
		System.out.println("Challenge 3");
		for(int i = 0; i<10; i+=1) {
			for(int e = 1; e<11; e+=1) {
				System.out.print(e+(i*10) + " ");
			}
		System.out.println();
			}
		System.out.println("Challenge 4");
		for(int a = 1; a<7; a+=1) {
			for(int b = a; b>0; b-=1) {
				System.out.print("*");
			}
		System.out.println();
			}
	}
}

