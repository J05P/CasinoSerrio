package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class Users implements Serializable {

	private static final long serialVersionUID = -7050505780032349234L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//para que sea serial.
	private Integer id;
	
	private String user_name;
	private String user_mail;
	private String user_password;
	private Double user_money;
	private boolean admin_check;
	
	public Users() {}

	public Users( String user_name, String user_mail, String user_password, Double user_money,
			boolean admin_check) {

		this.user_name = user_name;
		this.user_mail = user_mail;
		this.user_password = user_password;
		this.user_money = user_money;
		this.admin_check = admin_check;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public Double getUser_money() {
		return user_money;
	}

	public void setUser_money(Double user_money) {
		this.user_money = user_money;
	}

	public boolean isAdmin_check() {
		return admin_check;
	}

	public void setAdmin_check(boolean admin_check) {
		this.admin_check = admin_check;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admin_check, id, user_mail, user_money, user_name, user_password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return admin_check == other.admin_check && Objects.equals(id, other.id)
				&& Objects.equals(user_mail, other.user_mail) && Objects.equals(user_money, other.user_money)
				&& Objects.equals(user_name, other.user_name) && Objects.equals(user_password, other.user_password);
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", user_name=" + user_name + ", user_mail=" + user_mail + ", user_password="
				+ user_password + ", user_money=" + user_money + ", admin_check=" + admin_check + "]";
	}
	
	
	
}
