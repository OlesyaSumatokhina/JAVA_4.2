public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 76;
        double hightInMeters = 1.7;
        int bmi = service.calculate(76, 1.7);
        System.out.println(bmi);
    }
}
