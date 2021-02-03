package praktikum;
import java.util.Scanner;
public class Persegi {
    //atribut
    int panjang, lebar, luas;
    Scanner io = new Scanner(System.in);
    
    //sambutan
    void sambutan() {
        System.out.println("PROGRAM HITUNG LUAS PERSEGI");
    }
    //input
    void input() {
        System.out.print("Masukkan panjang : ");
        panjang = io.nextInt();
        System.out.print("Masukkan lebar   : ");
        lebar = io.nextInt();
    }
    //hitung
    void hitung() {
        luas = panjang * lebar;
    }
    //output
    void output() {
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
        System.out.println("Luas    : "+luas);
    }
}
