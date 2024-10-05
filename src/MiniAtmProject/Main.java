package MiniAtmProject;


import java.util.Scanner;

public class Main {

    
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
              Atm atm1 = new Atm();
              
              Hesap hesap =new Hesap("abdullah","123123",2000);
        atm1.calis(hesap);
        System.out.println("programdan cikiliyor");

        
        
    }
    
}
