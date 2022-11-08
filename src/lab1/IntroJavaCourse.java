package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course{

    String courseName;
    double credits;
    String prerequisites;
    private String courseNumber;

    public IntroJavaCourse(String courseName, double credits , String courseNumber) {
        super(courseNumber, 3, courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setCourseName(courseName);
    }

    @Override
    public void setCourseNumber(String courseNumber) {

    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        //this.setCredits(credits);
    }

    @Override
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String getPrerequisites() {
        return null;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
