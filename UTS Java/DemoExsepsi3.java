import java.io. *;
class DemoExsepsi3 {
  public static void main(String[] args) {
    try{
        File myFile = new File ("data.txt");
        myFile.createNewFile();
        System.out.println("Unta Sakit Perut");
        
    } catch(IOException e){
        System.out.println("Karena Belom Makan");
    }
       try{
        File myFile = new File ("data.txt");
        myFile.createNewFile();
        System.out.println("Di Larikan Kerumah Sakit");
  
   } catch(IOException e){
        System.out.println("Karena Belom Makan");
    }
  }
  }
  
