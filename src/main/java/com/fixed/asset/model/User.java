package com.fixed.asset.model;

import java.util.List;

//import javax.persistence.ManyToMany;

public class User {
    private Integer userId;

    private String userName;

    private String password;
    
    private List<Role> roles;
    
//    @ManyToMany(mappedBy="")
    public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}