package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    List<Student> klassStudents = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if (!this.klassStudents.contains(student)) {
            System.out.println("It is not one of us.");
        } else {
            this.leader = student;
            System.out.println("I am Tom. I know " + student.getName() + " become Leader of Class " + this.number + ".");
        }

    }

    public void appendMember(Student student) {
        this.klassStudents.add(student);
        System.out.println("I am Tom. I know " + student.getName() + " has joined Class " + this.number + ".");
    }
}
