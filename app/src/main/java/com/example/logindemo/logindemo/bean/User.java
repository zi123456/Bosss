package com.example.logindemo.logindemo.bean;

public class User {

	private Integer id;
	private String ssid;
	private String password;
	private String name;
	private String headUrl;
	private String token;

	public User() {
		super();
	}

	public User(Integer id, String ssid, String password, String name, String headUrl, String token) {
		super();
		this.id = id;
		this.ssid = ssid;
		this.password = password;
		this.name = name;
		this.headUrl = headUrl;
		this.token = token;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
