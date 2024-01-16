public class cobapolymar {
    public static void main(String[] args) {
        MencetakData data = new MencetakData();

        System.out.print("Cetak Data Tipe String: ");
        data.cobacetak("Dki Jakarta");

        System.out.print("Cetak Data Tipe Integer: ");
        data.cobacetak(1992);

        System.out.print("Cetak Data Tipe Double: ");
        data.cobacetak(16.5 / 2);

        System.out.print("Cetak Data Tipe Double: ");
        data.cobacetak('N');
    }
}
