package ukl;
 import java.util.Scanner;
    public class soalsulitno3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah elemen
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = scanner.nextInt();
        int[] bilangan = new int[elemen];

        // Meminta pengguna untuk memasukkan elemen array
        System.out.println("Masukkan " + elemen + " elemen:");
        for (int i = 0; i < elemen; i++) {
            bilangan[i] = scanner.nextInt();
        }

        int[] sekali = new int[bilangan.length]; // Array untuk menyimpan angka yang hanya muncul sekal
        int[] beberapaKali = new int[bilangan.length]; // Array untuk menyimpan angka yang muncul beberapa kali
        int indeks = 0;

        // Mencari elemen unik dan menghitung frekuensinya
        for (int i = 0; i < bilangan.length; i++) {
            boolean jawaban = false;

            for (int j = 0; j < indeks; j++) {
                if (bilangan[i] == sekali[j]) {
                    beberapaKali[j]++;
                    jawaban = true;
                    break;
                }

            }
            if (!jawaban) {
                sekali[indeks] = bilangan[i];
                beberapaKali[indeks] = 1;
                indeks++;
            }
        }

        // Menampilkan hasil
        for (int i = 0; i < indeks; i++) {
            System.out.println(sekali[i] + " muncul " + beberapaKali[i] + " kali");
        }
    }
    
}

