package AdventOfCode2020;

import AdventOfCode2020.utils.ParametersSetter;
import AdventOfCode2020.utils.PuzzleSolver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("--------------- Advent of Code 2020 ---------------");
        System.out.println("---------------------------------------------------\n");

        menu();
    }

    private static void menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("------------------ Puzzle Day n° ------------------");
        System.out.println("---------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n>");
        String choix = scanner.nextLine();

        switch (choix) {
            case "1":
                try {
                    int[] numbers = ParametersSetter.parseArrayOfInteger("initPuzzle/1.txt");
                    int r1 = PuzzleSolver.day1(numbers);

                    System.out.println("Result:" + r1);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(-1);
                }
                break;
            case "2":
                try {
                    int[] numbers = ParametersSetter.parseArrayOfInteger("initPuzzle/1.txt");
                    int r2 = PuzzleSolver.day2(numbers);

                    System.out.println("Result:" + r2);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(-1);
                }
                break;
            default:
                System.out.println("Can't match the choice then the program will stop !");
                System.exit(0);
        }

        menu();
    }
}
