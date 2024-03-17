//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        double armutf=2.14;
        double elmaf=3.67;
        double domatesf=1.11;
        double muzf=0.95;
        double patlicanf=5;
        double toplam;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :" );
        armut = girdi.nextDouble();
        Scanner girdi2 = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo ? :" );
        elma = girdi2.nextDouble();
        Scanner girdi3 = new Scanner(System.in);
        System.out.print("Domates Kaç Kilo ? :" );
        domates = girdi3.nextDouble();
        Scanner girdi4 = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? :" );
        muz = girdi4.nextDouble();
        Scanner girdi5 = new Scanner(System.in);
        System.out.print("Patlıcan Kaç Kilo ? :" );
        patlican = girdi5.nextDouble();
        toplam =(armut*armutf)+(elma*elmaf)+(domates*domatesf)+(muz*muzf)+(patlican*patlicanf);
        System.out.print("Toplam Tutar : " +toplam );
    }
}