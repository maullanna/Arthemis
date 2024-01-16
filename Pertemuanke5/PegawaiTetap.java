/**
 * Kelas untuk merepresentasikan Pegawai Tetap
 */
public class PegawaiTetap extends Pegawai {
    private int noPeg;
    private int kehadiran;
    private int gaji;
    private String nama;
    public final int tunjangan = 200000;

    public PegawaiTetap(int noPeg, String nama, int kehadiran, int gaji) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    public int getUangMakan() {
        return 6000 * kehadiran;
    }

    // Setter

    public void setNoPeg(int noPeg) {
        this.noPeg = noPeg;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public void lihatData() {
        System.out.println("No. Pegawai: " + noPeg);
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Uang Makan: " + getUangMakan());
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji: " + gaji);
    }

    @Override
    public void hitungGaji() {
        int gajiBersih = getUangMakan() + gaji;
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
