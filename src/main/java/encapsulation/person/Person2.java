package encapsulation.person;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 130.");
        }
    }

    public String getAgeCategory() {
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

    public void printDescription() {
        System.out.println("Name: " + name + ", Age: " + age + " (" + getAgeCategory() + ")");
    }
}
