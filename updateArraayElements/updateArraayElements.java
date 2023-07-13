public class updateArraayElements {
    public static void main(String[] args) {
        //Deskripsi dan inisiasi Variabel
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        
        //menampilkan array yang pertama
        System.out.print("Array sebelum diperbarui: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        updateArrayElements(myArray);
        
        //menampilkan array yang telah di ubah
        System.out.print("\n\nArray setelah diperbarui: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
    
    public static void updateArrayElements(int[] array) {
        //sebuah method math
        for (int i = 0; i < array.length; i++) {
            array[i] *=3;
       }
   }
}
