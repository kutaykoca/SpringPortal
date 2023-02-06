package com.javatpoint.model;
import javax.persistence.*;

@Entity

@Table
public class Admin
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
}