package j6_istisna_java_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class j3_java_io {
	public static void main(String[] args) {

		dosyayaNesneYazdir();

		dosyadanNesneleriOku();

	}

	private static void dosyadanNesneleriOku() {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("ogrenciNesneleri.dat")))) {

			Student okunanNesne = (Student) objectInputStream.readObject();
			System.out.println(okunanNesne);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	private static void dosyayaNesneYazdir() {

		Student s1 = new Student(50, "Özgür");
		Student s2 = new Student(30, "Hasan");
		Student s3 = new Student(10, "Ali");
		Student s4 = new Student(20, "Veli");

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("ogrenciNesneleri.dat")))) {
			objectOutputStream.writeObject(s1);
			objectOutputStream.writeObject(s2);
			objectOutputStream.writeObject(s3);
			objectOutputStream.writeObject(s4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}

class Student implements Serializable {
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

	public Student(int id, String isim) {
		setId(id);
		setIsim(isim);
	}
}