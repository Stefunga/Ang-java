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
    private String Company;
    @Column
    private String Position;
    @Column
    private String Location;
    @Column
    private String Response;
    @Column
	private String Date;
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

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
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

    public User(String Position,String Location,String Company,String Date, String Response, String Site) {
    	 this.Position = Position;
    	 this.Response = Response;
    	 this.Company = Company;
    	 this.Location = Location;
    	 this.Date = Date;
    	 this.Site = Site;
    }
}
