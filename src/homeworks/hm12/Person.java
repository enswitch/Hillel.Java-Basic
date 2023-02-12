package homeworks.hm12;

public class Person {
    String name, surname, city, phone;

    Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public static String personInfo(String name, String surname, String city, String phone) {
        String a = "Зателефонувати громадянину ";
        String b = " із міста ";
        String c = " можна за номером ";
        String result = a + name + " " + surname + b + city + c + phone;
        System.out.println(result);
        return result;
    }

}

class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        person1.personInfo(person1.name, person1.surname, person1.city, person1.phone);
        person2.personInfo(person2.name, person2.surname, person2.city, person2.phone);
        person3.personInfo(person3.name, person3.surname, person3.city, person3.phone);
    }
}
