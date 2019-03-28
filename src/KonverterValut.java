/**
 * @author Roman
 * this is converter usd, euro, rub to gryvna
 */

import java.util.Scanner;

public class KonverterValut {

    public static void main(String[] args) {
        float usd = 0;
        float euro = 0;
        float rub = 0;
        double summa_val = 0;
        Scanner scan = new Scanner(System.in);
        String value;
        try {
            System.out.println("Введіть валюту яку хочете конвертувати у наступному форматі: usd, euro, rub");
            value = scan.nextLine();

            System.out.println("Введіть кількість валюти якю хочете конветувати!");
            summa_val = scan.nextDouble();

            switch (value) {
                case "usd":
                    System.out.println("Введіть курс долара до гривні!");
                    usd = scan.nextFloat();
                    Convert(summa_val, usd);
                    break;
                case "euro":
                    System.out.println("Введіть курс євро до гривні!");
                    euro = scan.nextFloat();
                    Convert(summa_val, euro);
                    break;
                case "rub":
                    System.out.println("Введіть курс рубля до гривні!");
                    rub = scan.nextFloat();
                    Convert(summa_val, rub);
                    break;
                default:
                    System.out.println("Ви не ввели жодного значення валюти.");

            }
        } catch (Exception e) {
            System.out.println("Ви ввели не вірні дані" + e);
            return;
        }
    }

    public static void Convert(double a, float b) {
        double rezult = a * b;
        System.out.println("У вас є: " + rezult + " грн.");
    }

}