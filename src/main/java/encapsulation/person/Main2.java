package encapsulation.person;

public class Main2 {
    public static void main(String[] args) {
        Person2 person = new Person2("John", 30);
        person.printDescription();

        person.setName("");  // print error
        person.setAge(150);  // print error

        person.printDescription();
    }
}
