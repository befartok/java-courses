
import java.util.Scanner;

//Класс запуска калькулятора с вводом пользователя
public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator Calc = new Calculator;
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("введите первый аргумент");
                String first = reader.next();
                System.out.println("введите второй аргумент");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Результат:" + calc.getResult());
                calc.clearResult();
                System.out.println("Выход: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();

        }
    }
}
