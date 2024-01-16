public class Katak {
    int umur;
    String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public String getNama() {
        return nama;
    }
    public String caraBergerak() {
        return "Melompat";
    }
}