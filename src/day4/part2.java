package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class part2 {
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
                HashSet<Integer> list = new HashSet<>();
                for (int i = Integer.parseInt(pair0[0]); i <= Integer.parseInt(pair0[1]); i++) {
                    list.add(i);
                }
                for (int i = Integer.parseInt(pair1[0]); i <= Integer.parseInt(pair1[1]); i++) {
                    if(list.contains(i)){
                        total++;
                        break;
                    }
                }
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
