public class Main {
    //deskripsi variabel
    String name;
    int no_nim;
    
    //contructor nama dan nim
    public Main(String nama, int nim) {
        name = nama;
        no_nim = nim;
    }
    
    public static void main(String[] args) {
        //membuar object untuk memanggil constructor
        Main mhs1 = new Main("Budi", 123456);
        Main mhs2 = new Main("Ani", 234567);
        
        //output
        System.out.println("Nama: " + mhs1.name + ", Nim: " + mhs1.no_nim);
        System.out.println("Nama: " + mhs2.name + ", Nim: " + mhs2.no_nim);
    }
}
