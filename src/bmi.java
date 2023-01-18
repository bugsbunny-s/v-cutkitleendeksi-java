import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        double boy,kilo,bmi,ideal;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        bmi = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz : " +bmi);
    }
}

       /*  if (bmi < 18.5){
            System.out.println("Zayıfsınız");
        }
        if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("Normal kilodasınız");
        }
        if (bmi == 25 && bmi <= 29.9)
        {
            System.out.println("Ideal kilodasınız ");
        }
        if (bmi >= 30)
        {
            System.out.println("Obezsiniz ");
        }
        */
  