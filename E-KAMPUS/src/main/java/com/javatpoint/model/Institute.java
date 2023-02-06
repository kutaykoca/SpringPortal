package com.javatpoint.model;
import javax.persistence.*;

@Entity

@Table
public class Institute
{

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String adminName;
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
}