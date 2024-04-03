package Homeworks.HW02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyCar {
    String brand;
    String model;
    int year;
    String color;

    public MyCar() {
    }

    public MyCar(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" + brand + ", " + model + ", " + year + ", " + color + "]";
    }
}

class SimpleCarInfo {
    String model;
    String color;

    public SimpleCarInfo() {
    }

    public SimpleCarInfo(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " : " + color;
    }
}

public class Q4 {
    public static void main(String[] args) {
        String[] brands = {"Hyundai", "Ford", "Volvo", "BMW"};
        String[] models = {"Sonata", "Escape", "XC40", "X5"};
        int[] years = {2012, 1999, 2024, 2021};
        String[] colors = {"White", "Green", "Grey", "Black"};

        // 위의 정보를 이용하여 List<MyCar>자료형의 컬렉션을 리턴하는 메서드(makeList)를 정의하시오
        List<MyCar> carList = makeList(brands, models, years, colors);
        carList.stream().forEach(System.out::println);

        // 위에서 만든 List<MyCar>자료형의 컬렉션에서 필요한 정보만 사용하여
        // SimpleCarInfo[] 배열을 리턴하는 메서드(sendCarInfo)를 정의하시오
        SimpleCarInfo[] carArray = sendCarInfo(carList);
        System.out.println(Arrays.toString(carArray));
    }

    public static List<MyCar> makeList(String[] brands
            , String[] models, int[] years, String[] colors) {
        List<MyCar> myCarList = new ArrayList<>();

        // 여기 코드 작성 !!

        return myCarList;
    }

    public static SimpleCarInfo[] sendCarInfo(List<MyCar> carList) {
        SimpleCarInfo[] cars = new SimpleCarInfo[carList.size()];

        // 여기 코드 작성 !!

        return cars;
    }
}
