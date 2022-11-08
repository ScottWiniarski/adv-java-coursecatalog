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
        System.out.println(SecondCourse.getCredits());

    }
}
