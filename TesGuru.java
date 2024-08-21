//Driver Class

import java.util.Scanner;

public class TesGuru {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = scan.nextLine();
        System.out.println("Mata Pelajaran: ");
        String mapel = scan.nextLine();
        System.out.println("Alamat: ");
        String alamat = scan.nextLine();
        System.out.println("ID: ");
        int id = scan.nextInt();


        //Membuat objek 
        Guru a = new Guru(nama, mapel, alamat, id);
        Guru b = new Guru(nama, mapel, alamat, id);
        Guru c = new Guru(nama, mapel, alamat, id);
        Guru d = new Guru(nama, mapel, alamat, id);
        Guru e = new Guru(nama, mapel, alamat, id);
        Guru f = new Guru("Pak Munif", "PAI"
        , "Malang", 5);
        Guru g = new Guru(nama, mapel, alamat, id);

        a.nama = "Pak Ayat";
        a.mapel = "Informatika (UI/UX)";
        a.alamat = "Malang";
        a.id = 1;
        b.nama = "Pak Abi";
        b.mapel = "Matematika";
        b.alamat = "Malang";
        b.id = 2;
        c.nama = "Bu Aulia";
        c.mapel = "RPL";
        c.alamat = "Malang";
        c.id = 3;
        d.nama = "Bu Pasha";
        d.mapel = "RPL";
        d.alamat = "Malang";
        d.id = 4;
        e.nama = "Bu Feni";
        e.mapel = "Matematika";
        e.alamat = "Malang";
        e.id = 5;

        System.out.println("Data guru:");
        System.out.println("Guru pertama " + a.nama +  ",mapel " + a.mapel + ",alamat " + a.alamat + ",id " + a.id);
        System.out.println("Guru kedua " + b.nama + ",mapel " + b.mapel + ",alamat " + b.alamat + ",id " + b.id);
        System.out.println("Guru ketiga " + c.nama + ",mapel " + c.mapel + ",alamat " + c.alamat + ",id " + c.id);
        System.out.println("Guru keempat " + d.nama + ",mapel " + d.mapel + ",alamat " + d.alamat + ",id " + d.id);
        System.out.println("Guru kelima " + e.nama + ",mapel " + e.mapel + ",alamat " + e.alamat + ",id " + e.id);
        
        f.print();
        g.print();
    }
}
