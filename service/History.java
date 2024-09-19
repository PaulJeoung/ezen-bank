/**
 * Created : 2024-09-19
 * 작성지 : j
 * 유저 정보 관리 로직
 * 사용자 ID, 사용자 비밀번호, 사용자 이름, 관리사 유무 정보 조회
 */


package com.ezenbank.apps.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class History {
	
	private String tradeDate;
	private String accountNum;
	private TradeType tradeType;
	private int money;
	private String bankName;
	private int accountBalance;
	
	public History(String accountNum, int accountBalance, TradeType tradeType, int money, String bankName) {
		this.tradeDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.accountNum = accountNum;
		this.tradeType = tradeType;
		this.money = money;
		this.bankName = bankName;
		this.accountBalance = accountBalance;
	}
	
	public String getTradeDate() {
		return tradeDate;
	}
	
	public TradeType getTradeType() {
		return tradeType;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getBankName() {
		return bankName;
	}
}