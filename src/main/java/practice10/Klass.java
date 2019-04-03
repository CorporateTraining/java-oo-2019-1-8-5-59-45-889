package practice10;

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

    public void assignLeader(Student jerry) {
        if(!this.klassStudents.contains(jerry)){
            System.out.println("It is not one of us.");
        }else {
            this.leader = jerry;
        }

    }

    public void appendMember(Student tom) {
        this.klassStudents.add(tom);
    }
}
