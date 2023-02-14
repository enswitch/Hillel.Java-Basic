package homeworks.hm13;

public class Burger {
    String bun;
    String meat;
    String extraMeat;
    String cheese;
    String greens;
    String sause;


    Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Components for fit burger: " + bun + ", " + meat + ", " + cheese + ", " + greens);

    }

    Burger(String bun, String meat, String cheese, String greens, String sauce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sause = sauce;
        System.out.println("Components for regular burger: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + sauce);
    }

    Burger(String bun, String meat, String extraMeat, String cheese, String greens, String sauce) {
        this.bun = bun;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.sause = sauce;
        System.out.println("Components for extra burger: " + bun + ", " + meat + ", " + extraMeat + ", " + cheese + ", " + greens + ", " + sauce);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burger fitBurger = new Burger("Pita", "Chiken", "Brie", "Vegetables");
        Burger regularBurger = new Burger("Bun", "Chiken", "Cheddar", "Vegetables", "Mayonnaise");
        Burger extraBurger = new Burger("Bun", "Chiken", "Beef", "Cheddar", "Vegetables", "Mayonnaise");

    }
}
