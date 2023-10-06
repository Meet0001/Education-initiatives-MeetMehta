package com.company;

import java.util.*;

class ClassroomManager {
    private Map<String, Classroom> classrooms;

    public ClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    public void addClassroom(String className) {
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom '" + className + "' has been created.");
    }

    public List<String> listClassrooms() {
        return new ArrayList<>(classrooms.keySet());
    }

    public void removeClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            System.out.println("Classroom '" + className + "' has been removed.");
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
        }
    }

    public void enrollStudent(String studentId, String className) {
        if (classrooms.containsKey(className)) {
            classrooms.get(className).addStudent(studentId);
            System.out.println("Student '" + studentId + "' has been enrolled in '" + className + "'.");
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
        }
    }

    public List<String> listStudentsInClass(String className) {
        if (classrooms.containsKey(className)) {
            return classrooms.get(className).getStudents();
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
            return new ArrayList<>();
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        if (classrooms.containsKey(className)) {
            classrooms.get(className).scheduleAssignment(assignmentDetails);
            System.out.println("Assignment for '" + className + "' has been scheduled.");
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
        }
    }

    public List<String> listAssignmentsInClass(String className) {
        if (classrooms.containsKey(className)) {
            return classrooms.get(className).getAssignments();
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
            return new ArrayList<>();
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        if (classrooms.containsKey(className)) {
            if (classrooms.get(className).getStudents().contains(studentId)) {
                System.out.println("Assignment submitted by Student '" + studentId + "' in '" + className + "'.");
            } else {
                System.out.println("Student '" + studentId + "' is not enrolled in '" + className + "'.");
            }
        } else {
            System.out.println("Classroom '" + className + "' does not exist.");
        }
    }
}
