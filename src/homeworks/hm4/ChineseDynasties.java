package homeworks.hm4;

public class ChineseDynasties {
    public static void main(String[] args) {

        int liDynSingleTypeCount = 860; // single type =  860 warriors; 860 archers; 860 horsemen
        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liHorsemanAttack = 46;

        int minDynSingleTypeCount = (int) (liDynSingleTypeCount * 1.5);
        int minWarriorAttack = 9;
        int minArcherAttack = 35;
        int minHorsemanAttack = 12;

        int liDynAttack = liDynSingleTypeCount * (liWarriorAttack + liArcherAttack + liHorsemanAttack);
        int minDynAttack = minDynSingleTypeCount * (minWarriorAttack + minArcherAttack + minHorsemanAttack);

        int bothDynAttack = liDynAttack + minDynAttack;

        System.out.println("Li dynasty total attack: " + liDynAttack + " points");
        System.out.println("Min dynasty total attack: " + minDynAttack + " points");
        System.out.println("Both dynasties total attack: " + bothDynAttack + " points");


    }
}
