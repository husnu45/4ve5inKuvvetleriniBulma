import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Please Enter a Number : ");

        int number = getNumber.nextInt(); // Kullanıcı Sayı Girişi

        for (int i = 1; i <= number; i*=4){   // 4'ün Kuvvetleri

            System.out.println("4'ün Kuvvetleri : " + i);

        }

        for (int k = 1; k <= number; k*=5){  // 5'in Kuvvetleri

            System.out.println("5'in Kuvvetleri : " + k);

        }

    }

}
