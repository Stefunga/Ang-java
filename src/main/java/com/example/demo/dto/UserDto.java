package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
public class UserDto {
    String Response;
    String Position;
	Integer userId;
    String userName;
    String Company;
    String Location;
    String Date;
    List<SkillDto> skillDtos= new ArrayList<>();

    public UserDto(Integer userId, String userName,String Company,String Response,String Position, List<SkillDto> skillDtos) {
        this.userId = userId;
        this.userName = userName;
        this.skillDtos = skillDtos;
        this.Company = Company;
        this.Response = Response;
        this.Position = Position;

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
        return Position;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }
    public String getCompany() {
        return Company;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }
}
