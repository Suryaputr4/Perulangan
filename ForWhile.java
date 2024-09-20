import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Masukkan nilai awal: ");
        int NilaiAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        int NilaiAkhir = input.nextInt();
        System.out.print("Masukkan jeda: ");
        int InputJeda = input.nextInt();

        System.out.println(" ");
        System.out.println("Pilih metode penghitungan Aritmatika :");
        System.out.println("1. for loop");
        System.out.println("2. while loop");
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nMenggunakan for loop :");
                for (int i = NilaiAwal; i <= NilaiAkhir; i += InputJeda) {
                    System.out.print(i+" ");
                }
                break;

            case 2:
                System.out.println("\nMenggunakan while loop :");
                int i = NilaiAwal;
                while (i <= NilaiAkhir) {
                    System.out.print(i+" ");
                    i += InputJeda;
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}