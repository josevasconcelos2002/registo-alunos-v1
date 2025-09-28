package org.example.repository;

import org.example.model.Student;

import java.util.HashMap;
import java.util.Set;

public class StudentRepository {
    private HashMap<Integer, Student> StudentRepositoryMap;

    public StudentRepository()
    {
        this.StudentRepositoryMap = new HashMap<>();
    }

    public StudentRepository(HashMap<Integer, Student> newMap)
    {
        this.StudentRepositoryMap = newMap;
    }

    public HashMap<Integer, Student> getStudentRepositoryMap()
    {
        // shallow clone , change this later
        return (HashMap<Integer, Student>)this.StudentRepositoryMap.clone();
    }

    public void addStudent(Student student)
    {
        try{
            if(this.StudentRepositoryMap.containsKey(student.getID()))
            {
                System.out.println("ERROR! Student ID already exists.");
            }
            else
            {
                this.StudentRepositoryMap.put(student.getID(), student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteStudent(Integer ID)
    {
        try{
            if(!this.StudentRepositoryMap.containsKey(ID))
            {
                System.out.println("ERROR! Student ID does not exist.");
            }
            else
            {
                this.StudentRepositoryMap.remove(ID);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void searchStudent(Integer ID)
    {
        try{
            if(!this.StudentRepositoryMap.containsKey(ID))
            {
                System.out.println("ERROR! Student ID does not exist.");
            }
            else
            {
                Student searchStudent  = this.StudentRepositoryMap.get(ID);
                if(searchStudent == null)
                {
                    System.out.println("ERROR! Student ID exists, but student is empty.");
                }
                else
                {
                    searchStudent.printStudent();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void listAllStudents()
    {
        Set<Integer> keys = this.StudentRepositoryMap.keySet();
        System.out.println("Students List:");
        for(Integer key : keys)
        {
            Student student = this.StudentRepositoryMap.get(key);
            student.printStudent();
        }
    }
}
