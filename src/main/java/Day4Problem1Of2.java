import utils.AOCUtils;
import java.util.ArrayList;
import java.util.List;
import static utils.AOCUtils.print;

public class Day4Problem1Of2 {

    public static boolean isValid(List<String> data) {
        boolean byr = false;
        boolean iyr = false;
        boolean eyr = false;
        boolean hgt = false;
        boolean hcl = false;
        boolean ecl = false;
        boolean pid = false;

        for (String line : data) {

            if (line.contains("byr")) {
                byr = true;
            }

            if (line.contains("iyr")) {
                iyr = true;
            }

            if (line.contains("eyr")) {
                eyr = true;
            }

            if (line.contains("hgt")) {
                hgt = true;
            }

            if (line.contains("hcl")) {
                hcl = true;
            }

            if (line.contains("ecl")) {
                ecl = true;
            }

            if (line.contains("pid")) {
                pid = true;
            }
        }

        return byr && iyr && eyr && hgt && hcl && ecl && pid;
    }

    public static void main(String[] args) {
        int numberOfValidPasswords = 0;
        List<String> listOfLines = AOCUtils.getInputAsStrings("Day4.1Input");
        List<String> passportData = new ArrayList<>();

        for (int i = 0; i < listOfLines.size(); i++) {
            String currentLine = listOfLines.get(i);
            if (!currentLine.isBlank()) {
                passportData.add(currentLine);
            } else if (currentLine.isBlank()) {
                if (isValid(passportData)) {
                    numberOfValidPasswords++;
                }
                passportData = new ArrayList<>();
            }
        }

        print(numberOfValidPasswords);
    }
}

