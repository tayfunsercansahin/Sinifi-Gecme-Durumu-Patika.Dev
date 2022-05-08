import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, dersSayisi = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        if (mat<=100 && mat>=0){
            dersSayisi++;
        }
        else {
            mat = 0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        if (fizik<=100 && fizik>=0){
            dersSayisi++;
        }
        else {
            fizik = 0;
        }

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        if (turkce<=100 && turkce>=0){
            dersSayisi++;
        }
        else {
            turkce = 0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        if (kimya<=100 && kimya>=0){
            dersSayisi++;
        }
        else {
            kimya = 0;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (muzik<=100 && muzik>=0){
            dersSayisi++;
        }
        else {
            muzik = 0;
        }

        average = (mat + fizik + turkce + kimya + muzik) / dersSayisi;

        if (average <= 55){
            System.out.println("Sinifta kaldiniz, seneye gorusmek uzere...");
        }
        else{
            System.out.println("Tebrikler, sinifi gectiniz!");
        }

        System.out.println("Ortalamaniz: " + average);

    }
}
