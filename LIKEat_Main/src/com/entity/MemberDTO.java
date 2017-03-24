package com.entity;

public class MemberDTO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private String phone1;
	
	public MemberDTO() {
	}

	public MemberDTO(String userid, String userpw, String username, String email, String phone1) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.email = email;
		this.phone1 = phone1;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email
				+ ", phone1=" + phone1 + "]";
	}
	
}
