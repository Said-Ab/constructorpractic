import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Student student=new Student("Said", LocalDate.of(2008,7,29),"0774197977","kyrgyz");
//Student student1=new Student("Enes", LocalDate.of(2004,8,23),"0552903749","kyrgyz");
//Student student2=new Student("jyrgalbek", LocalDate.of(2009,3,14),"0992132314","kyrgyz");
//Student student3=new Student("Nursultan", LocalDate.of(2007,10,28),"0777831234","kyrgyz");
//        Student[]students={student,student1,student2,student3};
//        for(Student student4: students){
//            System.out.println(student4);
//        }
//
        Person person1 = new Person("Adilet", "Egemberdiev", LocalDate.of(2008, 4, 30));
        Person person2 = new Person("Fatima", "Altynbek kyzy", LocalDate.of(2004, 8, 1));
        Person person3 = new Person("Mirlan", "Tashtanbekov", LocalDate.of(1992, 2, 14));
        Person person4 = new Person("Gulnur", "Asanalieva", LocalDate.of(1995, 2, 23));
        Person person5 = new Person("Bektur", "Akylbekov", LocalDate.of(2004, 3, 3));
        Person person6 = new Person("Sanjar", "Abdumalikov", LocalDate.of(2009, 7, 29));


        Person person7 = new Person("Mamyrgul", "Zhursunbekova", LocalDate.of(2006, 2, 7));
        Person person8 = new Person("Said", "Abdurashitov", LocalDate.of(2008, 7, 29));
        Person person9 = new Person("Enes", "Marat uulu", LocalDate.of(2004, 8, 24));
        Person person10 = new Person("Nursultan", "Alymbekov", LocalDate.of(2007, 1, 2));
        Person person11 = new Person("Elaman", "Abjalov", LocalDate.of(2008, 3, 27));
        Person person12 = new Person("Rahmankul", "Zhakaev", LocalDate.of(2003, 4, 14));
        Person person13 = new Person("Azmar", "Kurmanbekov", LocalDate.of(2009, 2, 21));
        Person person14 = new Person("Jyrgalbek", "Amangulov", LocalDate.of(2009, 2, 15));

        Person[] people = {person1, person2, person3, person4, person5, person6, person7};
        Person[] people1 = {person8, person9, person10, person11, person12, person13, person14};
        Group group1 = new Group("Java", people, LocalDate.of(2024, 9, 9), "Aizat");
        Group group2 = new Group("Js", people, LocalDate.of(2024, 9, 9), "Aijamal");

        Group[] groups = {group1, group2};
        Company company = new Company("Peaksoft", "Kyrgyzstan", LocalDate.of(2020, 1, 12), "Esen", groups);

        System.out.println(company);


    }
}