import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = scanner.nextInt();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        int[] arr1 = new int[arr.length + 1];
        int x = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i == pos) {
                arr1[i] = value;
                x = 1;
            } else {
                arr1[i] = arr[i - x];
            }
        }
        System.out.print("Old array: ");
        for (int i : arr) {
            System.out.print("\t");
            System.out.print(i);
        }
        System.out.print("\n");
        System.out.print("New array: ");
        for (int i : arr1) {
            System.out.print("\t");
            System.out.print(i);
        }
    }
}