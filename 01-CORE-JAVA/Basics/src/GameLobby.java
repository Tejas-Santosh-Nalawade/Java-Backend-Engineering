public class GameLobby {
    public static void main(String[] args) {
        int playerAge = 18;
        int coins = 105;
        int entryFees = 5;
        boolean isBanned = false;

        int coinsAfterEntry = coins - entryFees;
        boolean hasEnoughCoin = coins >= entryFees;
        boolean isAdult = playerAge >= 18;

        boolean canPlayerEnter = isAdult && hasEnoughCoin && !isBanned;

        System.out.println(canPlayerEnter);

        double playerScore = 87.8;
        int roundedscore = (int)playerScore;
        System.out.println(roundedscore);

        int totalscore = roundedscore;
        double answer = totalscore;
        System.out.println(answer);

    }
}