package ru.tshadrin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )
    {
        final RedBlackTree<Integer> tree = new RedBlackTree<>(Integer::compareTo);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    Integer value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (NumberFormatException exception) {
                    return;
                }
            }
        } catch (IOException ignored) {
        }
    }
}
