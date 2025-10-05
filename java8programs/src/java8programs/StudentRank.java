package java8programs;

import java.util.stream.IntStream;

public class StudentRank {

	static String[] students = {"Alex", "Chris", "Sam"};
    static int[] ranks = {3, 1, 2};
    
    public static String topRankStudent() {
        
        int minRank = IntStream.of(ranks).min().getAsInt();

        return IntStream.range(0, ranks.length)
                .filter(i -> ranks[i] == minRank)
                .mapToObj(i -> students[i])
                .findFirst()
                .orElse("No student found");
    }

    public static String bottomRankStudent() {

        int maxRank = IntStream.of(ranks).max().getAsInt();

        return IntStream.range(0, ranks.length)
                .filter(i -> ranks[i] == maxRank)
                .mapToObj(i -> students[i])
                .findFirst()
                .orElse("No student found");
    }

    public static void main(String[] args) {
        System.out.println("Top Rank Student    : " + topRankStudent());
        System.out.println("Bottom Rank Student : " + bottomRankStudent());
    }
}
