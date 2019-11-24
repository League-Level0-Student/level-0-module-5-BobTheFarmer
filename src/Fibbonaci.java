
public class Fibbonaci {
public static void main(String[] args) {
	int N1 = 0;
	int N2 = 1;
	int N3;
	for(int i = 0; i<120; i+=1) {
		System.out.println(N1);
		N1 = N2+N1;
		N3=N1;
		N1=N2;
		N2 = N3;
	}
	}
}

