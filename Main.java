
package PemesanTiket;

public class Main {
     public static void main(String[] args){
        Pemesan pemesan1 = new Pemesan(
                "Adhit",
                "JL. Pattimura",
                123);
        Pemesan pemesan2 = new Pemesan(
                "Tono",
                "Jl. Argopuro",
                342);
        Pemesan pemesan3 = new Pemesan(
                "Tina",
                "Jl. Diponegoro",
                313);


        pemesan2.setJumlahPesanan(3);
        System.out.println("---Pemesan Tiket---");
        System.out.println("Nama Pemesan :" + pemesan2.NamaPemesan);
        System.out.println("Alamat Pemesan :" + pemesan2.AlamatPemesan);
        System.out.println("ID Pemesan :" + pemesan2.IdPemesan);
        System.out.println("Jumlah Pesanan :" + pemesan2.getJumlahPesanan());


        Film Naruto = new Film(
                "Boruto",
                "Anime",
                1234);

        Naruto.setHarga(30000);
        System.out.println("---Film---");
        System.out.println("Judul Film :" + Naruto.JudulFilm);
        System.out.println("Jenis FIlm :" + Naruto.JenisFilm);
        System.out.println("ID Film :" + Naruto.IdFilm);
        System.out.println("Harga Tiket :" + Naruto.getHarga());
        
class Pemesan {
    String NamaPemesan;
    String AlamatPemesan;
    int NoHP_Pemesan;
    int JumlahPesanan;
    int IdPemesan;
    String JenisKelamin;
    boolean isopen;

    public Pemesan(String Nama, String Alamat, int Nomor) {
        NamaPemesan = Nama;
        AlamatPemesan = Alamat;
        IdPemesan = Nomor;
    }
    public void setJumlahPesanan(int Jumlah){
        this.JumlahPesanan = Jumlah;
    }
    public int getJumlahPesanan(){
        return this.JumlahPesanan;
    }
}
class Film{
    String JudulFilm;
    String JenisFilm;
    int IdFilm;
    int JamTayang;
    int HargaTiket;

    public Film(String Judul, String Jenis, int Id){
        JudulFilm = Judul;
        JenisFilm = Jenis;
        IdFilm = Id;
    }
    public void setHarga(int HargaTiket){
        this.HargaTiket = HargaTiket;
    }
    public int getHarga(){
        return this.HargaTiket;
    }
}
     }
}

