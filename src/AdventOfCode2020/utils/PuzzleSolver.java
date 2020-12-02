package AdventOfCode2020.utils;

public class PuzzleSolver {

    // Which combinaison of 2 numbers equals 2020. Then return the multiplication of them
    public static int day1(int[] numbers) {
        int result = 0;

        int i = 0;
        int j = 0;
        while(i < numbers.length - 1) {
            j = i + 1;
            while(j < numbers.length) {
                if (numbers[i] + numbers[j] == 2020) {
                    result = numbers[i] * numbers[j];
                    i = numbers.length;
                    j = i;
                }
                else {
                    j++;
                }
            }
            i++;
        }

        return result;
    }

    // Which combinaison of 3 numbers equals 2020. Then return the multiplication of them
    public static int day2(int[] numbers) {
        int result = 0;

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < numbers.length - 2) {
            j = i + 1;
            while(j < numbers.length - 1) {
                k = j + 1;
                while(k < numbers.length) {
                    if (numbers[i] + numbers[j] + numbers[k] == 2020) {
                        result = numbers[i] * numbers[j] * numbers[k];
                        i = numbers.length;
                        j = i;
                        k = j;
                    }
                    else {
                        k++;
                    }
                }
                j++;
            }
            i++;
        }

        return result;
    }
}
