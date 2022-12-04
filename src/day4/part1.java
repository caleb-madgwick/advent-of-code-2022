package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day4/input.txt"));
            int total = 0;

            while (sc.hasNextLine())
            {

                String line = sc.nextLine();
                String[] pairs = line.split(",");

                String[] pair0 = pairs[0].split("-");
                String[] pair1 = pairs[1].split("-");

                if(Integer.parseInt(pair0[0])<=Integer.parseInt(pair1[0]) && Integer.parseInt(pair1[1]) <= Integer.parseInt(pair0[1])){
                    total++;
                } else if(Integer.parseInt(pair1[0])<=Integer.parseInt(pair0[0]) && Integer.parseInt(pair0[1]) <= Integer.parseInt(pair1[1])){
                    total++;

                }
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
