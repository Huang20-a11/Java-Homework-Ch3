public class Sample3_8 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + ",汽油量是" + gasoline);
    }

    // Car類別
    static class Car {
        int num;
        double gas;

        int getNum() {
            System.out.println("調查車號");
            return num;
        }

        double getGas() {
            System.out.println("調查汽油量");
            return gas;
        }
    }
}