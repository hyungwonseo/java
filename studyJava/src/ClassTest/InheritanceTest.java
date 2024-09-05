package ClassTest;

class LuxuryCar extends Car {
    private String color;
    private String interiorMaterial;

    public LuxuryCar(String make, String model, int year, String color, String interiorMaterial) {
        super(make, model, year);
        this.color = color;
        this.interiorMaterial = interiorMaterial;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("컬러: " + color + ", 좌석시트: " + interiorMaterial);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        LuxuryCar myLuxuryCar = new LuxuryCar("BMW", "7 Series", 2024, "검정", "가죽");
        myLuxuryCar.displayInfo();
        //제조사: BMW, 모델: 7 Series, 연식: 2024
        //컬러: 검정, 좌석시트: 가죽
    }
}


