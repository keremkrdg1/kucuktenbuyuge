import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        a = in.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = in.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        c = in.nextInt();

        if (a>b && a>c)
        {
            if (b>c)
            {
                System.out.println("1.sayı > 2.sayı > 3.sayı");
            } else
            {
                System.out.println("1.sayı > 3.sayı > 2.sayı");
            }
        }else if (b>a && b>c)
        {
            if (a>c)
            {
                System.out.println("2.sayı > 1.sayı > 3.sayı");
            }else
            {
                System.out.println("2.sayı > 3.sayı > 1.sayı");
            }
        }else
        {
            if (a>b)
            {
                System.out.println("3.sayı > 1.sayı > 2.sayı");
            }else
            {
                System.out.println("3.sayı > 2.sayı > 1.sayı");
            }
        }
    }
}





