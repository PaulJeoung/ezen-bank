/**
 * Created : 2024-09-19
 * 작성지 : j
 * 유저 정보 관리 로직
 * 사용자 ID, 사용자 비밀번호, 사용자 이름, 관리사 유무 정보 조회
 */

package com.ezenbank.apps.service;

public class User {
	private String userId;
	private String passWord;
	private String userName;
	private boolean isAdmin;
	
	public User(String userId, String pw, String name, boolean isAdmin) {
		this.userId = userId;
		this.passWord = pw;
		this.userName = name;
		this.isAdmin = isAdmin;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	
	public void changeUserPassword(String pw) {
		this.passWord = pw;
	}
}
