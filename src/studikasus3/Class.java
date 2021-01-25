package studikasus3;
import java.util.Scanner;
public class Class {
    static void pembuka () {
        System.out.println("--------Program Kartu Pelajar--------");
    }
    static void isiTampil () {
        Scanner io = new Scanner(System.in);
        String nama, nis, kelas, ttl;
    
        System.out.print("Masukkan nama : ");
        nama = io.nextLine();
        System.out.print("Masukkan NIS  : ");
        nis = io.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = io.nextLine();
        System.out.print("Masukkan TTL   : ");
        ttl = io.nextLine();
        
        System.out.println("--------Kartu Pelajar--------");
        System.out.println("Nama    : "+nama);
        System.out.println("NIS     : "+nis);
        System.out.println("Kelas   : "+kelas);
        System.out.println("TTL     : "+ttl);
    }
    static void penutup () {
        System.out.println("--------Program Selesai--------");
    }
}
