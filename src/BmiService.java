public class BmiService {

    public double calculate (double a, double b) {
        double result = a / ((b / 100) * (b / 100));
        return result;
    }
}
