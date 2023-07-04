package com.mongoDb.test.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;

@Document("ASSOCIATE")
public class Associate {

    @Id
    private String associateid;
    private String name;
    private String mobile;
    private String email;
    private List<Skills> technical_skills ;
    private List<Skills> non_technical_skills ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociateid() {
        return associateid;
    }

    public void setAssociateid(String associateid) {
        this.associateid = associateid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Skills> getTechnical_skills() {
        return technical_skills;
    }

    public void setTechnical_skills(List<Skills> technical_skills) {
        this.technical_skills = technical_skills;
    }

    public List<Skills> getNon_technical_skills() {
        return non_technical_skills;
    }

    public void setNon_technical_skills(List<Skills> non_technical_skills) {
        this.non_technical_skills = non_technical_skills;
    }
}
