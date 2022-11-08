package lab1;

import javax.swing.*;

public abstract class Course {
    private String courseNumber;
    private double credits;
    private String courseName;
    private String prerequisites;

    public Course(String courseNumber, double credits, String courseName) {
        setCourseNumber(courseNumber);
        setCredits(credits);
        setCourseName(courseName);
    }
    public String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    public double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);

    public String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public String GetPrerequisistes(){
        return prerequisites;
    }

    public String getPrerequisites() {
        return null;
    }
    void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
