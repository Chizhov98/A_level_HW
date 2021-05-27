package hw7;

import java.util.Random;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    Student(String firstName, String lastName, String group) {
        Random random = new Random();
        averageMark = random.nextInt(5) + 1;
        this.firstName =firstName;
        this.lastName = lastName;
        this.group = group;
    }

    int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }
}
