package com.kleenxcoder.customer.base.impl.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "user")
@Description("user table")
@EqualsAndHashCode(callSuper = true)
public class CustomerUser extends CustomerBaseUser {

	private static final long serialVersionUID = 1L;
	
}