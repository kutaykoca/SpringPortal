package com.javatpoint.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table
public class Teacher
{


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;





    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String email;
    @ManyToMany(mappedBy = "enrolledTeachers")
    private Set<Faculty> faculties = new HashSet<>();
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }
}