package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer userId;
    @Column
    private String Company;
    @Column
    private String Position;
    @Column
    private String Location;
    @Column
    private String Response;
    @Column	
    private LocalDate Date;
    @Column
  	private String Site;
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
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
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}
	public String getSite() {
		return Site;
	}

	public void setSite(String site) {
		Site = site;
	}
    public User() {
    }

    public User(String Position,String Location,String Company,LocalDate Date, String Response, String Site) {
    	 this.Position = Position;
    	 this.Response = Response;
    	 this.Company = Company;
    	 this.Location = Location;
    	 this.Date = Date;
    	 this.Site = Site;
    }
}
