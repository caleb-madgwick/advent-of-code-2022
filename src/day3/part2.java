package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day3/input.txt"));
            int total = 0;
            while (sc.hasNextLine())
            {
                String line0 = sc.nextLine();
                String line1 = sc.nextLine();
                String line2 = sc.nextLine();

                char common = 0;
                HashSet<Character> set0 = new HashSet<>();
                HashSet<Character> set1 = new HashSet<>();
                for (int i = 0; i < line0.length(); i++){
                    char c = line0.charAt(i);
                    set0.add(c);
                }
                for (int i = 0; i < line1.length(); i++){
                    char c = line1.charAt(i);
                    set1.add(c);
                }

                for (int i = 0; i < line2.length(); i++){
                    char c = line2.charAt(i);
                    if(set0.contains(c) && set1.contains(c)){
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
