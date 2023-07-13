public class DateTest {
  	public static void main(String[] args) {

    		// Membuat objek dengan tanggal tertentu (misalnya 06/10/2023)
    		Date date1 = new Date(06, 10, 2023);

   		 // Menampilkan tanggal menggunakan method displayDate()
   		 date1.displayDate();

   		// Mengubah bulan menjadi Juli (07)
   		date1.setMonth(07);

   		// Mengambil nilai tahun, bulan, tanggal menggunakan method getYear() dan menampilkannya
     		System.out.println("\nTahun: " + date1.getYear());
                System.out.println("Bulan: " + date1.getMonth());
                System.out.println("Tanggal: " + date1.getDay());
  	}
}