public class Main {
    public static void main (String [] args) {
        double weight = 75;
        double height = 160;
        BmiService x = new BmiService();
        double yourBmi = x.calculate(weight, height);

        BmiDescription y = new BmiDescription();
        String title = y.descr(yourBmi);

        System.out.println("У Вас " + title + ". Ваш ИМТ " + yourBmi);
    }
}
