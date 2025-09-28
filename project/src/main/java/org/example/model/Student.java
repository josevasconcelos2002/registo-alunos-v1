package org.example.model;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student()
    {
        this.id = 0;
        this.name = "No Name";
        this.age = 18;
    }

    public Student(String name, Integer age)
    {
        this.id = 0;
        this.name = name;
        if(age > 0)
            this.age = age;
    }

    public Student(Integer id, String name, Integer age)
    {
        if(id > 0)
            this.id = id;
        this.name = name;
        if(age > 0)
            this.age = age;
    }

    public Integer getID()
    {
        return this.id;
    }

    public void setID(Integer id)
    {
        if(id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID!");
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return this.age;
    }

    public void setAge(Integer age)
    {
        if(age > 0)
            this.age = age;
        else
            System.out.println("Invalid Age!");
    }

    public void printStudent()
    {
        System.out.println("Student");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}