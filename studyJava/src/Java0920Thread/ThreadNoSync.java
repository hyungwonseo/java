package Java0920Thread;

class MyData {
    int data = 3;
    public void plusData() {
        int myData = data;
        try {Thread.sleep(2000);} catch (InterruptedException e) {}
        data = myData + 1;
    }
}

class PlusThread implements Runnable {
    MyData myData;
    public PlusThread(MyData myData) {
        this.myData = myData;
    }
    @Override
    public void run() {
        myData.plusData();
        System.out.println("실행결과 : " + myData.data);
    }
}

public class ThreadNoSync {
    public static void main(String[] args) {
        MyData myData = new MyData();
        // 첫번째 쓰레드
        Runnable plusThread1 = new PlusThread(myData);
        Thread thread1 = new Thread(plusThread1);
        thread1.start();
        // 1초 슬립
        try { Thread.sleep(1000);} catch (InterruptedException e) {}
        // 두번째 쓰레드
        Runnable plusThread2 = new PlusThread(myData);
        Thread thread2 = new Thread(plusThread2);
        thread2.start();
    }
}
