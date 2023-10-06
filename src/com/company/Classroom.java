package com.company;


import java.util.*;

class Classroom {
    private String name;
    private List<String> students;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(String studentId) {
        students.add(studentId);
    }

    public List<String> getStudents() {
        return students;
    }

    public void scheduleAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
    }

    public List<String> getAssignments() {
        return assignments;
    }
}