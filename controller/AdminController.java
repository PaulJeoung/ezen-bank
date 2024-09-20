/**
 * Created : 2024-09-20
 * 작성지 : j
 * 관리자 모드 컨트롤러
 * 가입, 로그인, 사용자 아이디/패스워드 확인, 패스워드 변경, 계좌 확인
 * 사용자 계좌 생성 확인
 * 계좌 데이터 베이스에서 모든 정보 리턴
 * 이력 데이터 베이스에서 모든 정보 리턴
 * 사용자 데이터 베이스에서 모든 정보 리턴
 */


package com.ezenbank.apps.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ezenbank.apps.data.AccountDB;
import com.ezenbank.apps.data.HistroryDB;
import com.ezenbank.apps.data.UserDB;
import com.ezenbank.apps.service.Account;
import com.ezenbank.apps.service.History;
import com.ezenbank.apps.service.User;

public class AdminController {
	
	UserDB userDB = UserDB.getInstance();
	AccountDB accountDB = AccountDB.getInstance();
	HistroryDB histroryDB = HistroryDB.getInstance();
	
	private static final AdminController adminController = new adminController();
	
	public static AdminController getInstance() {
		return adminController;
	}
	
	public void signUp(String name, String id, String pwString ) {
		Optional<User> opUser = userDB.getUserByUserId(id);
		if(opUser.isPresent()) {
			throw new IllegalArgumentException(EXCEPTION_DOUBLE_ID);
		}
		User user = new User(id, pw, name, true);
		userDB.insertUser(user);
	}
	
	public User login(String id, String pw) {
		Optional<User> opUserOptional = userDB.getUserByUserId(id);
		User user = opUser.orElseThrow(() -> new IllegalArgumentException(EXCEPTION_NO_ID);
		if (!user.getPassWord().equals(pw)) {
			throw new IllegalArgumentException(EXCEPTION_WRONG_PW);
		}
		return user;
	}
	
	public Optional<User> confirmId(String id){
		Optional<User> opUser = userDB.getUserByUserId(id);
		if (opUser.isEmpty()) {
			throw new IllegalArgumentException(EXCEPTION_NO_ID);
		}
		return opUser;
	}
	
	public void changeUserPw(String id, String pw) {
		Optional<User> user = confirmId(id);
		if (user.isEmpty()) {
			throw new IllegalArgumentException(EXCEPTION_NO_ID);
		}
		User foundUser = user.get();
		foundUser.changeUserPassword(pw);
	}
	
	public List<Account> getUserAccounts(String id) {
		Optional<User> userOptional = confirmId(id);
		List<Account>accounts = accountDB.getAllAcount().stream().filter(i -> i.getUserID().equals(id)).collect(Collectors.toList());
		if (accounts.isEmpty()) {
			throw new IllegalArgumentException("계좌가 없습니다");
		}
		return accounts;
	}
	
	public List<Account> getUserAccountsById(String userId){
		List<Account> accounts = accountDB.getAllAccountByUserId(userId);
		if (accounts.isEmpty()) {
			throw new IllegalArgumentException("해당 유저의 계좌가 없습니다");
		}
		return accounts;
	}
	
	public void deleteAccount(Account account) {
		accountDB.deleteAccount(account);
		histroryDB.deleteHistoriesByAccountNumber(account.getAccountNum());
	}
	
	public Account findAccountsByAccountNum(String userAccountNum) {
		Optional<Account> OpAccount = accountDB.getAccountByAccountNumber(userAccountNum);
		if (OpAccount.isEmpty()) {
			throw new IllegalArgumentException("존재하지 않는 계좌");
		}
		return OpAccount.get();
	}
	
	public ArrayList<Account> getAllAcounts() {
		return accountDB.getAllAcount();
	}
	
	public ArrayList<History> getAllHistories() {
		return histroryDB.getAllHistory();
	}
	
	public List<User> getAllUsers() {
		return userDB.getAllUsers();
	}

}
