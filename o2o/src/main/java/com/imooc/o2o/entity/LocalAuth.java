package com.imooc.o2o.entity;

import java.util.Date;

public class LocalAuth {
	// 本地账号ID
	private Long localAuthId;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 用户信息(用户ID)
	private PersonInfo personInfo;
	// 创建时间
	private Date createTime;
	// 最后更新时间
	private Date last_edit_time;

	public Long getLocalAuthId() {
		return localAuthId;
	}

	public void setLocalAuthId(Long localAuthId) {
		this.localAuthId = localAuthId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLast_edit_time() {
		return last_edit_time;
	}

	public void setLast_edit_time(Date last_edit_time) {
		this.last_edit_time = last_edit_time;
	}

}
