import java.time.LocalDate;

public class Person {
    String name;
    String surname;
    LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "       Person{" +
                ", name='" + name + "\n" +
                ", surname='" + surname + "\n" +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
