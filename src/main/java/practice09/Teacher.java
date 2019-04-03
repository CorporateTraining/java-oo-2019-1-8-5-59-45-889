package practice09;

import java.util.Objects;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if (Objects.isNull(this.klass)) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
    }

    public String introduceWith(Student student) {
        String result = super.introduce() + " I am a Teacher.";
        if(this.klass.getNumber() == student.getKlass().getNumber()){
            return result + " I teach Jerry.";
        }
        return result + " I don't teach Jerry.";
    }
}
