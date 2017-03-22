package com.mdekhtiarenko;

/**
 * Created by mykola.dekhtiarenko on 10.03.17.
 */
public class Student {
    private int studentId;
    private String pib;
    private int course;

    public Student() {

    }

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (course != student.course) return false;
        return pib.equals(student.pib);
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + pib.hashCode();
        result = 31 * result + course;
        return result;
    }
}