package MiniAtmProject;



import java.util.Scanner;

public class Atm {
public Atm() {
}

public void calis(Hesap hesap) {
   Login login1 = new Login();
   Scanner scanner = new Scanner(System.in);
   System.out.println("hosgeldiniz");
   System.out.println("*******************");
   System.out.println("kulanici girisi");
   System.out.println("*******************");
   int girisHaki = 3;

   while(!login1.giris(hesap)) {
      System.out.println("giris basarisiz");
      --girisHaki;
      System.out.println("giris hakiniz" + girisHaki);
      if (girisHaki == 0) {
         System.out.println("hakkiniz bitti");
         return;
      }
   }

   System.out.println("giris basarili");
   System.out.println("*********************");
   String islemler = "1. bakiye g\u00f6rme\n2. para yatirma\n3. para cekme\n cikis icin q'ya basin";
   System.out.println(islemler);
   System.out.println("********************");

   while(true) {
      System.out.println("islem seciniz");
      String islem = scanner.nextLine();
      if (islem.equals("q")) {
         return;
      }

      if (islem.equals("1")) {
         System.out.println("bakyeniz = " + hesap.getBakiye());
      } else {
         int tutar;
         if (islem.equals("2")) {
            System.out.println("yatirmak istediginiz tutari girin");
            tutar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraYatir(tutar);
         } else if (islem.equals("3")) {
            System.out.println("cekmek istediginiz tutari girin");
            tutar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraCek(tutar);
         }
      }
   }
}
}

