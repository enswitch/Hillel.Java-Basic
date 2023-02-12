package homeworks.hm8;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class TeamsAge {



    public static void main(String[] args) {

        TeamsAge teams = new TeamsAge();;


        int[] firstTeam = new int[24];
        int[] secondTeam = new int[24];

        int minAge = 18;
        int maxAge = 40;

        for (int i = 0; i <= firstTeam.length - 1; i++) {
            int randomAge = (int) (minAge + (maxAge - minAge) * (Math.random()));
            firstTeam[i] = randomAge;
        }
        for (int i = 0; i <= secondTeam.length - 1; i++) {
            int randomAge = (int) (minAge + (maxAge - minAge) * (Math.random()));
            secondTeam[i] = randomAge;
        }
        OptionalDouble avgFirstTeamAge = Arrays.stream(firstTeam).average();
        OptionalDouble avgSecondTeamAge = Arrays.stream(firstTeam).average();

        System.out.println("The age of every player in first team: " + Arrays.toString(firstTeam));
        System.out.println("The age of every player in second team: " + Arrays.toString(secondTeam));
        System.out.println(" ");

        System.out.println("Average age of first team: " + avgFirstTeamAge);
        System.out.println("Average age of second team: " + avgSecondTeamAge);


    }
}
