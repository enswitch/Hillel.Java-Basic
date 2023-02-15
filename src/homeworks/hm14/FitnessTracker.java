package homeworks.hm14;

public class FitnessTracker {
    private String userName;
    private int userDayOfBirth;
    private int userMonthOfBirth;
    private int userYearOfBirth;
    private String userEmail;
    private String userPhone;
    private String userSurname;
    private int userWeight;
    private String userPressure;
    private int userStepsPerDay;

    public FitnessTracker() {

    }

    public FitnessTracker(String name, String surname, int day, int month, int year, String email, String phone, int weight, String pressure, int steps) {
        this.userName = name;
        this.userDayOfBirth = day;
        this.userMonthOfBirth = month;
        this.userYearOfBirth = year;
        this.userEmail = email;
        this.userPhone = phone;
        this.userSurname = surname;
        this.userWeight = weight;
        this.userPressure = pressure;
        this.userStepsPerDay = steps;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserDayOfBirth() {
        if (userDayOfBirth < 1 || userDayOfBirth > 31) {
            System.err.println("Type valid date!");
        }
        return userDayOfBirth;
    }

    public int getUserMonthOfBirth() {
        if (userMonthOfBirth < 1 || userMonthOfBirth > 12) {
            System.err.println("Type valid date!");
        }
        return userMonthOfBirth;
    }

    public int getUserYearOfBirth() {
        if (userYearOfBirth < 1950 || userYearOfBirth > 2020) {
            System.err.println("Type correct age!");
        }
        int age = 2020 - userYearOfBirth;
        return age;
    }

    public String getUserEmail() {
        if (!userEmail.contains("@") || !userEmail.contains(".")) {
            System.err.println("Type valid email!");
        }
        return userEmail;
    }

    public String getUserPhone() {
        if (!userPhone.contains("+")) {
            System.err.println("Type valid phone number!");
        }
        return userPhone;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getUserWeight() {
        if (userWeight < 0) {
            System.err.println("Type positive weight!");
        }
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        if (userWeight > 0) {
            this.userWeight = userWeight;
        } else {
            System.err.println("Type positive weight!");
        }
    }

    public String getUserPressure() {
        if (!userPressure.contains("/")) {
            System.err.println("Type valid pressure with /");
        }
        return userPressure;
    }

    public void setUserPressure(String userPressure) {
        if (userPressure.contains("/")) {
            this.userPressure = userPressure;
        } else {
            System.err.println("Type valid pressure with /");
        }

    }

    public int getUserStepsPerDay() {
        if (userStepsPerDay < 0) {
            System.err.println("Type positive value of steps!");
        }
        return userStepsPerDay;
    }

    public void setUserStepsPerDay(int userStepsPerDay) {
        if (userStepsPerDay > 0) {
            this.userStepsPerDay = userStepsPerDay;
        } else {
            System.err.println("Type positive value of steps!");
        }
    }

    void printAccountInfo() {
        System.out.println("User info:");
        System.out.println("Name: " + this.userName);
        System.out.println("Surname: " + this.userSurname);
        System.out.println("Date of birth: " + this.userDayOfBirth + "." + this.userMonthOfBirth + "." + this.userYearOfBirth + ": " + getUserYearOfBirth() + " years old");
        System.out.println("Email: " + this.userEmail);
        System.out.println("Phone number: " + this.userPhone);
        System.out.println("Current weight: " + this.userWeight + "kg");
        System.out.println("Pressure: " + this.userPressure);
        System.out.println("Steps per day: " + this.userStepsPerDay + " steps");
    }

    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Andriy", "Rybak", 32, 13, 1988, "j.smith@88.com", "+380975653421", 92, "120/70", 10000);
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
