package peracabangan;
import java.util.Scanner;

public class Peracabangan {

    public static void main(String[] args) {
        String identitas = "Natasya Adelia / X RPL 2 / 24";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a < 5) System.out.println("nilai a kirang dari 5");
        
        System.out.println("\nIF.. 2");
        if(a == 5)
            System.out.println("nilai a sama dengan 5");
            
        System.out.println("nIF.. 3");
        if(a > 5) {
            System.out.println("isi variabel a : "+ a);
            System.out.println("nilai a lebih dari 5");
            
        System.out.println("\nIF.. ELSE..");
        if(a < 5) {
            System.out.println("isi varibel a : "+ a);
            System.out.println("nilai a kuranh dari 5");
        }else System.out.println("nilai a lebih dari atau sam dengan 5");
        
        System.out.println("\nIF..ELSE IF..ELSE..1");
        if(a < 5) {
            System.out.println("nilai a kurang dari 5");
        } else if(a == 5) {
            System.out.println("nilai sama dengan 5");
        } else
            System.out.println("nilai lebih dari 5");
        
        System.out.println("\nIF.. ELSE IF..ELSE.. 2");
        if(a < 2) {
            System.out.println("nilai kurang dari 2");
        } else if(a < 4) {
            System.out.println("nilai lebih dari 4");
        } else if(a < 6) {
            System.out.println("nilai kurang dari 6");
        } else if(a == 6) {
            System.out.println("nilai a sama dengan 6");
        } else {
            System.out.println("nilai lebih dari 6");
            
        System.out.println("\nNested IF");
        if(a < 7) {
            System.out.println("niali a kurang dari 7");
            if(a > 2)
                System.out.println("nilai a lebih 2");
            if(a < 4)
                System.out.println("niali kurang dari 4");
            
            System.out.println("\nSWITCH..CASE");
        switch(a) {
            case 1: System.out.println("nilai a => 1"); break;
            case 2: System.out.println("nilai a => 2"); break;
            case 3:
            case 4: System.out.println("nilai a => 3 atau 4"); break;
            case 5: System.out.println("nilai a => 5"); break;
            default: System.out.println("nilai a bukan antara 1-5");
                
        int nilai;
        System.out.println("\nNilai Anda ? ");
        nilai = scanner.nextInt();
                
        String grade = (nilai < 75) ?  "belum kompeten" : "kompeten";
        System.out.println(nilai + " => " + grade);
        }
        }
        }
        }
    }
    
}
