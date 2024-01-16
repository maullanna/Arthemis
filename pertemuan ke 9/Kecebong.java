public class Kecebong extends Katak {
    double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }
    public double getPanjangEkor() {
        return panjangEkor;
    }

    @Override
    public int getUmur() {
        return super.getUmur();
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String caraBergerak() {
        return "Berenang";
    }

}
