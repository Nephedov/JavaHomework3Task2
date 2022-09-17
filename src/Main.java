public class Main {
    public static void main(String[] args) {
        double weight = 90;
        double height = 160;
        BmiService bmi = new BmiService();
        double yourBmi = bmi.calculate(weight, height);

        BmiDescription description = new BmiDescription();
        String title = description.descr(yourBmi);

        System.out.println("У Вас " + title + ". Ваш ИМТ " + yourBmi);
    }
}
