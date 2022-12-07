package day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day7/input.txt"));


            sc.nextLine();
            Node root = new Node("/");
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.startsWith("$ ls")){
                    String input;
                    while(!((input = sc.nextLine()).startsWith("$"))){
                        root.add(new Node(input.split(" ")[1]));
                    }
                } else if(line.startsWith("$ cd")){

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Node
{
    String name;
    HashSet<Node> children;
    int value;

    public Node(String name)
    {
        this.name = name;
    }

    public void add(Node child) {
        children.add(child);
    }
}
