import utils.AOCUtils;
import static utils.AOCUtils.print;
import java.util.List;

public class Day2Problem2Of2 {
    public static void main(String[] args) {
        int numberOfValidPasswords = 0;
        List<String> listOfLines = AOCUtils.getInputAsStrings("Day2.1Input");

        for (String line : listOfLines) {
            String[] splittedRowBySpace = line.split(" ");
            String[] splittedIntervals = splittedRowBySpace[0].split("-");
            String letter = splittedRowBySpace[1].substring(0, 1);
            String password = splittedRowBySpace[2];
            int low = Integer.parseInt(splittedIntervals[0]);
            int high = Integer.parseInt(splittedIntervals[1]);

            boolean firstOperand = password.charAt(low - 1) == letter.charAt(0)
                    && password.charAt(high - 1) != letter.charAt(0);
            boolean secondOperand = password.charAt(low - 1) != letter.charAt(0)
                    && password.charAt(high - 1) == letter.charAt(0);

            if(firstOperand ^ secondOperand){
                numberOfValidPasswords++;
            }
        }

        print(numberOfValidPasswords);
    }
}

