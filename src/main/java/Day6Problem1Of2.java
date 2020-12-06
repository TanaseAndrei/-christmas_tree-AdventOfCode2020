import com.google.common.collect.Sets;
import utils.AOCUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static utils.AOCUtils.print;

public class Day6Problem1Of2 {

    private static Set<Character> stringToCharacterSet(String answers){
        Set<Character> set = new HashSet<>();
        for(Character character : answers.toCharArray()){
            set.add(character);
        }

        return set;
    }

    public static int getNumberOfYesAnswers(List<String> listOfPersons){

        //used to take the first answers from the first group
        //later is used to keep the results between operations
        Set<Character> aux = stringToCharacterSet(listOfPersons.get(0));
        if(listOfPersons.size() == 1){
            return aux.size();
        } else {
            //used to save the current results
            Set<Character> set1 = new HashSet<>();
            for (int i = 1; i < listOfPersons.size(); i++) {
                set1 = stringToCharacterSet(listOfPersons.get(i));
                aux = Sets.intersection(set1,aux);
            }
        }

        return aux.size();
    }

    public static void main(String[] args) {
        int sumOfYes = 0;
        List<String> listOfRows = AOCUtils.getInputAsStrings("Day6.1Input");
        List<String> listOfAnswers = new ArrayList<>();
        for(String line : listOfRows){
            if(line.isBlank()){
                sumOfYes += getNumberOfYesAnswers(listOfAnswers);
                listOfAnswers = new ArrayList<>();
            } else {
                listOfAnswers.add(line);
            }
        }

        print(sumOfYes);
    }
}
