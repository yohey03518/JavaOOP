package encapsulation.person;

public class Main2 {
    public static void main(String[] args) {
        Person2 person = new Person2("John", 30);
        person.PrintDescription();

        person.SetName("");  // print error
        person.SetAge(150);  // print error

        person.PrintDescription();
    }
}
