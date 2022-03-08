package j6_istisna_java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class j4_java_io {
	public static void main(String[] args) {

		veriOku();
	}

	private static void veriOku() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("karakter.txt"))) {

			String s;
			while ((s = bufferedReader.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	private static void veriYaz() {
		try (BufferedWriter yazici = new BufferedWriter(new FileWriter("karakter.txt"))) {
			yazici.write("Merhaba");
			yazici.newLine();
			yazici.write("Hello world");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
