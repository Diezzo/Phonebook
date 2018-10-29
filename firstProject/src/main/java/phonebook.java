import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  phonebook {

    public static void main(String[] args) {

        Map<String, String> Book = new HashMap<String, String>();

        Book.put("59-57-43", "Suzuki");

        Book.put("45-69-21", "Mercedes");

        Book.put("74-89-96", "Ford");

        Book.put("32-63-54", "Mitsubishi");

        Integer i = 0;

        while (i < 5) {
            System.out.println("Введите команду: Добавить (add), Найти (find), Удалить (del), Показать список (list), Выйти из программы (exit)");

            Scanner scan = new Scanner(System.in);

            String function = scan.nextLine();

            if (function.equals("add")) {
                System.out.println("Введите номер(dd-dd-dd):");
                Scanner scan1 = new Scanner(System.in);
                String number1 = scan1.nextLine();
                System.out.println("Введите имя (Латинские буквы и символы, максимум 15):");
                Scanner scan2 = new Scanner(System.in);
                String name1 = scan2.nextLine();
                Book.put(number1, name1);
            } else if (function.equals("find")) {
                System.out.println("Введите номер(dd-dd-dd):");
                Scanner scan3 = new Scanner(System.in);
                String number2 = Book.get(scan3.nextLine());
                System.out.println(number2);
            } else if (function.equals("del")) {
                System.out.println("Введите номер(dd-dd-dd):");
                Scanner scan4 = new Scanner(System.in);
                String number3 = scan4.nextLine();
                Book.remove(number3);
            } else if (function.equals("list")) {

                for(Map.Entry<String, String> entry: Book.entrySet())
                    System.out.println(entry.getKey() + " - " + entry.getValue());

            } else if (function.equals("exit")) {
                System.out.println("До свидания!");
                i = 5;
            }

        }
    }
}