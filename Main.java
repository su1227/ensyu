import java.util.Optional;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力してください。");
        double height = scanner.nextDouble();

        System.out.println("体重を入力してください。");
        double weight = scanner.nextDouble();
        double BMI = weight / (height*height);

        System.out.println(String.format("%.2f", BMI));

        System.out.println("身長を入力してください。");
        double height2 = scanner.nextDouble();

        System.out.println("体重を入力してください。");
        double weight2 = scanner.nextDouble();
        double BMI2 = weight / (height*height);

        System.out.println(String.format("%.2f", BMI2));
    }

}
