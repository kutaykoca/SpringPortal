package com.javatpoint.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.javatpoint.model.Student;
import com.javatpoint.model.Teacher;
import com.javatpoint.repository.StudentRepository;
import lombok.Data;

@Entity
@Data
@Table
public class Lesson
{
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(mappedBy = "enrolledLessons")
    private Set<Faculty> faculties = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "student_enrolled",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    Set<Student> enrolledStudents = new HashSet<>();


    @Column
    private String name;
    @Column
    private int credit;

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
    public int getCredit()
    {
        return credit;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }


    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }



}