package cooksys.dayXML2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args) {
//        File file = new File("text.txt");
//
//        try (
//                InputStream fileInputStream = new FileInputStream(file);
//                OutputStream fileOutputStream = new FileOutputStream("newText.txt");
//        ) {
//            byte[] bytes = new byte[fileInputStream.available()];
//            fileInputStream.read(bytes);
//            System.out.println(bytes.length);
//            System.out.println(Arrays.toString(bytes));
//            fileOutputStream.write(bytes);
//        } catch (IOException e) {
//            System.out.println("File does not exist.");
//        }

        try {
            JAXBContext context = JAXBContext.newInstance(Ftd.class, Teacher.class, Student.class);

//            Ftd fastTrackDOctober = new Ftd();
//            Student alex = new Student("Alex");
//            Student austin = new Student("Austin");
//            Student david = new Student("David");
//            Student erjon = new Student("Erjon");
//            Student forest = new Student("Forest");
//            Student jeremy = new Student("Jeremy");
//            Student joe = new Student("Joe");
//            Student john = new Student("John");
//            Student josh = new Student("Josh");
//            Student seong = new Student("Seong");
//            Student will = new Student("Will");
//
//            Teacher quinton = new Teacher("Quinton");
//            Teacher will1 = new Teacher("Will");
//
//            List<Student> students = new ArrayList<Student>();
//            List<Teacher> teachers = new ArrayList<Teacher>();
//
//            students.add(alex);
//            students.add(austin);
//            students.add(david);
//            students.add(erjon);
//            students.add(forest);
//            students.add(jeremy);
//            students.add(joe);
//            students.add(john);
//            students.add(josh);
//            students.add(seong);
//            students.add(will);
//
//            teachers.add(quinton);
//            teachers.add(will1);
//
//            fastTrackDOctober.setStudents(students);
//            fastTrackDOctober.setTeachers(teachers);
//
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            marshaller.marshal(fastTrackDOctober, new FileOutputStream("ftdOctober2018.xml"));

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Ftd fastTrackDOctober = (Ftd) unmarshaller.unmarshal(new File("ftdOctober2018.xml"));

            System.out.println(fastTrackDOctober);


        } catch (JAXBException jaxbException) {
            jaxbException.printStackTrace();
        }

    }

//    public static void createFile (File file) throws IOException {
//        System.out.println(file.createNewFile());
//    }
}