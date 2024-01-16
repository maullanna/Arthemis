public class Kelinci extends Mamalia {
    private String warnaBulu;

    public Kelinci(String jenis, int umur, String warnaBulu) {
        super(jenis, umur);
        this.warnaBulu = warnaBulu;
    }

    public void loncat() {
        System.out.println("Kelinci meloncat.");
    }

    public void info() {
        super.info(); // Memanggil metode info dari kelas Mamalia
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    public static void main(String[] args) {
        Kelinci kelinci = new Kelinci("Kelinci Putih", 2, "Putih");
        kelinci.bernapas();
        kelinci.berkembangBiak();
        kelinci.loncat();
        kelinci.info();
}
}
