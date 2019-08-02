package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer userId;
    @Column
    private String userName;
    @Column
    private String Company;
    @Column
    private String Position;
    @Column
    private String Location;
    @Column
    private String Response;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Skill> skills= new LinkedList<>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getCompany() {
        return Company;
    }

    public void setCompany(String userName) {
        this.Company = Company;
    }
    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }
    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    public String getLocation() {
        return Position;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    public String getUserName() {
        return Location;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public User() {
    }

    public User(String userName, List<Skill> skills) {
        this.userName = userName;
        this.skills = skills;
    }
}
