public class BmiDescription {
    public static String descr (double a) {
        String result;
        if (a > 0 && a < 16) {
            result = "выраженный дефицит второй степени";
        }
        else if (a >= 16 && a <= 18.5) {
            result = "недостаточная масса тела (дефицит)";
        }
        else if (a > 18.5 && a <= 25) {
            result = "нормальная масса тела";
        }
        else if (a > 25 && a <= 30) {
             result = "избыточная масса тела";
         }
        else if (a > 30) {
            result = "ожирение";
        }
        else {
             result = "неверно введены значения";
        }
         return result;
    }
}
