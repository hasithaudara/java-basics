package org.example.StudentManagementApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

    static int studentCount = 1;
    static HashMap<Integer, Student> studentList;

    public static void main(String[] args) {

        Student student_1 = new Student("Kevin", new ArrayList<>());
        Student student_2 = new Student("Thor", new ArrayList<>());
        Student student_3 = new Student("Peter", new ArrayList<>());

        StudentManagement studentManagement = new StudentManagement();
        studentList = new HashMap<>();
        studentManagement.addStudent(student_1);
        studentManagement.addStudent(student_2);
        studentManagement.addStudent(student_3);
        studentManagement.displayStudentList();

        Course course_1 = new Course(1, "Mathematics");
        Course course_2 = new Course(2, "Chemistry");
        Course course_3 = new Course(3, "Physics");
        studentManagement.addCourseToStudent(1, course_1);
        studentManagement.addCourseToStudent(1, course_2);
        studentManagement.addCourseToStudent(2, course_3);
        studentManagement.displayCoursesForTheStudent(3);
    }

    private void addStudent(Student student) {
        studentList.put(studentCount, student);
        studentCount++;
    }

    private void removeStudent(int id) {
        if (studentList.containsKey(id)) {
            studentList.remove(id);
        }
    }

    private void displayStudentList() {
        for (Map.Entry<Integer, Student> entry : studentList.entrySet()) {
            System.out.println("| ID - " + entry.getKey() + " | Name - " + entry.getValue().getName());
        }
    }

    private void addCourseToStudent(int id, Course course) {
        if (studentList.containsKey(id)) {
            studentList.get(id).getEnrolledCourse().add(course);
        }
    }

    private void displayCoursesForTheStudent(int id) {
        ArrayList<Course> courseList = studentList.get(id).getEnrolledCourse();
        if (courseList.size() != 0) {
            System.out.println(studentList.get(id).getName() + " enrolled in following courses,");
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println(courseList.get(i).getCourseName());
            }
        } else {
            System.out.println(studentList.get(id).getName() + " has not enrolled in eny course.");
        }
    }
}
