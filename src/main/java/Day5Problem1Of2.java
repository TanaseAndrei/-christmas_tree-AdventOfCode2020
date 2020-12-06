import utils.AOCUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.AOCUtils.print;

public class Day5Problem1Of2 {


    public static void main(String[] args) {
        int highestSeatId = 0;
        List<String> listOfRows = AOCUtils.getInputAsStrings("Day5.1Input");
        List<Integer> listOfIds = new ArrayList<>();
        for (String line : listOfRows) {
            int lowRow = 0;
            int highRow = 127;
            int lowColumn = 0;
            int highColumn = 7;
            int seatId = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                switch (c) {
                    case 'F':
                        highRow = (highRow + lowRow) / 2;
                        break;
                    case 'B':
                        lowRow = (highRow + lowRow + 1) / 2;
                        break;
                    case 'R':
                        lowColumn = (lowColumn + highColumn + 1) / 2;
                        break;
                    case 'L':
                        highColumn = (lowColumn + highColumn) / 2;
                        break;
                }
            }
            //part1
            seatId = highRow * 8 + highColumn;
            if (seatId > highestSeatId) {
                highestSeatId = seatId;
            }
//            print(highestSeatId);
            listOfIds.add(seatId);
        }

        Collections.sort(listOfIds);
        for(int i = 0; i < listOfIds.size() - 1; i++){
            if(listOfIds.get(i + 1) - listOfIds.get(i) == 2){
                print(listOfIds.get(i) + 1);
            }
        }

    }
}
