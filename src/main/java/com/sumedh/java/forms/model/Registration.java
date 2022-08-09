package com.sumedh.java.forms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Registration")
public class Registration {

	@Id
	@GeneratedValue
 	public int UserId;
	
	public String name;
	
	@Column(name="user_name", length=50, nullable=false, unique=false)
	public String userName;
	public String password;
}
