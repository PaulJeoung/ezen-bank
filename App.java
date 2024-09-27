/**
 * Created : 2024-09-20
 * 작성지 : j
 * Main 함수
 * initial 데이터 삽입
 * case 문 메뉴 구성
 */

package com.ezenbank.apps;

import java.util.Scanner;

import com.ezenbank.apps.controller.AdminController;
import com.ezenbank.apps.controller.UserController;
import com.ezenbank.apps.service.Account;
import com.ezenbank.apps.service.User;
import com.ezenbank.apps.view.AdminUI;
import com.ezenbank.apps.view.UserUI;

import static com.ezenbank.apps.messages.Messages.*;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	static String message = "";
	static UserController userController = UserController.getInstance();
	static AdminController adminController = AdminController.getInstance();
	static UserUI userUI = new UserUI();
	static AdminUI adminUI = new AdminUI();
	
	public static void main (String args[]) {
		initData();
		while (true) {
			clearCmd();
			println(BLANK + message);
			println(BLANK + HEADER_HOME);
			println(BLANK + LIST_HOME1);
			println(BLANK + LIST_HOME2);
			println(BLANK + LIST_HOME0);
			println(BLANK + FOOTER);
			println(BLANK + ENTER_TASK_NUM);
			switch (scanner.nextLine()) {
				case "1" -> signUp();
				case "2" -> login();
				case "0" -> System.exit(0);
				default -> message = MESSAGE_WRONG_INPUT;		
			}
		}
	}
	
	static void initData() {
		User user = new User("ezens", "ezens", "이젠쓰", false);
		
		userController.signUp("김철수", "cheolsoo", "cheolsoo");
		userController.signUp("강민희", "minhee", "minhee");
		userController.signUp("이민", "minlee", "minlee");
		Account account = userController.signUp(user.getUserName(), user.getUserId(), user.getPassWord());
		adminController.signUp("슈퍼이젠", "admin_ezen", "admin_ezen");
		adminController.signUp("이젠뱅크지점장", "admin_bank", "admin_bank");
		userController.depositMoney(5000, account);
		userController.validateWithdrawAndDoController(account, 500);
		userController.makeAccount(user);
		userController.makeAccount(user);
		userController.depositMoney(30000, account);
		userController.depositMoney(2000, account);
		userController.validateWithdrawAndDoController(account, 5000);
		userController.depositMoney(7000, account);
		userController.validateWithdrawAndDoController(account, 20000);
	}
	
	static void signUp() {
		clearCmd();
		println(BLANK + HEADER_SIGN_UP);
		print(BLANK + ENTER_NAME);
		String name = scanner.nextLine();
		print(BLANK + ENTER_ID);
		String id = scanner.nextLine();
		print(BLANK + ENTER_PW);
		String pw = scanner.nextLine();
		if (id.startsWith(ADMIN_PREFIX)) {
			try {
				adminController.signUp(name, id, pw);
				message = MESSAGE_SUCCESS_SIGNUP;
			} catch (Exception e) {
				if (e.getMessage().equals(EXCEPTION_DOUBLE_ID)) {
					message = MESSAGE_DOUBLE_ID;
				} else {
					message = MESSAGE_WRONG_INPUT;
				}
			}
		} else {
			try {
				userController.signUp(name, id, pw);
				message = MESSAGE_SUCCESS_SIGNUP;
			} catch (Exception e) {
				if (e.getMessage().equals(EXCEPTION_DOUBLE_ID)) {
					message = MESSAGE_DOUBLE_ID;
				} else {
					message = MESSAGE_WRONG_INPUT;
				}
			}
		}
	}
	
	static void login() {
		clearCmd();
		println(BLANK + HEADER_LOGIN);
		print(BLANK + ENTER_ID);
		String id = scanner.nextLine();
		print(BLANK + ENTER_PW);
		String pw = scanner.nextLine();
		if (id.startsWith(ADMIN_PREFIX)) {
			try {
				User user = adminController.login(id, pw);
				adminUI.adminApp(user);
				message = MESSAGE_SUCCESS_LOGOUT;
			} catch (Exception e) {
				if (e.getMessage().equals(EXCEPTION_NO_ID)) {
					message = MESSAGE_NO_ID;
				} else if (e.getMessage().equals(EXCEPTION_WRONG_PW)) {
					message = MESSAGE_WRONG_PW;
				} else {
					message = MESSAGE_WRONG_INPUT;
				}
			}
		} else {
			try {
				User user = userController.login(id, pw);
				userUI.userApp(user);
				message = MESSAGE_SUCCESS_LOGOUT;
			} catch (Exception e) {
				if (e.getMessage().equals(EXCEPTION_NO_ID)) {
					message = MESSAGE_NO_ID;
				} else if (e.getMessage().equals(EXCEPTION_WRONG_PW)) {
					message = MESSAGE_WRONG_PW;
				} else {
					message = MESSAGE_WRONG_INPUT;
				}
			}
		}
	}
}
