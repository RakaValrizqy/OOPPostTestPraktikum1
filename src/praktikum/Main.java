package praktikum;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //objek
        Lingkaran bulet = new Lingkaran();
        Lingkaran2 o = new Lingkaran2();
        Persegi kotak = new Persegi();
        //variabel
        int jawab;
        Scanner io = new Scanner(System.in);
        String[] pilih = {"Lingkaran (22/7)","Lingkaran (3.14)","Persegi"};
        
        //awalan
        System.out.println("PROGRAM HITUNG LUAS BANGUN DATAR");
        //pilihan
        for (int i = 0; i < pilih.length; i++) {
            System.out.println(i+". "+pilih[i]);
        }
        System.out.print("Masukkan pilihan : ");
        jawab = io.nextInt();
        
        switch (jawab) {
            case 0 :
                bulet.sambutan();
                bulet.input();
                bulet.hitung();
                bulet.output();
                break;
            case 1 :
                o.sambutan();
                o.input();
                o.hitung();
                o.output();
                break;
            case 2 :
                kotak.sambutan();
                kotak.input();
                kotak.hitung();
                kotak.output();
                break;
        }
    }
    
}
