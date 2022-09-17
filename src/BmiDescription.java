public class BmiDescription {
    public static String descr(double val1) {
        String result;
        if (val1 > 0 && val1 < 16) {
            result = "выраженный дефицит второй степени";
        } else if (val1 >= 16 && val1 <= 18.5) {
            result = "недостаточная масса тела (дефицит)";
        } else if (val1 > 18.5 && val1 <= 25) {
            result = "нормальная масса тела";
        } else if (val1 > 25 && val1 <= 30) {
            result = "избыточная масса тела";
        } else if (val1 > 30) {
            result = "ожирение";
        } else {
            result = "неверно введены значения";
        }
        return result;
    }
}
