import utils.AOCUtils;

import java.util.List;

public class Day1Problem1Of2 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = AOCUtils.getInputAsIntegers("Day1.1Input");

        for(int iterator1 = 0; iterator1 < listOfNumbers.size(); iterator1++){
            Integer value1 = listOfNumbers.get(iterator1);
            for(int iterator2 = 0; iterator2 < listOfNumbers.size(); iterator2++){
                Integer value2 = listOfNumbers.get(iterator2);
                if(value1 + value2 == 2020){
                    System.out.println(value1 * value2);
                }
            }
        }
    }
}
