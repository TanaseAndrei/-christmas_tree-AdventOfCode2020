import utils.AOCUtils;

import java.util.List;

public class Day3Problem1Of2 {

    private static char[][] arrayOfCharacters;

    public static int countTrees(int slopeX, int slopeY){
        int trees = 0;
        int pointerX = 0;
        int pointerY = 0;
        while(pointerY < arrayOfCharacters.length){
            if(arrayOfCharacters[pointerY][pointerX % arrayOfCharacters[0].length] == '#'){
                ++trees;
            }
            pointerX += slopeX;
            pointerY += slopeY;
        }

        return trees;
    }

    public static char[][] mapToBidimensionalArray(List<String> listOfRows){
        arrayOfCharacters = new char[listOfRows.size()][listOfRows.get(0).length()];
        for (int rowIterator = 0; rowIterator < listOfRows.size(); rowIterator++) {
            String line = listOfRows.get(rowIterator);
            for (int columnIterator = 0; columnIterator < line.length(); columnIterator++) {
                arrayOfCharacters[rowIterator][columnIterator] = line.charAt(columnIterator);
            }
        }

        return arrayOfCharacters;
    }

    public static void main(String[] args) {
        List<String> listOfLines = AOCUtils.getInputAsStrings("Day3.1Input");
        mapToBidimensionalArray(listOfLines);


        System.out.println(countTrees(1,1) * countTrees(3,1) * countTrees(5,1)
                         * countTrees(7,1) * countTrees(1,2));
    }
}
