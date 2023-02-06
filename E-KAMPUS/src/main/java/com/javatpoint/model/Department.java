package com.javatpoint.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

@Table
public class Department
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
            name = "studentAffairs_enrolled",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "studentAffairs_id")
    )
    Set<StudentAffairs> enrolledStudentAffairs = new HashSet<>();

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

    public void enrollStudentAffairs(StudentAffairs studentAffairs) {
        enrolledStudentAffairs.add(studentAffairs);
    }
}