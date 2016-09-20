package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // write your code here
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufwriter = new BufferedWriter(writer);

        bufwriter.write("Hello\n");
        bufwriter.write("Data here\n");
        bufwriter.write("Goodbye\n");
        bufwriter.close();
    }
}