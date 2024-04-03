package Homeworks.HW02;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
    // isPowerOn의 값이 true면 false로, false면 true로 바꾼다

    }
    void volumeUp() {
    // volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.

    }
    void volumeDown() {
    // volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.

    }
    void channelUp() {
    // channel의 값을 1 증가시킨다.
    // channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL 바꾼다.

    }
    void channelDown() {
    // channel의 값을 1 감소시킨다.
    // channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.

    }
}

public class Q2 {
    public static void main(String[] args) {
        //  Tv 클래스를 위에 정의된 로직(=Logic)대로 MyTv의 메서드들을 완성하시오
        //  main 메서드를 실행하여 주석에 적힌 실행결과와 일치하는지 확인.
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // CH:100, VOL:0
        t.channelUp();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // CH:1, VOL:0
        t.volume = 50;
        t.channel = 10;
        t.channelDown();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // CH:9, VOL:51
    }
}
