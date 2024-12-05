package ukl;

import java.util.Scanner;

public class soalsulitno1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        double[] nilai = new double[jumlahSiswa];
        double total = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / jumlahSiswa;
        System.out.println("Nilai rata-rata siswa adalah: " + rataRata);
        System.out.println("total nilai siswa adalah "+total);
    }

}
