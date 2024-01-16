public class Mamalia {
    private String jenis;
    private int umur;

    public Mamalia(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }

    public void bernapas() {
        System.out.println("Mamalia bernapas.");
    }

    public void berkembangBiak() {
        System.out.println("Mamalia berkembang biak.");
    }

    public void info() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + umur + " tahun");
}
}
