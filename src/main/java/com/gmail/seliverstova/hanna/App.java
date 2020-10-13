package com.gmail.seliverstova.hanna;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        File file = new File("11.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        String nextLine = "";

        for (; nextLine.compareTo("exit") != 0;) {
            nextLine = sc.nextLine();
            if (nextLine.compareTo("exit") != 0) {
                sb.append(nextLine);
                sb.append(System.lineSeparator());
            }
        }

        saveTextToFile(sb.toString(), file);
        sc.close();
    }

    public static void saveTextToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
