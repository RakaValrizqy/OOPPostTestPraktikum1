package praktikum;
import java.util.Scanner;
public class Lingkaran2 {
    //atribut
    int radius;
    double phi = 3.14, hasil;
    Scanner io = new Scanner (System.in);
    
    //sambutan
    void sambutan() {
        System.out.println("PROGRAM HITUNG LUAS LINGKARAN (phi = 3.14)");
    }
    //input
    void input() {
        System.out.print("Masukkan radius : ");
        radius = io.nextInt();
    }
    //hitung
    void hitung() {
        hasil = phi * radius * radius;
    }
    //output
    void output() {
        System.out.println("Radius     : "+radius);
        System.out.println("Hasil luas : "+hasil);
        
    }
}
