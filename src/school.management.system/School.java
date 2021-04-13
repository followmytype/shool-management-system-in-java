package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoney;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoney = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }
    public List<Student> getStudents() {
        return this.students;
    }
    public int getTotalMoney() {
        return this.totalMoney;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public static void updateTotalMoney(int money) {
        totalMoney += money;
    }
}