package pkg4_programinput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isi;
        System.out.print("Masukan kata : ");
        
        Scanner input = new Scanner(System.in);
        
        isi = input.nextLine();
        
        System.out.println("Input = " + isi);
    }
    
}
