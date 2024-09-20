/**
 * Created : 2024-09-19
 * 작성지 : j
 * 회원관리 데이터 베이스 설계
 * 
 */
package com.ezenbank.apps.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ezenbank.apps.service.User;

public class UserDB {

	private static final UserDB UserDB = new UserDB();
	
	public static UserDB getInstance() {
		return UserDB;
	}
	
	private final ArrayList<User> userList = new ArrayList<>();
	
	public void insertUser(User user) {
		userList.add(user);
	}
	
	public Optional<User> getUserByUserId(String userId) {
		User findUser = null;
		for (User user : userList) {
			if (user.getUserId().equals(userId)) {
				findUser = user;
				break;
			}
		}
		return Optional.ofNullable(findUser);
	}
	
	public List<User>getAllUsers() {
		return userList.stream().filter(x -> !x.isAdmin()).collect(Collectors.toList());
	}
}
