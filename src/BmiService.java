public class BmiService {
    public int calculate(int weightInKg, double hightInMeters) {
        double index;
        index = weightInKg / hightInMeters / hightInMeters;
        return (int) index;
    }

}
