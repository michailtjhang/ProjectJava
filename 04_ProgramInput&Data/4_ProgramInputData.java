package pkg4_programinputdata;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Tipe Data/Variabel
        String nama, alamat;
        int umur;
        
        //Input Data
        System.out.print("Nama \t: ");
        nama = input.nextLine();
        System.out.print("Alamat \t: ");
        alamat = input.nextLine();
        System.out.print("Umur \t: ");
        umur = input.nextInt();
        
        //output
        System.out.println("\n ===================");
        System.out.println(nama+" tinggal di "+alamat);
        System.out.println("Umur "+umur+" tahun");
    }
    
}
