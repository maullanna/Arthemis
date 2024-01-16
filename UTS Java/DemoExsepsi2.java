import java.io.*;

public class DemoExsepsi2 {
    public static void main(String[] args) {
        try {
            File myFile = new File("Data.kita");
            
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
