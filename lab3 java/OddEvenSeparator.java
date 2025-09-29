import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> numbers;

    public OddEvenSeparator() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void even() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println(evenNumbers);
    }

    public void odd() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);
    }
}