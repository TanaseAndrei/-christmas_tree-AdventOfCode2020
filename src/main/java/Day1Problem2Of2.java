import utils.AOCUtils;
import static utils.AOCUtils.print;
import java.util.List;

public class Day1Problem2Of2 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = AOCUtils.getInputAsIntegers("Day2.2Input");

        for(int iterator1 = 0; iterator1 < listOfNumbers.size(); iterator1++){
            Integer number1 = listOfNumbers.get(iterator1);
            for(int iterator2 = 0; iterator2 < listOfNumbers.size(); iterator2++){
                Integer number2 = listOfNumbers.get(iterator2);
                for(int iterator3 = 0; iterator3 < listOfNumbers.size(); iterator3++){
                    Integer number3 = listOfNumbers.get(iterator3);
                    if(number1 + number2 + number3 == 2020){
                        print(number1 * number2 * number3);
                    }
                }
            }
        }
    }
}
