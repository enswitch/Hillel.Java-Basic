package homeworks.hm5;

public class CounterStrike {
    public static void main(String[] args) {

        String terrorist = "Terrorist Forces";

        int tMike = 7;
        int tPaul = 11;
        int tGreg = 13;
        int tLonzo = 5;
        int tJack = 2;
        double tAverageScore = (tMike + tPaul + tGreg + tLonzo + tJack) / 5.0;

        String counterTerrorist = "Counter-Terrorist Forces";

        int cDan = 8;
        int cLuke = 15;
        int cRonald = 3;
        int cAdam = 4;
        int cBen = 6;
        double cAverageScore = (cDan + cLuke + cRonald + cAdam + cBen) / 5.0;

        if (tAverageScore < cAverageScore) {
            System.out.println("The Team Winner: " + counterTerrorist + " with average frag score: " + cAverageScore + " points");
        } else if (tAverageScore > cAverageScore) {
            System.out.println("The Team Winner: " + terrorist + " with average frag score: " + tAverageScore + " points");
        } else if (tAverageScore == cAverageScore) {
            System.out.println("We have a draw, it seems that both teams reach similar frags average score");
        }
    }
}
