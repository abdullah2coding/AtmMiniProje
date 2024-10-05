package MiniAtmProject;



import java.util.Scanner;

public class Login {
public Login() {
}

public boolean giris(Hesap hesap) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("kulanici adi girin");
   String userName = scanner.nextLine();
   System.out.println("kulanici parolasi girin");
   String parola = scanner.nextLine();
   return hesap.getUserName().equals(userName) && hesap.getParola().equals(parola);
}
}

