package AdventOfCode2020.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParametersSetter {
    public static int[] parseArrayOfInteger(String path) throws FileNotFoundException {
        // Open the file
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        List<Integer> items = new ArrayList<>();
        while (scanner.hasNext()) {
            int number = Integer.parseInt(scanner.nextLine());
            items.add(number);
        }

        // Format the type
        int[] toReturn = new int[items.size()];
        int i = 0;
        for (int item:items) {
            toReturn[i] = item;
            i++;
        }

        return toReturn;
    }
}
