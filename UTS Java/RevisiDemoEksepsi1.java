public class RevisiDemoEksepsi1 {
    public static void main(String[]args) {
        int [] arr = new int[1];
        try{
            System.out.println(arr[1]);
          }  catch(Exception e) {
                e.printStackTrace();

            }
            System.out.println("Menampilkan array index ke-1");
        
    }
}
