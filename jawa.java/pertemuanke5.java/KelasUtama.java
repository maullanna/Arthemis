/**
 *
 * @author yusuf mualana
 */
import java.io.*;
public class KelasUtama {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Pegawai pg;
        PegawaiKontrak pk = new PegawaiKontrak(0, "", "", 0, 0);
        PegawaiTetap pt = new PegawaiTetap(0, "", 0, 0);
        
        while(true){
            System.out.println("MENU UTAMA");
            System.out.println("=====================");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");

            int pilih1 = 0;
            int pilih2 = 0;
            try{
                System.out.print("Masukkan pilihan [1]/[2]/[3] : ");
                pilih1 = Integer.parseInt(br.readLine());

                if(pilih1==1){
                    System.out.println("1. Pegawai Kontrak");
                    System.out.println("2. Pegawai Tetap");
                    System.out.print("Masukkan pilihan [1]/[2] : ");
                    pilih2 = Integer.parseInt(br.readLine());

                    if(pilih2==1){
                        System.out.print("Input no. pegawai kontrak : ");
                        int no = Integer.parseInt(br.readLine());
                        System.out.print("Input nama pegawai kontrak : ");
                        String nama = br.readLine();
                        System.out.print("Input masa kontrak : ");
                        String masa = br.readLine();
                        System.out.print("Input kehadiran : ");
                        int hadir = Integer.parseInt(br.readLine());
                        System.out.print("Input gaji : ");
                        int gaji = Integer.parseInt(br.readLine());
                        
                        pk = new PegawaiKontrak(no, nama, masa, hadir, gaji);
                        System.out.println("=====DATA TERSIMPAN=====\n");
                    }
                    System.out.print("Masukkan pilihan [1]/[2] : ");
                    pilih2 = Integer.parseInt(br.readLine());

                    if(pilih2==2){
                        System.out.print("Input no. pegawai tetap : ");
                        int no = Integer.parseInt(br.readLine());
                        System.out.print("Input nama pegawai tetap : ");
                        String nama = br.readLine();
                        System.out.print("Input kehadiran : ");
                        int hadir = Integer.parseInt(br.readLine());
                        System.out.print("Input gaji : ");
                        int gaji = Integer.parseInt(br.readLine());
                        
                        pt = new PegawaiTetap(no, nama, hadir, gaji);
                        System.out.println("=====DATA TERSIMPAN=====\n");
                    }
                }else if(pilih1==2){
                    System.out.println("===DATA PEGAWAI KONTRAK===");
                    pg = pk;
                    pg.lihatData();
                    pg.hitungGaji();
                    System.out.println("===DATA PEGAWAI TETAP===");
                    pg = pt;
                    pg.lihatData();
                    pg.hitungGaji();
                }else{
                    System.exit(0);
                }
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}