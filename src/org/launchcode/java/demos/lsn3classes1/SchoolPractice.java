package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student kavi = new Student("Kavi", 123456, 1,4.0);
        Student blake = new Student("Blake", 123457, 1,3.8);

        System.out.println("Kavi's gpa: " + kavi.getGpa());
        System.out.println("Blake's gpa: " + blake.getGpa());
    }
}
