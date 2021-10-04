package SoalEncapsulation;

import java.util.*;
public class main {
	public static void main(String[] args) {
		String Name,kelas,prodi,Nim,grade=null;
		float tugas,uts,uas,value=0,endValue;
		Scanner keyboard =  new Scanner (System.in);
        TeoriEncapsulation objek = new TeoriEncapsulation();
        System.out.printf("Masukkan Nama Mahasiswa  : ");
        Name=keyboard.nextLine();
        objek.setNama(Name);
        System.out.printf("Masukkan NIM Mahasiswa   : ");
        Nim=keyboard.nextLine();
        objek.setNIM(Nim);
        System.out.printf("Masukkan Kelas Mahasiswa : ");
        kelas=keyboard.nextLine();
        objek.setKelas(kelas);
        System.out.printf("Masukkan Prodi Mahasiswa : ");
        prodi=keyboard.nextLine();
        objek.setProdi(prodi);
        System.out.printf("Masukkan Nilai Tugas     : ");
        tugas=keyboard.nextFloat();
        System.out.printf("Masukkan Nilai UTS       : ");
        uts=keyboard.nextFloat();
        System.out.printf("Masukkan Nilai UAS       : ");
        uas=keyboard.nextFloat();
        endValue=objek.getSum(tugas, uts, uas, value);
        grade=objek.setGrade(endValue, grade);
        
        System.out.println("===================================");
        System.out.println("      LAPORAN NILAI MAHASISWA      ");
        System.out.println("Nama         	 :"+objek.getNama());
        System.out.println("NIM              :"+objek.getNIM());
        System.out.println("Kelas            :"+objek.getKelas());
        System.out.println("Prodi            :"+objek.getProdi());
        System.out.println("Nilai Tugas      :"+tugas);
        System.out.println("Nilai UTS        :"+uts);
        System.out.println("Nilai UAS        :"+uas);
        System.out.println("Nilai Akhir      :"+endValue);
        System.out.println("Grade            :"+grade);
        System.out.println("===================================");
    }
}