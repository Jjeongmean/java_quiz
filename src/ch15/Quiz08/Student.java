package ch15.Quiz08;

public class Student {
    public int studentNum;
    public String name;
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) { //Object object = new student()
            return studentNum == student.studentNum;
        } else {
            return false;
        }
    }
}
