package level_3;

import java.util.HashSet;
import java.util.Set;

public class ExpressionN {
    public int solution(int N, int number) {
        int answer = 0;

        Set<Integer>[] numbers = new Set[9];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = new HashSet<>();
            numbers[i].add(makeInitNumber(N, i));
        }

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {

                for (Integer n1 : numbers[j]) {
                    for (Integer n2 : numbers[i - j]) {
                        numbers[i].add(n1 + n2);
                        numbers[i].add(n1 - n2);
                        numbers[i].add(n1*n2);
                        if (n2 != 0) {
                            numbers[i].add(n1/n2);
                        }
                    }
                }
            }

            if (numbers[i].contains(number)) {
                return i;
            }
        }

        return -1;
    }

    private int makeInitNumber(int n, int count) {
        int result = 0;
        for (int j = 0; j < count; j++) {
            result = result * 10 + n;
        }
        return result;
    }

    public static void main(String[] args) {
        ExpressionN expressionN = new ExpressionN();
        int N = 5;
        int number = 12;
        expressionN.solution(N, number);
    }
}
