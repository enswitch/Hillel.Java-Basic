package homeworks.hm7;

public class NameShuttle {

    public static void main(String[] args) {


        int countShuttle = 0;
        int valueShuttle = 0;

        while (countShuttle < 100) {

            String s = String.valueOf(++valueShuttle);
            if ((s.contains("4") || s.contains("9")))
                continue;
            countShuttle++;
            System.out.println("Shuttle Number: " + valueShuttle);
        }

    }
}

