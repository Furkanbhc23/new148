package P02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        int a =128;
        int b =17;
        System.out.println("c=" + (a+b));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kullanıcı bilgilerinizi giriniz.");
        int sayı=scanner.nextInt();

        if (sayı%2==0) {
            System.out.println("Girdiginiz sayı cift sayıdır.");
        } else
            System.out.println("Girdiginiz sayı tektir.");
    }
}
