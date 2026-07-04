public class MinMax {

    public static void main (String[] args) {

        int[] scores = {12,34,55,76,11,33};

        int total = 0;

        for (int score : scores) {

            total += score;
        }

        System.out.println("Total : " + total);

        int maxScore = scores[0];

        for (int score : scores) {

            if (score > maxScore) {

                maxScore = score; 
            }
        }

        System.out.println("Max Score : " + maxScore);

        int minScore = scores[0];

        for (int score : scores) {

            if (score < minScore) {

                minScore = score;
            } 
        }

        System.out.println("Min Score : " + minScore);
    }
}
