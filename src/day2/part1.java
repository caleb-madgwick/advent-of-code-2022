package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day2/input.txt"));
            int total = 0;
            while (sc.hasNextLine())
            {
                String[] line = sc.nextLine().split(" ");

                String opponent = line[0];
                String mine = line[1];

                switch (mine) {
                    case "X" -> total += 1;
                    case "Y" -> total += 2;
                    case "Z" -> total += 3;
                }

                switch (opponent) {
                    case "A":
                        if (mine.equals("X")) {
                            total += 3;
                        } else if (mine.equals("Y")) {
                            total += 6;
                        }
                        break;
                    case "B":
                        if (mine.equals("Y")) {
                            total += 3;
                        } else if (mine.equals("Z")) {
                            total += 6;
                        }
                        break;
                    case "C":
                        if (mine.equals("Z")) {
                            total += 3;
                        } else if (mine.equals("X")) {
                            total += 6;
                        }
                        break;
                }


            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
