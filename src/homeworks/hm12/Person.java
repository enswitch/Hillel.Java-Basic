package homeworks.hm12;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String personInfo() {
        String result = "Зателефонувати громадянину " + this.name + " " + this.surname;
        result += " із міста " + this.city;
        result += " можна за номером " + this.phone;
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
