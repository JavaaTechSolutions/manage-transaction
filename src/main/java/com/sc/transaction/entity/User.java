package com.sc.transaction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_info")
public class User {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@Column
	private String mobile;

	@OneToOne
	private Address address;
}
