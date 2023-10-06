package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ClassroomManager classroomManager = new ClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Classroom Manager");
            System.out.println("\nCommands: ");
            System.out.println("1. add_classroom");
            System.out.println("2. list_classroom");
            System.out.println("3. remove_classroom");
            System.out.println("4. add_student");
            System.out.println("5. list_students");
            System.out.println("6. schedule_assignment");
            System.out.println("7. list_assignment");
            System.out.println("8. submit_assignment");
            System.out.println("9. quit");
            System.out.print("Enter command: ");

            String command = scanner.nextLine();
            switch (command) {
                case "add_classroom":
                    System.out.print("Class name: ");
                    String className = scanner.nextLine();
                    classroomManager.addClassroom(className);
                    break;
                case "list_classroom":
                    System.out.println("List of Classrooms:");
                    List<String> classroom_list = classroomManager.listClassrooms();
                    for (String classroom : classroom_list) {
                        System.out.println(classroom);
                    }
                    break;
                case "remove_classroom":
                    System.out.print("Enter the class name to remove: ");
                    String rmv = scanner.nextLine();
                    classroomManager.removeClassroom(rmv);
                    break;
                case "add_student":
                    System.out.print("Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter the classname to enroll the student in: ");
                    String classToEnroll = scanner.nextLine();
                    classroomManager.enrollStudent(studentId, classToEnroll);
                    break;
                case "list_students":
                    System.out.print("Enter the class name to list students: ");
                    String classToListStudents = scanner.nextLine();
                    List<String> students = classroomManager.listStudentsInClass(classToListStudents);
                    System.out.println("Students in " + classToListStudents + ":");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;
                case "schedule_assignment":
                    System.out.print("Enter the class name to schedule assignment: ");
                    String classToSchedule = scanner.nextLine();
                    System.out.print("Enter assignment details: ");
                    String assignmentDetails = scanner.nextLine();
                    classroomManager.scheduleAssignment(classToSchedule, assignmentDetails);
                    break;
                case "list_assignment":
                    System.out.print("Enter the class name to list assignments: ");
                    String classList = scanner.nextLine();
                    List<String> assignments = classroomManager.listAssignmentsInClass(classList);
                    System.out.println("Assignments in " + classList + ":");
                    for (String assignment : assignments) {
                        System.out.println(assignment);
                    }
                    break;
                case "submit_assignment":
                    System.out.print("Enter the student ID: ");
                    String studentToSubmit = scanner.nextLine();
                    System.out.print("Enter the class name: ");
                    String classToSubmit = scanner.nextLine();
                    System.out.print("Enter assignment details: ");
                    String submitAssignment = scanner.nextLine();
                    classroomManager.submitAssignment(studentToSubmit, classToSubmit, submitAssignment);
                    break;
                case "quit":
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
