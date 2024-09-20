/**
 * Created : 2024-09-20
 * 작성지 : j
 * 사용자 컨트롤러
 * 
 */

package com.ezenbank.apps.controller;

import java.util.Optional;

import com.ezenbank.apps.data.AccountDB;
import com.ezenbank.apps.data.HistroryDB;
import com.ezenbank.apps.data.UserDB;
import com.ezenbank.apps.service.Account;
import com.ezenbank.apps.service.History;
import com.ezenbank.apps.service.TradeType;
import com.ezenbank.apps.service.User;

public class UserController {
	
	UserDB userDB = UserDB.getInstance();
	AccountDB accountDB = AccountDB.getInstance();
	HistroryDB historyDB = HistroryDB.getInstance();
	
	private static UserController userController = new UserController();
	
	public static UserController getInstance() {
		return userController;
	}
	
	public AccountDB signUp(String name, String id, String pw) {
		Optional<User> opUser = userDB.getUserByUserId(id);
		if (opUser.isPresent()) {
			throw new IllegalArgumentException(EXCEPTION_DOUBLE_ID);
		}
		User user = new User(id, pw, name, false);
		Account account = new Account(user.getUserId(), user.getUserName(), 0);
		History history = new History(account.getAccountNum(), account.getAccountBalance(), TradeType.생성, 0, "조미김");
		userDB.insertUser(user);
		accountDB.insertAccount(account);
		historyDB.insertHistory(history);
		return account;
	}
	
	public User login(String id, String pw) {
		Optional<User> opUser = userDB.getUserByUserId(id);
		User user = opUser.orElseThrow(() -> new IllegalArgumentException(EXCEPTION_NO_ID));
		if (!user.getPassWord().equals(pw)) {
			throw new IllegalArgumentException(EXCEPTION_WRONG_PW);
		}
		return user;
	}
	

}
