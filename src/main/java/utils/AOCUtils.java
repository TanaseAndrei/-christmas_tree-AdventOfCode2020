package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AOCUtils {
    public static List<String> getInputAsStrings(String fileName){
        String path = AOCUtils.class.getClassLoader().getResource(fileName).getFile();
        List<String> listOfRows = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader;
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                listOfRows.add(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return listOfRows;
    }

    public static List<Integer> getInputAsIntegers(String fileName){
        String path = AOCUtils.class.getClassLoader().getResource(fileName).getFile();
        List<Integer> listOfRows = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader;
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                listOfRows.add(Integer.parseInt(line));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return listOfRows;
    }

    public static String[] split(String value, String regex){
        return value.split(regex);
    }

    public static void print(Object line){
        System.out.println(line);
    }

    public static Set<Character> getAlphabet(){
        Set<Character> setOfCharacter = new HashSet<>();
        for(int i = 97; i < (97 - 65) ; i++){
            setOfCharacter.add((char)i);
        }

        return setOfCharacter;
    }
}
