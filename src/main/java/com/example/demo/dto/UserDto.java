package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;


public class UserDto {
    String Response;
    String Position;
	Integer userId;
    String Company;
    String Location;
    String Date;
 
    String Site;

    public UserDto(Integer userId,String Company,String Response,String Position, String Location, String Date,String Site) {
        this.userId = userId;
        this.Company = Company;
        this.Response = Response;
        this.Position = Position;
        this.Location = Location;
        this.Date = Date;
        this.Site = Site;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
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
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getDate() {
        return Date;
    }
    
    public void setCompany(String Company) {
        this.Company = Company;
    }
    public String getCompany() {
        return Company;
    }
    public void setSite(String Site) {
        this.Site = Site;
    }
    public String getSite() {
        return Site;
    }

}
