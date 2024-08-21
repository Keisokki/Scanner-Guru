
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
        , "Malang", 6);
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
        
        a.print();
        b.print();
        c.print();
        d.print();
        e.print();
        f.print();
        g.print();
    }
}
