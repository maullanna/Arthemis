public class Subtype {
    // Superclass
    public class Hewan {
        public void makan() {
            System.out.println("Hewan sedang makan");
        }
    }

    // Subclass
    public class Kucing extends Hewan {
        public void tidur() {
            System.out.println("Kucing sedang tidur");
        }
    }

    public static void main(String[] args) {
        Subtype subtype = new Subtype();
        Hewan hewan = subtype.new Kucing(); // Kucing adalah subtype dari Hewan
        hewan.makan(); // OK, mengakses metode dari superclass
        if (hewan instanceof Subtype.Kucing) {
            Subtype.Kucing kucing = (Subtype.Kucing) hewan;
            kucing.tidur(); // OK, setelah casting
        }
    }
}
