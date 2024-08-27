package pertemuan3;

public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek Nilai
        Nilai nilaiMahasiswa = new Nilai("2310631170132", "David Nicolas", 88.0, 90.0, 88.5, 91.0);
        
        // Memanggil method CetakNilai
        nilaiMahasiswa.CetakNilai();
    }
}