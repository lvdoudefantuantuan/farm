package com.zk.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Person")
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "created")
	private Long created = System.currentTimeMillis();

	//@Column标记表示所持久化属性所映射表中的字段
	@Column(name = "username")
	private String username;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "remark")
	private String remark;

}
