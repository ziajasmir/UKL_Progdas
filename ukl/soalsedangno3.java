package ukl;


    import java.util.Scanner;
    public class soalsedangno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            System.out.println("Faktorial dari " + n + " adalah: " + hitungFaktorial(n));
        }
    }

    public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }
}

