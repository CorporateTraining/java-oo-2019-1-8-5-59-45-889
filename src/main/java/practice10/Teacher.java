package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.classes.addAll(klass);
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes.addAll(classes);
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        String result = getClassNumber();
        return super.introduce() + " I am a Teacher. I teach Class " + result + ".";
    }

    private String getClassNumber() {
        List<String> numbers = new ArrayList<>();
        List<Integer> collect = this.classes.stream().map(Klass::getNumber).collect(Collectors.toList());
        for (Integer item : collect) {
            numbers.add(item.toString());
        }
        return String.join(", ", numbers);
    }

    public String introduceWith(Student student) {
        String result = super.introduce() + " I am a Teacher.";
        List<Klass> collect = this.classes.stream().filter(item -> item.getNumber() == student.getKlass().getNumber()).collect(Collectors.toList());
        if (collect.size() > 0) {
            return result + " I teach Jerry.";
        }
        return result + " I don't teach Jerry.";
    }

    public boolean isTeaching(Student student) {
        List<Klass> collect = this.classes.stream().filter(item -> item.getNumber() == student.getKlass().getNumber()).collect(Collectors.toList());
        return collect.size() > 0;
    }
}
