package com.javatpoint.model;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table
public class StudentAffairs
{


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private int bankNo;

    @ManyToMany(mappedBy = "enrolledStudentAffairs")
    private Set<Department> departments = new HashSet<>();

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
    public int getBankNo()
    {
        return bankNo;
    }
    public void setBankNo(int age)
    {
        this.bankNo = bankNo;
    }


}