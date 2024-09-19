/**
 * Created : 2024-09-19
 * 작성지 : j
 * 계좌 데이터 베이스 설계
 * 
 */
package com.ezenbank.apps.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDB {
	
	private static final AccountDB accountDB = new AccountDB();
	
	public static AccountDB getInstance() {
		return accountDB;
	}
	
	private final ArrayList<Account>accountList = new ArrayList<>();

	public void insertAccount(Account account) {
		accountList.add(account);
	}
	
	public void deleteAccount(AccountDB account) {
		accountList.remove(account);
	}
	
	public ArrayList<Account> getAllAcount() {
		return accountList;
	}
	
	public List<Account> getAllAcountByUserId(String userId) {
		return accountList.stream().filter(x->x.getUserId().equals(userId)).collect(Colloctors.toList());
	}
	
	public Optional<Account> getAccountByAccountNumber(String userAccount){
		return accountList.stream().filter(x->x.getAccountNum().equals(userAccount)).findFirst();
	}
	
}
