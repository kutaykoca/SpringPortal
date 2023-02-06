package com.javatpoint.model;
import javax.persistence.*;

@Entity

@Table
public class HumanResources
{

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String bankNo;
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
    public String getBankNo()
    {
        return bankNo;
    }
    public void setBankNo(String bankNo)
    {
        this.bankNo = bankNo;
    }
}