package ru.tshadrin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )
    {
        LeftRedBlackTree tree = new LeftRedBlackTree();
        tree.insert(5, "Five");
        tree.insert(10, "Ten");
        tree.insert(15, "Fifteen");
        tree.insert(20, "Twenty");
        tree.insert(25, "Twenty-Five");
        final RedBlackTree<Integer> redBlackTree = new RedBlackTree<>(Integer::compareTo);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    Integer value = Integer.parseInt(reader.readLine());
                    redBlackTree.add(value);
                    System.out.println("finish");
                } catch (NumberFormatException exception) {
                    return;
                }
            }
        } catch (IOException ignored) {
        }
    }
}
