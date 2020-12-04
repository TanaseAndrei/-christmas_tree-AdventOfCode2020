import utils.AOCUtils;
import static utils.AOCUtils.print;
import java.util.List;

public class Day1Problem1Of2 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = AOCUtils.getInputAsIntegers("Day1.1Input");

        for (int iterator1 = 0; iterator1 < listOfNumbers.size(); iterator1++) {
            Integer value1 = listOfNumbers.get(iterator1);
            for (Integer value2 : listOfNumbers) {
                if (value1 + value2 == 2020) {
                    print(value1 * value2);
                }
            }
        }
    }
}
