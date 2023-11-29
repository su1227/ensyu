import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1人目の身長を入力してください。");
        double height1 = scanner.nextDouble();

        System.out.println("1人目の体重を入力してください。");
        double weight1 = scanner.nextDouble();
        double BMI1 = weight1 / (height1 * height1);

        System.out.println("1人目のBMIは: " + String.format("%.2f", BMI1) + "です。");


        System.out.println("2人目の身長を入力してください。");
        double height2 = scanner.nextDouble();

        System.out.println("2人目の体重を入力してください。");
        double weight2 = scanner.nextDouble();
        double BMI2 = weight2 / (height2 * height2);

        System.out.println("2人目のBMIは: " + String.format("%.2f", BMI2) + "です。");
    }
}
