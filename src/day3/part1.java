package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day3/input.txt"));
            int total = 0;
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();

                int mid = line.length() / 2;
                String[] parts = {line.substring(0, mid),line.substring(mid)};

                String ruck0 = parts[0];
                String ruck1 = parts[1];
                char common = 0;
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < ruck0.length(); i++){
                    char c = ruck0.charAt(i);
                    set.add(c);
                }
                for (int i = 0; i < ruck1.length(); i++){
                    char c = ruck1.charAt(i);
                    if(set.contains(c)){
                        common = c;
                        break;
                    }
                }
                int intval = Character.toLowerCase(common) - 'a' + 1;
                if(Character.isUpperCase(common)){
                    intval+=26;
                }

                total+=intval;
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
