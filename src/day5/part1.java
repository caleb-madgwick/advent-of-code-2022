package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day5/input.txt"));

            ArrayList<List<String>> list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                list.add(new ArrayList<>());
            }

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(!line.startsWith("[")){
                    break;
                }

                for (int i = 0; i < 9; i++) {
                    if(i*4+3 <= line.length()) {
                        String block = line.substring(i * 4, i * 4 + 3);
                        if(!block.equals("   ")){
                            list.get(i).add(block);
                        }
                    }
                }

            }
            ArrayList<Stack<String>> stacks = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                stacks.add(new Stack<>());
            }

            for (int i = 0; i < list.size(); i++) {
                Collections.reverse(list.get(i));
                stacks.get(i).addAll(list.get(i));
            }

            sc.nextLine();
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] split = line.split(" ");
                int num_to_move = Integer.parseInt(split[1]);
                int from = Integer.parseInt(split[3])-1;
                int to = Integer.parseInt(split[5])-1;

                for (int i = 0; i < num_to_move; i++) {
                    if(!stacks.get(from).empty()) {
                        stacks.get(to).push(stacks.get(from).pop());
                    }
                }
            }

            for (int i = 0; i < stacks.size(); i++) {
                System.out.println(stacks.get(i));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
