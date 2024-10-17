import java.time.LocalDate;

public class Group {
    String group;
    Person[] people;
    LocalDate startDate;
    String mentor;

    public Group() {
    }

    public Group(String group, Person[] people, LocalDate startDate, String mentor) {
        this.group = group;
        this.people = people;
        this.startDate = startDate;
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group='" + group + "\n" +
                ", name='" + people + "\n" +
                ", startDate=" + startDate + "\n" +
                ", mentor='" + mentor +
                '}';
    }
}
