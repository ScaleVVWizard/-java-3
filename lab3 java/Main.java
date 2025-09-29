public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Button ");
        Button button = new Button();
        button.click();
        button.click();
        button.click();

        System.out.println("Задание 2: Balance");
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        balance.result();
        
        balance.addRight(5);
        balance.result();
        
        balance.addRight(5);
        balance.result();

        System.out.println("Задание 3: Bell ");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        System.out.println("Задание 4: OddEvenSeparator ");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        
        System.out.print("Even numbers: ");
        separator.even();
        System.out.print("Odd numbers: ");
        separator.odd();

        System.out.println("Задание 5: Table ");
        Table table = new Table(3, 4);
        
        // Заполняем таблицу значениями
        int value = 1;
        for (int i = 0; i < table.rows(); i++) {
            for (int j = 0; j < table.cols(); j++) {
                table.setValue(i, j, value++);
            }
        }
        
        System.out.println("Table contents:");
        System.out.println(table.toString());
        
        System.out.println("Rows: " + table.rows());
        System.out.println("Columns: " + table.cols());
        System.out.println("Average: " + table.average());
        
        // Демонстрация getValue
        System.out.println("Value at (1,2): " + table.getValue(1, 2));
    }
}