public class replacement {
    class Kendaraan {
        void info() {
            System.out.println("Ini adalah kendaraan.");
        }
    }
    
    class Mobil extends Kendaraan {
        @Override
        void info() {
            System.out.println("Ini adalah mobil.");
        }
    }
}
