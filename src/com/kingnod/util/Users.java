package com.kingnod.util;

import org.apache.shiro.SecurityUtils;

import com.kingnod.shiro.ShiroDbRealm.ShiroUser;

public class Users {
	
	public static ShiroUser shiroUser(){
		return (ShiroUser)SecurityUtils.getSubject().getPrincipal();
	}
	
	public static Long userId(){
		ShiroUser shiroUser= (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		return shiroUser.id;
	}
}
