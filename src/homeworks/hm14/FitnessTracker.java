package homeworks.hm14;

public class FitnessTracker {
    private final String userName;
    private final int userDayOfBirth;
    private final int userMonthOfBirth;
    private final int userYearOfBirth;
    private final int userAge;
    private final String userEmail;
    private final String userPhone;
    private String userSurname;
    private int userWeight;
    private String userPressure;
    private int userStepsPerDay;


    public FitnessTracker(String name, String surname, int day, int month, int year, String email, String phone, int weight, String pressure, int steps) {
        this.userName = name;
        this.userDayOfBirth = day;
        this.userMonthOfBirth = month;
        this.userYearOfBirth = year;
        this.userAge = 2020 - userYearOfBirth;
        this.userEmail = email;
        this.userPhone = phone;
        this.userSurname = surname;
        this.setUserWeight(weight);
        this.setUserPressure(pressure);
        this.setUserStepsPerDay(steps);
    }

    public String getUserName() {
        return userName;
    }

    public int getUserDayOfBirth() {
        return userDayOfBirth;
    }

    public int getUserMonthOfBirth() {
        return userMonthOfBirth;
    }

    public int getUserYearOfBirth() {
        return userYearOfBirth;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        if (userWeight < 0) {
            throw new IllegalArgumentException("Please, set positive weight!");
        }
        this.userWeight = userWeight;
    }

    public String getUserPressure() {
        return userPressure;
    }

    public void setUserPressure(String userPressure) {
        if (!userPressure.contains("/")) {
            throw new IllegalArgumentException("Please, type valid pressure with /");
        }
        this.userPressure = userPressure;
    }

    public int getUserStepsPerDay() {
        return userStepsPerDay;
    }

    public void setUserStepsPerDay(int userStepsPerDay) {
        if (userStepsPerDay < 0) {
            throw new IllegalArgumentException("Please, set positive count of steps per day!");
        }
        this.userStepsPerDay = userStepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("User info:");
        System.out.println("Name: " + this.userName);
        System.out.println("Surname: " + this.userSurname);
        System.out.println("Date of birth: " + this.userDayOfBirth + "." + this.userMonthOfBirth + "." + this.userYearOfBirth + ": " + this.userAge + " years old");
        System.out.println("Email: " + this.userEmail);
        System.out.println("Phone number: " + this.userPhone);
        System.out.println("Current weight: " + this.userWeight + "kg");
        System.out.println("Pressure: " + this.userPressure);
        System.out.println("Steps per day: " + this.userStepsPerDay + " steps");
    }

    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Andriy", "Rybak", 16, 10, 1988, "j.smith@88.com", "+380975653421", 92, "120/70", 10000);
        FitnessTracker user2 = new FitnessTracker("Iryna", "Voznychka", 4, 8, 2001, "armst.i64@gmail.com", "+380982534763", 55, "110/50", 20000);
        FitnessTracker user3 = new FitnessTracker("Julia", "Lenno", 25, 7, 1999, "judy.henksis@gmail.com", "+380686996510", 61, "110/70", 10500);
        FitnessTracker user4 = new FitnessTracker("Volodya", "Samulak", 19, 12, 1996, "v.samulak@vv.net", "+380635480205", 52, "90/70", 15300);
        FitnessTracker user5 = new FitnessTracker("Natalya", "Pokotylo", 26, 4, 1992, "pokotylo11.nata@yahoo.com", "+380969846250", 68, "115/90", 12400);

        FitnessTracker users[] = {user1, user2, user3, user4, user5};
        for (int i = 0; i < users.length; i++) {
            users[i].printAccountInfo();
            System.out.println();
        }

        user1.setUserWeight(86);
        user1.setUserPressure("120/80");
        user1.setUserStepsPerDay(11450);


        user5.setUserSurname("Jurta");
        user5.setUserWeight(71);
        user5.setUserPressure("110/95");
        user5.setUserStepsPerDay(9900);

        user1.printAccountInfo();
        System.out.println();
        user5.printAccountInfo();


    }
}
