/**
 * Created : 2024-09-19
 * 작성지 : j
 * 은행 업무 사용 로직
 * 계좌 생성 (사용자 ID 이용)
 * 계좌 정보, 사용자 정보, 잔액 조회 기능
 * 입금 로직 추가
 */

package com.ezenbank.apps.service;

public class Account {

	private int accountBalance;
	private String userId;
	private String accountNum;
	private String userName;
	
	public Account(String userId, String userName, int countAc) {
		this.accountNum = makeAccountNum(userId, countAc);
		this.accountBalance = 0;
		this.userName = userName;
		this.userId = userId;
	}
	
	private String makeAccountNum(String userId, int countAc) {
		String acNum = "031-55-";
		String tempString = "";
		
		for (int i=0; i<userId.length(); i++) {
			int temp = userId.charAt(i) % 10;
			tempString += String.valueOf(temp);
			if(tempString.length() == 6) {
				break;
			}
		}
		
		Integer tempInt = Integer.valueOf(tempString);
		tempInt += (countAc * 17);
		acNum += tempInt;
		return acNum;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	
	public void depositMoney(int money) {
		this.accountBalance += money;
	}
	
	public String toString() {
		return
				"계좌번호 : " + accountNum +
				"이름    : " + userName + 
				"아이디   : " + userId + 
				"잔액    : " + accountBalance;
	}
	
	
}
