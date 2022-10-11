/**
 * @author: Abhi Patel
 * Create Student profile class with method to increase expected graduation year by one.
 * LinkedinLearning: https://www.linkedin.com/learning/learning-java-4/challenge-student-profile?autoplay=true&contextUrn=urn%3Ali%3AlyndaLearningPath%3A56d8919392015a1a081f9141&resume=false&u=2218586
 */

public class StudentProfileMain {

    public static void main(String args[]) {
        StudentProfile studentProfile1 = new StudentProfile(
            "Abhi",
            "Patel",
            2022,
            4,
            "Information Technology Solutions"
        );
        System.out.println(studentProfile1);

        StudentProfile studentProfile2 = new StudentProfile(
            "Raj",
            "Mayani",
            2024,
            3.7,
            "Automobile"
        );
        studentProfile2.incrementGraduationYearByOne();
        System.out.println(studentProfile2);
    }

    
}

class StudentProfile {
        String firstName;
        String lastName;
        int expectedGraduationYear;
        double GPA;
        String major;

        public StudentProfile (String firstName, String lastName, int expectedGraduationYear, double GPA, String major) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.expectedGraduationYear = expectedGraduationYear;
            this.GPA = GPA;
            this.major = major;
        }

        public void incrementGraduationYearByOne(){
            expectedGraduationYear++;
        }

        @Override
        public String toString() {
            return "Student: First Name = " + firstName + "\n" +
            "Last Name =" + lastName + "\n" +
            "Expected Graduation Year: " + expectedGraduationYear + "\n" +
            "GPA: " + GPA + "\n" +
            "Major: " + major; 
        }
}