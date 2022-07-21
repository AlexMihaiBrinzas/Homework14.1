package com.fasttrack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        List<Quote> list=readQuote("file/quotes.txt");

        readFile();

    }


    public static void readFile() throws FileNotFoundException {
        System.out.println("--Reading whole files: ");
        Scanner scanner = new Scanner(new File("file", "quotes.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }
    public static List<Quote> readQuote(String filePath) throws IOException {
        List<Quote> list = new ArrayList<>();
        BufferedReader bufferedReader =new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) !=null) {
            list.add(fromLine(line));

        }
        return list;


    }

    private static Quote fromLine(String line) {
        String[] tokens = line.split(Pattern.quote("~"));

        return new Quote(tokens.);

    }



}
