import utils.AOCUtils;

import java.util.List;

public class Day2Problem1Of2 {
    public static void main(String[] args) {
        int numberOfValidPasswords = 0;
        List<String> listOfLines = AOCUtils.getInputAsStrings("Day2.1Input");
        for(String line : listOfLines){
            String[] splittedRowBySpace = line.split(" ");
            String[] splittedIntervals = splittedRowBySpace[0].split("-");
            String letter = splittedRowBySpace[1].substring(0,1);
            String password = splittedRowBySpace[2];
            int contor = 0;
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) == letter.charAt(0)){
                    contor++;
                }
            }
            if(contor >= Integer.parseInt(splittedIntervals[0]) && contor <= Integer.parseInt(splittedIntervals[1])){
                numberOfValidPasswords++;
            }
        }

        System.out.println(numberOfValidPasswords);
    }
}
