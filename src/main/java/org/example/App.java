package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");

        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> arguments = new ArrayList<>();

        //поиск в массиве опций и аргументов
        for (int i=1; i< arr.length; i++) {
            if (arr[i].startsWith("-")) {
                options.add(arr[i]);
            } else {
                arguments.add(arr[i]);
            }
        }

        //строка опций
        StringBuilder optionsLine = new StringBuilder();
        for (String elem: options) {
            optionsLine.append(elem).append(" ");
        }

        //строка аргументов
        StringBuilder argumentsLine = new StringBuilder();
        for (String elem: arguments) {
            argumentsLine.append(elem).append(" ");
        }

        //поиск исполняемой команды
        switch (arr[0]) {
            case "cat":
                catCommand(optionsLine.toString(), argumentsLine.toString());
                break;
            case "ls":
                //lsCommand(optionsLine, argumentsLine);
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    //Команда Unix cat
    public static void catCommand(String optionsLine, String argumentsLine) {

        try {
            Process ps = new ProcessBuilder("cat ", optionsLine, argumentsLine).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Runtime.getRuntime().exec("cat " + optionsLine + argumentsLine);
    }

    //Команда Unix ls
    public static void lsCommand(String optionsLine, String argumentsLine) {
        try {
            Process ps = new ProcessBuilder("cat ", optionsLine, argumentsLine).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}