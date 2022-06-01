package patikaodevleri;
import java.util.Scanner;
public class katsayi {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün katları : ");
        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
        System.out.println("5'in katları : ");
        for (int a = 1; a <= n; a *= 5){
            System.out.println(a);
        }
    }
}