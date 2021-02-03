package praktikum;
import java.util.Scanner;
public class Lingkaran {
    //atribut
    int radius;
    double a = 22, b = 7, phi = a/b, hasil;
    Scanner io = new Scanner(System.in);
    
    //sambutan
    void sambutan(){
        System.out.println("PROGRAM HITUNG LUAS LINGKARAN (phi = 22/7)");
    }
    //input 
    void input() {
        System.out.print("Masukkan panjang radius : ");
        radius = io.nextInt();
    }
    //hitung
    void hitung() {
        hasil = phi * radius * radius;
    }
    //output
    void output() {
        System.out.println("radius     : "+radius);
        System.out.println("Hasil luas : "+hasil);
        
    }
    
}
