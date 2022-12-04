package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day1/input.txt"));

            ArrayList<Integer> list = new ArrayList<>();
            int current = 0;
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.equals("")){
                    list.add(current);
                    current = 0;
                } else{
                    current+= Integer.parseInt(line);
                }

            }
            Collections.sort(list);
            System.out.println(list.get(list.size()-1));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
