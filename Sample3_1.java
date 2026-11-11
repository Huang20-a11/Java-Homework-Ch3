public class Sample3_1 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
    }

    // 將 Car 類別放在內部並加上 static
    static class Car {
        public Car() {
            // 建構子
            System.out.println("Car 物件已建立");
        }
    }
}