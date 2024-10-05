package MiniAtmProject;



public class Hesap {
private String userName;
private String parola;
private int bakiye;

public Hesap(String userName, String parola, int bakiye) {
   this.userName = userName;
   this.parola = parola;
   this.bakiye = bakiye;
}

public String getUserName() {
   return this.userName;
}

public void setUserName(String userName) {
   this.userName = userName;
}

public String getParola() {
   return this.parola;
}

public void setParola(String parola) {
   this.parola = parola;
}

public int getBakiye() {
   return this.bakiye;
}

public void setBakiye(int bakiye) {
   this.bakiye = bakiye;
}

public void paraYatir(int tutar) {
   this.bakiye += tutar;
   System.out.println("yeni bakiye = " + this.bakiye);
}

public void paraCek(int tutar) {
   if (tutar > this.bakiye) {
      System.out.println("bakiye yetersiz");
   } else if (tutar > 1500) {
      System.out.println("en fazla 1500 cekebilirsiniz");
   } else {
      this.bakiye -= tutar;
      System.out.println("yeni bakiye = " + this.bakiye);
   }

}
}

