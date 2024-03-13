package Java0313;

import java.util.Scanner;

public class JavaExample3 {
    // 오른쪽으로 이동
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, last;

            last = arr[arr.length-1];  // 포인트 1
            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = last;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // 왼쪽으로 이동
//    public static void main(String[] args) {
//
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println("Original array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        for(int i = 0; i < n; i++){
//            int j, first;
//
//            first = arr[0];  // 포인트 1
//            for(j = 0; j < arr.length-1; j++){
//                arr[j] = arr[j+1];
//            }
//            arr[j] = first;  // 포인트 2
//        }
//        System.out.println();
//
//        for(int i = 0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
}
