import java.util.Scanner;
public class Daire {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        //değişkenlerimi tanımladım
        int r,a;
        double pi = 3.14;
        //kullanıcıdan değerleri aldım
        System.out.print("YARI ÇAPINI GİRİNİZ;" );
        r= inp.nextInt();
        System.out.print("A DEĞERİNİ GİRİNİZ:");
        a= inp.nextInt();
        //formülümü uyguladım
        double alan= pi*r*r*a/360;
        //sonucumu ekrana yazdırdımm
        System.out.print("DAİRE DİLMİ ALANI:"+alan);


    }
}

