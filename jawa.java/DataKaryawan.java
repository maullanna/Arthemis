public class DataKaryawan {
    public String nama;
    private double gaji;
    private String alamat;
    private double cicilan;
    private String posisi;

    public DataKaryawan(String namaKaryawan) {
        nama = namaKaryawan;
    }

    public void aturAlamat(String alamatKaryawan) {
        alamat = alamatKaryawan;
    }

    public void aturGaji(double gajiKaryawan) {
        gaji = gajiKaryawan;
    }

    public void aturCicilan(double cicilanKaryawan) {
        cicilan = cicilanKaryawan;
    }

    public void aturPosisi(String posisiKaryawan) {
        posisi = posisiKaryawan;
    }

    public void tampilKaryawan() {
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Posisi karyawan: " + posisi);
        System.out.println("Alamat karyawan: " + alamat);
        System.out.println("Gaji karyawan: " + gaji);
        System.out.println("Cicilan karyawan: " + cicilan);
    }

    public static void main(String args[]) {
        DataKaryawan karSatu = new DataKaryawan("Yusuf Maulana");
        karSatu.aturAlamat("Jl. Contoh No. 123");
        karSatu.aturGaji(100000);
        karSatu.aturCicilan(5000);
        karSatu.aturPosisi("Manager");
        karSatu.tampilKaryawan();
    }
}
