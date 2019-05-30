package cooksys.day4;

import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



/*IOXMML Main*/

public class Main {

	public static void main(String[] args) {
		
		
		
			try {
				JAXBContext unmarshaller = (JAXBContext) JAXBContext.newInstance(Ftd.class,Teacher.class, Student.class).createUnmarshaller();
				
				Ftd fastTrackDOctober = (Ftd)((Unmarshaller) unmarshaller).unmarshal(new File ("pathname.xml"));
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			
		
			/*
			JAXBContext context = JAXBContext.newInstance(Ftd.class,Teacher.class, Student.class);
			
			
			Ftd fastTrackDOctober = new Ftd();
			Student alex = new Student("Alex");
			Student Jeremy = new Student("Jeremy");
			Student Forrest = new Student("Forrest");
			Student John = new Student("John");
			Teacher quinton = new Teacher("Quinton");
			
			ArrayList<Student> students = new ArrayList<Student>();
			ArrayList<Teacher> teachers = new ArrayList<Teacher>();
			
			students.add(alex);
			teachers.add(quinton);
			
			fastTrackDOctober.setStudents(students);
			fastTrackDOctober.setTeacher(teachers);
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(fastTrackDOctober, new FileOutputStream("ftdOctober2018.xml"));



			
			
		} catch(JAXBException jaxbException) {
			
		}
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		File file = new File("text.txt");
		
		
		
		
		
		
		
		try(InputStream fileInputStream = new FileInputStream(file);
			OutputStream fileOutputStream =  new FileOutputStream("newText.txt");
				)
		
	{
			//file.createNewFile();
			//fileInputStream = new FileInputStream(file);
			
			byte[] bytes = new byte[fileInputStream.available()];
			fileInputStream.read(bytes);
			System.out.println(bytes.length);
			System.out.println(Arrays.toString(bytes));
			//fileOutputStream = new FileOutputStream("newText.txt");
			fileOutputStream.write(bytes);
		
	//	} catch (FileNotFoundException e1) {
	//		System.out.println("File does not exist.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	/*	} finally {
			if (fileInputStream!= null && fileOutputStream!=null) {
				
				
			
			try {
			fileInputStream.close();
			fileOutputStream.close();
			} catch (IOException ioException) {
				System.out.println(ioException);
			}
			
		*/
			
			
		//	}
		
		
		/*
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File could not be created.");
		} finally {
			
		} */
	//}

	public static void createfile(File file) throws IOException {
		System.out.println(file.createNewFile());
	}
}
