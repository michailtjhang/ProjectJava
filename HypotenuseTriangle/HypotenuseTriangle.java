import java.util.Scanner;
public class HypotenuseTriangle {

    public static void main(String[] args) {
        //menggunakan libary scanner untuk memasukkan input
        Scanner input = new Scanner(System.in);
        
        //definisi variabel dan tipe data
        double a, b, c;
        
        //input bilangan
        System.out.print("Masukkan panjang: ");
        a = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        b = input.nextDouble();
        
        //rumus hipotenusa
        // c akar dari a pangkat 2 di tambah b pangkat 2
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        //print hasil perhitungan
        System.out.println("Hipotenusa : " + c);
    }
}
