package ukl;
import java.util.Scanner;
public class soalmudahno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jarakmin = 100;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volumemin = 10;

        
        System.out.println("Masukkan nilai jarak tempuh");
        int jaraktempuh = input.nextInt();

        System.out.println("Masukkan nilai panjang paket");
        int p = input.nextInt();
    
        System.out.println("Masukkan nilai lebar paket");
        int l = input.nextInt();

        System.out.println("Masukkan nilai berat paket");
        int beratpaket = input.nextInt();
        
        System.out.println("Masukkan nilai tinggi paket");
        int t = input.nextInt();

        
        int volume = p*l*t;

        
        if (jaraktempuh <= jarakmin){
             
            int hargatotal = harga1 * beratpaket;
            
            if (volume > volumemin){
                
                int hargatotal3 = hargatotal + harga3;
                 
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal3);
                
            }else if (volume <= volumemin){
                
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal);
            }
        }else if (jaraktempuh > jarakmin){
        
            int hargatotal2 = harga2 * beratpaket;
        
            if (volume > volumemin){
                int hargatotal3 = hargatotal2 + harga3;
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal3);
            }else{
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal2);

            }


        
        
    }

    
}
}
