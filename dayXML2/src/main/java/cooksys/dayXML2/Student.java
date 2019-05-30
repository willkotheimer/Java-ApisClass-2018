package cooksys.dayXML2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Student {
	
	public Student() {
		
	}
public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

public Student(String student) {
		super();
		this.student = student;
	}

@XmlValue
private String student;
}

