// Class PesanAc
public class pesanAc {
    private String pesan;

    // Konstruktor
    public pesanAc(String pesan) {
        this.pesan = pesan;
    }

    // Getter dan setter untuk pesan
    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    // Method untuk menampilkan pesan AC
    public void tampilkanPesan() {
        System.out.println("Pesan AC: " +pesan);
}
}
