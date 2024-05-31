package encapsulation.person;

public class Main1 {
    public static void main(String[] args) {
        Person1 person = new Person1("John", 30);
        System.out.println("Name: " + person.Name + ", Age: " + person.Age + " (" + GetAgeCategory(person.Age) + ")");

        String newName = args[0]; // user input new name
        if (newName != null && !newName.isEmpty() && newName.length() < 5) {
            person.Name = newName;
        } else {
            System.out.println("Invalid name. Name cannot be empty or length should be less that 5.");
        }

        int newAge = Integer.parseInt(args[1]); // user input new age
        if (newAge >= 0 && newAge <= 130) {
            person.Age = newAge;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 130.");
        }

        System.out.println("Name: " + person.Name + ", Age: " + person.Age + " (" + GetAgeCategory(person.Age) + ")");
    }

    public static String GetAgeCategory(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}

