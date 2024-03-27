package Java0327Example1;

public class Example1 {
    public static void main(String[] args) {

        // 문제 1. 아래 2차원 배열의 모든 값의 합과 평균을 구하시오
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        //float num = 0;
        for(int i=0; i < arr.length;i++) {
            for(int j=0; j < arr[i].length;j++) {
                total += arr[i][j];
            }
            //num = num + arr[i].length;
        }
        average = total /(float)(arr.length * arr[0].length);
        //average = total / num;
        System.out.println("total="+total); // 325
        System.out.println("average="+average); // 16.25
    }
}
