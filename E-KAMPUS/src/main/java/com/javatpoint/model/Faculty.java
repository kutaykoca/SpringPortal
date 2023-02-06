package com.javatpoint.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

@Table
public class Faculty
{

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String adminName;

    @ManyToMany
    @JoinTable(
            name = "teacher_enrolled",
            joinColumns = @JoinColumn(name = "faculty_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    Set<Teacher> enrolledTeachers = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "lesson_enrolled",
            joinColumns = @JoinColumn(name = "faculty_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id")
    )
    Set<Lesson> enrolledLessons = new HashSet<>();

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
    public String getAdminName()
    {
        return adminName;
    }
    public void setAdminName(String adminName)
    {
        this.adminName = adminName;
    }

    public void enrollTeacher(Teacher teacher) {
        enrolledTeachers.add(teacher);
    }

    public void enrollLesson(Lesson lesson) {enrolledLessons.add(lesson);
    }
}