public class VariaberAndEscapeSquences {
    public static void main(String[] args) {
        //Tipe Data/Variabel
        
        //integer (int)
        int umur = 19;
        System.out.println("Umur = " + umur + " Tahun");
        
        //floating point (float)
        float berat = (float) 71.4;
        System.out.println("Berat = " + berat + " Kg");
        
        //double floating point (double)
        double tinggi = 1.73;
        System.out.println("Tinggi = " + tinggi + " m");
        
        //String/kalimat (String)
        String nama = "Michail";
        System.out.println("Nama = " + nama);
        
        //Karakter (char)
        char gender = 'L';
        System.out.println("Jenis Kelamin = " + gender);
        
        //Boolean (boolean)
        boolean sehat = true;
        System.out.println("Sehat = " + sehat + "\n\n");
        
        //Escape Squences (Aturan Baris/kalimat)
        
        /*
            \t -> tab
            \n -> new line (enter)
            \b -> backspace
            \" -> untuk munculin tanda petik (")
        */
        
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Umur \t\t= " + umur + " Tahun");
        System.out.println("Berat \t\t= " + berat + " Kg");
        System.out.println("Tinggi \t\t= " + tinggi + " m");
        System.out.println("Jenis Kelamin \t= " + gender);
        System.out.println("Sehat \t\t= " + sehat);
        System.out.println("Saya kucing \"meou\" saya kucing");
    }
    
}
