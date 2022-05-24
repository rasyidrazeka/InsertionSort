package insertionsorttest;
import java.util.Scanner;
public class insertionSortTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukkan banyak data yang ingin diinputkan: ");
        int banyakData = sc.nextInt();
        int[] a = new int[banyakData];
        for(int i=0; i<banyakData; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        //int a[] = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        insertion urut = new insertion(a, banyakData);
        System.out.println("============================================");
        System.out.println("Data sebelum urut");
        urut.tampilData();
        System.out.println("Data sesudah urut (ASC)");
        urut.insertionSort();
        urut.tampilData();
    }
}