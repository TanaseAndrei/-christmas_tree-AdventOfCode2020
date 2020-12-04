import utils.AOCUtils;
import static utils.AOCUtils.print;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4Problem2Of2 {
    public static boolean isValid(List<String> data) {

        boolean byr = false;
        boolean iyr = false;
        boolean eyr = false;
        boolean hgt = false;
        boolean hcl = false;
        boolean ecl = false;
        boolean pid = false;

        for (String line : data) {
            List<String> pair = Arrays.asList(line.split(" "));

            for (String currentPair : pair) {
                String[] splittedPair = currentPair.split(":");
                switch (splittedPair[0]) {
                    case "byr": {
                        int year = Integer.parseInt(splittedPair[1]);
                        if (year >= 1920 && year <= 2002) {
                            byr = true;
                        }
                    }
                    break;
                    case "iyr": {
                        int year = Integer.parseInt(splittedPair[1]);
                        if (year >= 2010 && year <= 2020) {
                            iyr = true;
                        }
                    }
                    break;
                    case "eyr": {
                        int year = Integer.parseInt(splittedPair[1]);
                        if (year >= 2020 && year <= 2030) {
                            eyr = true;
                        }
                    }
                    break;
                    case "hgt":
                        if (splittedPair[1].contains("cm")) {
                            String[] splittedValue = splittedPair[1].split("cm");
                            int height = Integer.parseInt(splittedValue[0]);
                            if (height >= 150 && height <= 193) {
                                hgt = true;
                            }
                        } else if (splittedPair[1].contains("in")) {
                            String[] splittedValue = splittedPair[1].split("in");
                            int height = Integer.parseInt(splittedValue[0]);
                            if (height >= 59 && height <= 76) {
                                hgt = true;
                            }
                        }
                        break;
                    case "hcl":
                        if (splittedPair[1].matches("#[a-f0-9]{6}")) {
                            hcl = true;
                        }
                        break;
                    case "ecl":
                        List<String> listOfColors = List.of("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
                        if (listOfColors.contains(splittedPair[1])) {
                            ecl = true;
                        }
                        break;
                    case "pid":
                        if (splittedPair[1].matches("[0-9]{9}")) {
                            pid = true;
                        }
                        break;
                }
            }
        }

        return byr && iyr && eyr && hgt && hcl && ecl && pid;
    }

    public static void main(String[] args) {
        int numberOfValidPassports = 0;
        List<String> listOfLines = AOCUtils.getInputAsStrings("Day4.2Input");
        List<String> passportData = new ArrayList<>();

        for (int i = 0; i < listOfLines.size(); i++) {
            String currentLine = listOfLines.get(i);
            if (!currentLine.isBlank()) {
                passportData.add(currentLine);
            } else if (currentLine.isBlank()) {
                if (isValid(passportData)) {
                    numberOfValidPassports++;
                }
                passportData = new ArrayList<>();
            }
        }

        print(numberOfValidPassports);
    }
}

