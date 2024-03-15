package Java0315.example;

import java.util.Arrays;

public class example {
    static void bubble(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
