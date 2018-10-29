import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class seleksi_switch {
	public static void main(String[] args) {
		BufferedReader InputData = new BufferedReader ( new InputStreamReader (System.in));
		String angkainput = null;
		System.out.print("Masukin kode hari [1..7] :"); 
		try {
			angkainput = InputData.readLine();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		int Hari = Integer.valueOf(angkainput).intValue();
		switch(Hari) {
			case 1: System.out.println("Minggu"); break;
			case 2: System.out.println("Senin"); break;
			case 3: System.out.println("Selasa"); break;
			case 4: System.out.println("Rabu"); break;
			case 5: System.out.println("Kamis"); break;
			case 6: System.out.println("Jum'at"); break;
			case 7: System.out.println("Sabtu"); break;

			default : System.out.println("Kode  hari yang anda masukan salah");
		}
	}
}

