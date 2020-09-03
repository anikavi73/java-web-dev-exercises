package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {

        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID(){
        return this.studentId;
    }

    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        if (this.numberOfCredits > 90) {
            return "Senior";
        } else if (this.numberOfCredits > 60) {
            return "Junior";
        } else if (this.numberOfCredits > 30) {
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }


    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
    }


// TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
//  than just the class fields.

    public String toString(){
        return "Name: " + this.name + " Id:" + this.studentId + " Number of Credits " + this.numberOfCredits;
    }

// TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
//  Student objects equal.

    public boolean equals(int studentId) {
        return (this.studentId == studentId);
    }

    public static void main(String[] args) {
        Student kavi = new Student("Kavi",1,1,4.0);
        System.out.println("The Student class works! " + kavi.getName() + " is a student!");
        System.out.println(kavi);
        kavi.addGrade(12, 3.5);
        System.out.println(kavi);
        kavi.addGrade(25, 3.8);
        System.out.println(kavi);
    }

}
