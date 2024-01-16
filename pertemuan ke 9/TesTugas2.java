public class TesTugas2 {
    public static void main(String[] args) {
        Katak O1 = new Katak(5, "Froggy");
        Kecebong O2 = new Kecebong(2, "Junior Froggy", 10);

        System.out.println("Obyek  umur  nama          panjangEkor  caraBergerak");
        System.out.println("01    " + O1.getUmur() + "    " + O1.getNama() + "             " + "         " + O1.caraBergerak());
        System.out.println("02    " + O2.getUmur() + "    " + O2.getNama() + "             " + O2.getPanjangEkor() + "        " + O2.caraBergerak());
    }
}
