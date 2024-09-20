import java.util.Scanner;

public class Faktorial {
      public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            int angka, temp=1;
            System.out.print("Masukkan angka : ");
            angka = s.nextInt();

            for (int i = angka; i >= 1; i--) {
                  System.out.print(i);
                  if (i > 1) {
                  System.out.print(" x ");
                  }
                  temp *= i;
            }
            System.out.println();
            System.out.print("Faktori = "+temp);
      }
}