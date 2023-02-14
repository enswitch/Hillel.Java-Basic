package homeworks.hm12;

public class Person {
    String name;
    String surname;
    String city;
    String phone;

    Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        String a = "Зателефонувати громадянину ";
        String b = " із міста ";
        String c = " можна за номером ";
        String result = a + this.name + " " + this.surname + b + this.city + c + this.phone;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        person1.personInfo();
        person2.personInfo();
        person3.personInfo();
    }
}
