package academy.learnprogramming;

public class Challenge {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighsScorePosition("Lena", position);

        position = calculateHighScorePosition(900);
        displayHighsScorePosition("Joseph", position);

        position = calculateHighScorePosition(400);
        displayHighsScorePosition("Luiza", position);

        position = calculateHighScorePosition(10);
        displayHighsScorePosition("Levis", position);


    }

    public static void displayHighsScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
