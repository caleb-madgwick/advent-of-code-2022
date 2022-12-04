package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class part2 {
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
                    case "X" -> total += 0;
                    case "Y" -> total += 3;
                    case "Z" -> total += 6;
                }

                switch (opponent) {
                    case "A":
                        switch (mine) {
                            case "X" -> total += 3;
                            case "Y" -> total += 1;
                            case "Z" -> total += 2;
                        }
                        break;
                    case "B":
                        switch (mine) {
                            case "X" -> total += 1;
                            case "Y" -> total += 2;
                            case "Z" -> total += 3;
                        }
                        break;
                    case "C":
                        switch (mine) {
                            case "X" -> total += 2;
                            case "Y" -> total += 3;
                            case "Z" -> total += 1;
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
