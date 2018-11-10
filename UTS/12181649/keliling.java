import java.util.Scanner;

public class keliling {
	static double hitung(int a, double b) {
		double c = 2 * a * b;
		return c;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kel,phi;
		int jari;
		phi = 3.14;

		System.out.print("Masukkan Jari-jari Lingkaran : ");
		jari = input.nextInt();

		kel = hitung(jari,phi);

		System.out.println("Hasil Keliling Lingkaran : " + kel);

	}
}

