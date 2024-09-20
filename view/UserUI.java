/**
 * Created : 2024-09-20
 * 작성지 : j
 * 유저 화면 구성
 */

package com.ezenbank.apps.view;

import java.util.Scanner;

import com.ezenbank.apps.controller.UserController;
import com.ezenbank.apps.service.User;

import static com.ezenbank.apps.messages.Messages.*;

public class UserUI {
	Scanner scanner = new Scanner(System.in);
	UserController userController = UserController.getInstance();
	User loginUser;
	String message;
	
	public void userApp(User user) {
		loginUser = user;
		message = "";
		while (true) {
			clearCmd();
			println(BLANK + message);
			println(BLANK + BLANK_HALF + loginUser.getUserName() + HEADER_USER_WELCOME);
			println(BLANK + HEADER_USER);
			println(BLANK + USER_LIST1);
			println(BLANK + USER_LIST2);
			println(BLANK + USER_LIST3);
			println(BLANK + USER_LIST4);
			println(BLANK + USER_LIST5);
			println(BLANK + USER_LIST0);
			println(BLANK + FOOTER);
			println(BLANK + ENTER_TASK_NUM);
			switch (scanAndGetString()) {
				case "1" -> depositMoney();
				case "2" -> withdrawMoney();
				case "3" -> showAccountInfo();
				case "4" -> showHistories();
				case "5" -> makeAccount();
				case "0" -> {
					return;
				}
				default -> setMessage(MESSAGE_WRONG_INPUT);
			}
		}
	}
	
	private void depositMoney() {
		clearCmd();
		println(BLANK + HEADER_DEPOSIT);
		Account account = showAccountAndScanIdxAndGetAccount();
		if (account == null) {
			setMessage(MESSAGE_WRONG_INPUT);
			return;
		}
		System.out.print(BLANK + ENTER_MONEY);
		int money = scanAndGetParsedInt();
		if (money == -1) {
			setMessage(MESSAGE_WRONG_INPUT);
			return;
		}
		userController.depositMoney(money, account);
		setMessage(MESSAGE_SUCCESS_LOGIC);
	}
	
}
