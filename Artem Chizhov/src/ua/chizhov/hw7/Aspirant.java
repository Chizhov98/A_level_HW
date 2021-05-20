package ua.chizhov.hw7;

public class Aspirant extends Student {

    String scientificWorkName;

    Aspirant(String firstName, String lastName, String group) {
        super(firstName, lastName, group);
    }

    @Override
    int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }
}
