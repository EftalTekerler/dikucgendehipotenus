import java.util.Scanner;
public class hipotenus {
    public static void main(String[]args){
// Değişkenlerimizi oluşturalım
        int a,b ;
        double c ;
// Kullanıcıdan veriler alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz.");
        a = girdi.nextInt();
        System.out.println("ikinci kenarı giriniz");
        b = girdi.nextInt();
        c = Math.sqrt( (a*a)+ (b*b) );
        System.out.println(c);

    }
        };