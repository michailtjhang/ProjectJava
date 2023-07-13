import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            System.out.print("Masukkan 5 angka: ");
            for (int i = 0; i < 5; i++) {
                int number = scanner.nextInt();
                numbers.add(number);
            }

            System.out.println("Angka-angka yang dimasukkan:");
            for (int number : numbers) {
                System.out.println(number);
            }
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan saat memasukkan input. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
    
}
