public class Sample3_11 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setCar(1234, 20.5);
        car1.setCar(5678);
        car1.setCar(30.5);
    }

    // Car類別
    static class Car {
        private int num;
        private double gas;

        public void setCar(int n) {
            num = n;
            System.out.println("將車號設為" + num);
        }

        public void setCar(double g) {
            gas = g;
            System.out.println("將汽油量設為" + gas);
        }

        public void setCar(int n, double g) {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + ",汽油量設為" + gas);
        }
    }
}