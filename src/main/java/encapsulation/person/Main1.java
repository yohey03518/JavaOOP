package encapsulation.person;

public class Main1 {
    public static void main(String[] args) {
        Person1 person = new Person1("John", 30);
        System.out.println("Name: " + person.Name + ", Age: " + person.Age + " (" + getAgeCategory(person.Age) + ")");

        String newName = "";
        if (newName != null && !newName.isEmpty()) {
            person.Name = newName;
        } else {
            System.out.println("Invalid name. Name cannot be empty.");
        }

        int newAge = 150;
        if (newAge >= 0 && newAge <= 130) {
            person.Age = newAge;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 130.");
        }

        System.out.println("Name: " + person.Name + ", Age: " + person.Age + " (" + getAgeCategory(person.Age) + ")");
    }

    public static String getAgeCategory(int age) {
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

