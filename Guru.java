//Object Class

public class Guru {
    String nama, mapel, alamat;
    int id;

    public Guru(){
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }

    public Guru(String nama, String mapel, String alamat, int id){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    public void print(){
        System.out.println("--------------------------------");
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Mata Pelajaran : " + mapel);
        System.out.println("Alamat : " + alamat);
        System.out.println("--------------------------------");
    }
}
