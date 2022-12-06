package lab2;

public class Main {
    public static void main(String[] args){
        String CourseName = "Intro to Java";
        String CourseNumber = "77-222-23";

        CourseInfo course = new IntroToProgrammingCourse(CourseName, CourseNumber);

        course.setCourseNumber("222-33-33");
        course.setCredits(3.5);
        System.out.println(course.getCourseName() + ", " + course.getCourseNumber() + ", " + course.getCredits());

        CourseInfo SecondCourse = new IntroJavaCourse(CourseName, CourseNumber);
        SecondCourse.setCredits(3.5);
        System.out.printf("\n*****\nIntroJava Course Name: %s\nCourse Number %s\nCourse credits: %.2f", CourseName, CourseNumber, SecondCourse.getCredits() );


        CourseInfo thirdCourse = new AdvancedJavaCourse(CourseName, CourseNumber);
        thirdCourse.setCredits(4.0);


        System.out.printf("\n****\nAdvanced Course Name: %s\nCourse Number: %s\nCourse Credits: %.2f\n", CourseName, CourseNumber, thirdCourse.getCredits());
    }
}
