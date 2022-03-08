package j6_istisna_java_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class j2_java_io {
	public static void main(String[] args) {

		dosyayaYaz();

		dosyadanOku();

	}

	private static void dosyadanOku() {
		// TODO Auto-generated method stub
		DataInputStream dataInputStream = null;

		try {
			dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));
			Ogrenci okunanOgr1;
			Ogrenci okunanOgr2;
			try {
				int id = dataInputStream.readInt();
				String isim = dataInputStream.readUTF();
				okunanOgr1 = new Ogrenci(id, isim);
				System.out.println("Oğrenic 1: " + okunanOgr1);

				int id2 = dataInputStream.readInt();
				String isim2 = dataInputStream.readUTF();
				okunanOgr2 = new Ogrenci(id2, isim2);
				System.out.println("Oğrenic 2: " + okunanOgr2);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void dosyayaYaz() {
		// TODO Auto-generated method stub
		DataOutputStream dataOutputStream = null;

		Ogrenci ogr1 = new Ogrenci(1, "Özgür");
		Ogrenci ogr2 = new Ogrenci(2, "Hasan");

		try {
			try {
				dataOutputStream = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")));

				dataOutputStream.writeInt(ogr1.getId());
				dataOutputStream.writeUTF(ogr1.getIsim());

				dataOutputStream.writeInt(ogr2.getId());
				dataOutputStream.writeUTF(ogr2.getIsim());

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (dataOutputStream != null) {
					try {
						dataOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Ogrenci {
	private int id;
	private String isim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Ogrenci(int id, String isim) {
		setId(id);
		setIsim(isim);
	}
}
