package com.fullstack.project.entity;



import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class User {
     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String username;
 private String gender;
 private String email_id;
 private String phone_number;
 private String password;
 private String user_Type;
 private boolean InActive=true;
 private Integer logincount=0;
 private String SSotype;

 

private LocalDateTime loginAt;
 @CreationTimestamp
 private LocalDateTime createAt;
@UpdateTimestamp
 private LocalDateTime updateAt;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUser_Type() {
	return user_Type;
}
public void setUser_Type(String user_Type) {
	this.user_Type = user_Type;
}
public boolean isInActive() {
	return InActive;
}
public void setInActive(boolean inActive) {
	InActive = inActive;
}
public Integer getLogincount() {
	return logincount;
}
public void setLogincount(Integer logincount) {
	this.logincount = logincount;
}
public String getSSotype() {
	return SSotype;
}
public void setSSotype(String sSotype) {
	SSotype = sSotype;
}
public LocalDateTime getLoginAt() {
	return loginAt;
}
public void setLoginAt(LocalDateTime loginAt) {
	this.loginAt = loginAt;
}
public LocalDateTime getCreateAt() {
	return createAt;
}
public void setCreateAt(LocalDateTime createAt) {
	this.createAt = createAt;
}
public LocalDateTime getUpdateAt() {
	return updateAt;
}
public void setUpdateAt(LocalDateTime updateAt) {
	this.updateAt = updateAt;
}
@Override
public String toString() {
	return "User [username=" + username + ", gender=" + gender + ", email_id=" + email_id + ", phone_number=" + phone_number
			+ ", password=" + password + ", user_Type=" + user_Type + ", InActive=" + InActive + ", logincount="
			+ logincount + ", SSotype=" + SSotype + ", loginAt=" + loginAt + ", createAt=" + createAt + ", updateAt="
			+ updateAt + "]";
}
public User(String username, String gender, String email_id, String phone_number, String password, String user_Type,
		boolean inActive, Integer logincount, String sSotype, LocalDateTime loginAt, LocalDateTime createAt, LocalDateTime updateAt) {
	super();
	this.username = username;
	this.gender = gender;
	this.email_id = email_id;
	this.phone_number = phone_number;
	this.password = password;
	this.user_Type = user_Type;
	InActive = inActive;
	this.logincount = logincount;
	SSotype = sSotype;
	this.loginAt = loginAt;
	this.createAt = createAt;
	this.updateAt = updateAt;
}
public User(long id, String username, String gender, String email_id, String phone_number, String password,
		String user_Type, boolean inActive, Integer logincount, String sSotype, LocalDateTime loginAt,
		LocalDateTime createAt, LocalDateTime updateAt) {
	super();
	this.id = id;
	this.username = username;
	this.gender = gender;
	this.email_id = email_id;
	this.phone_number = phone_number;
	this.password = password;
	this.user_Type = user_Type;
	InActive = inActive;
	this.logincount = logincount;
	SSotype = sSotype;
	this.loginAt = loginAt;
	this.createAt = createAt;
	this.updateAt = updateAt;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

//@PrePersist
//public void oncreate() {
//	
//	DateTime currenttime=new DateTime();
//	    this.createAt =currenttime;
//}
//@PostPersist
//public void update() {
//	DateTime currenttime=new DateTime();
//    this.updateAt =currenttime;
//}
// 

}
