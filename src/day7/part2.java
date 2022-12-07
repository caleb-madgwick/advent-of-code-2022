package day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day7/input.txt"));

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
