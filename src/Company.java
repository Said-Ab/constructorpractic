import java.time.LocalDate;
import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    LocalDate yearOfFoundation;
    String founder;
    Group[] groups;

    public Company() {
    }

    public Company(String companyName, String country, LocalDate yearOfFoundation, String founder, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + "\n" +
                ", country='" + country + "\n" +
                ", yearOfFoundation=" + yearOfFoundation + "\n" +
                ", founder='" + founder + "\n" +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
