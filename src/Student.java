//import java.time.LocalDate;
//import java.time.Period;
//
//public class Student {
//    String name;
//    LocalDate dayOfBirth;
//    String phoneNumber;
//    String nationality;
//
//    public Student(String name, LocalDate dayOfBirth, String phoneNumber, String nationality) {
//        this.name = name;
//        this.dayOfBirth = dayOfBirth;
//        this.phoneNumber = phoneNumber;
//        this.nationality = nationality;
//    }
//
//    public Student() {
//    }
//
//    public int getage() {
//        LocalDate age = LocalDate.now();
//        if (dayOfBirth != null) {
//            return Period.between(dayOfBirth, age).getYears();
//        } else {
//            return 0;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "     Student{" + "\n" +
//                ", name='" + name + "\n" +
//                ", dayOfBirth=" + dayOfBirth + "\n" +
//                ", phoneNumber='" + phoneNumber + "\n" +
//                ", nationality='" + nationality + "\n" +
//                ", age" + getage() +
//                '}';
//    }
//
//}
