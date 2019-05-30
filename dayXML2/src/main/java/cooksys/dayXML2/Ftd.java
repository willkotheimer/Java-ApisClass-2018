package cooksys.dayXML2;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ftd {

    @XmlElementWrapper
    @XmlElement(name="student")
    private List<Student> students;

    @XmlElementWrapper
    @XmlElement(name="teacher")
    private List<Teacher> teachers;

    public Ftd() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Ftd{" +
                "students=" + students +
                ", teachers=" + teachers +
                '}';
    }
}