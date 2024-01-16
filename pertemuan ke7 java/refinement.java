public class refinement {
    class Hewan {
        void bersuara() {
            System.out.println("Hewan bersuara.");
        }
    }
    
    class Kucing extends Hewan {
        void bersuara() {
            System.out.println("Kucing bersuara: Meong-meong.");
}
    }
}
