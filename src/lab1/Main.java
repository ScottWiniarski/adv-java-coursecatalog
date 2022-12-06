package lab1;

public class Main {
    public static void main(String[] args){
        String name = "Into to Java";
        String number = "77-22-283";
        double credits = 3.5;
        Course course = new IntroToProgrammingCourse(name, number);

        course.setCourseName("Intro to deepfrying");
        System.out.println(course.getCourseName());

        Course course2 = new IntroJavaCourse(name, credits ,number);
        course2.setCredits(4);

        System.out.println(course2.getCredits());

        Course course3 = new AdvancedJavaCourse(name, credits, number);
        course3.setPrerequisites("IntroJava");
        System.out.println(course3.GetPrerequisistes() + " " + course3.getCourseNumber());
    }
}
