package pembayaranlistrik;
import java.util.Scanner;

public class PembayaranListrik {

    public static void main(String[] args) {
        //deklarasi
        int kwh;
        double total;
        double biaya;
        
        Scanner scanner = new Scanner(System.in);
        kwh = scanner.nextInt();
        
        if(kwh <= 450) {
        System.out.println("termasuk golongan C");
        biaya = 20000 + (kwh * 1000);
        System.out.println("biaya: + biaya");
     
        total = (biaya * 10/100) + biaya;
        System.out.println("total: + total");
        
        }else if (kwh <= 900) {
        System.out.println("temasuk golongan B");
        biaya = 35000 + (kwh * 25000);
        System.out.println("biaya: + biaya");
    
        total = (biaya * 15/100) + biaya;
        System.out.println("total: + total");  
        
        }else if (kwh <= 1200) {
        System.out.println("termasuk golongan A");
        biaya = 50000 + (kwh * 3000);
        System.out.println("biaya: + biaya");
                
        total = (biaya * 20/100) + biaya;
        System.out.println("total: + total");
                
}
    
            
            }
}
