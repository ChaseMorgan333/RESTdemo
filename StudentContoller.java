package com.hcc.example.RESTdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentContoller {

	/**
	 * URL : http://localhost:8080/students
	 * @return all students
	 * @throws IOException
	 */
	@GetMapping("/students")
	public List<Student> students() throws IOException{
		return readData();
	}
	
	/***
     * http://localhost:8080/student/Caleb
     * @param name
     * @return Student
     * @throws IOException
     */
    @GetMapping("/student/{name}")
    public Student  student(@PathVariable String name) throws IOException {
        System.out.println("search student by name : "+ name);
        List<Student>  students = readData();
        for(Student student : students){
            if( student.getName().equalsIgnoreCase(name)){
                System.out.println("found student "+ student);
                return student;
            }
        }
        System.out.println(" No student found for name "+ name);
        return null;
    }


    @GetMapping("/student")
    public Student  student(@RequestParam String name, @RequestParam int id) throws IOException {
        System.out.println("search studnet by name : "+ name+" id : "+id);
        List<Student>  students = readData();
        for(Student student: students){
            if( student.getName().equalsIgnoreCase(name) & student.getId() == id){
                System.out.println("found student "+ student);
                return student;
            }
        }
        System.out.println(" No Student fourd for name "+ name);
        return null;
    }


    /***
     * Read the students.txt file
     * @return all the students
     * @throws IOException
     */
    public List<Student> readData() throws IOException {
        FileReader fileReader = new FileReader("C:\\Dev\\RESTdemo\\src\\main\\resources\\students.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Student> studentList = new ArrayList();
        

        String header = bufferedReader.readLine(); // read the header
        String line = bufferedReader.readLine(); // read the first line

        while ( line != null){
            String[] data = line.split(",");// split each read line by comma
           
            Student student = new Student(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]),data[3],data[4]);
            
            studentList.add(student);
            
           
            line = bufferedReader.readLine();
            
        }
        return studentList;
    }
}
