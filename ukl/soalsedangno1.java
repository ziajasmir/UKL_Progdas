package ukl;

import java.util.Random;
import java.util.Scanner;
public class soalsedangno1 {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean lanjut = true;

        while (lanjut) {
            int bil1 = rand.nextInt(10) + 1;
            int bil2 = rand.nextInt(10) + 1;
            char[] operator = {'+', '-', '*', '/'};
            char oper = operator[rand.nextInt(operator.length)];

            System.out.print(bil1 + " " + oper + " " + bil2 + " = ");
            double jawaban = input.nextDouble();
            double hasil;

            switch (oper) {

                case '+':
                    hasil = bil1 + bil2;
                    break;
                case '-':
                    hasil = bil1 - bil2;
                    break;
                case '*':
                    hasil = bil1 * bil2;
                    break;
                case '/':
                    hasil = bil1 / (double) bil2;
                    break;
                case '^':
                    hasil = bil1 * bil1;
                    break;
                default:
                    hasil = 0;
            }

            if (jawaban == hasil) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + hasil);
            }

            System.out.print("Ingin melanjutkan kuis? (ya/tidak): ");
            lanjut = input.next().equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}
    





        
