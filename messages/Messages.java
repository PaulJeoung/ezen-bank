/**
 * Created : 2024-09-20
 * 작성지 : j
 * 출력 메시지 관리
 * 
 */
package com.ezenbank.apps.messages;

public class Messages {
	public static final String BLANK_HALF = "                          ";
    public static final String BLANK = "                                                    ";
    public static final String CLEAR = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    public static final String ADMIN_PREFIX = "admin_";

    // App.java (메인 페이지) 프린터 시작
    public static final String LIST_HOME1 =                      "                            1️⃣ 회원 가입";
    public static final String LIST_HOME2 =                      "                            2️⃣ 로그인";
    public static final String LIST_HOME0 =                      "                            0️⃣ 프로그램 종료";

    public static final String ADMIN_LIST1 =                     "                            1️⃣ 사용자 비밀번호 수정";
    public static final String ADMIN_LIST2 =                     "                            2️⃣ 사용자 계좌 삭제";
    public static final String ADMIN_LIST3 =                     "                            3️⃣ 계좌번호로 사용자 찾기";
    public static final String ADMIN_LIST4 =                     "                            4️⃣ 사용자 ID로 계좌 찾기";
    public static final String ADMIN_LIST5 =                     "                            5️⃣ 은행 내 모든 계좌 조회";
    public static final String ADMIN_LIST6 =                     "                            6️⃣ 은행 내 모든 거래 내역 조회";
    public static final String ADMIN_LIST0 =                     "                            0️⃣ 로그아웃";

    public static final String USER_LIST1 =                      "                            1️⃣ 입금하기";
    public static final String USER_LIST2 =                      "                            2️⃣ 출금하기";
    public static final String USER_LIST3 =                      "                            3️⃣ 사용자 정보 조회하기";
    public static final String USER_LIST4 =                      "                            4️⃣ 계좌 거래 내역 조회하기";
    public static final String USER_LIST5 =                      "                            5️⃣ 계좌 만들기";
    public static final String USER_LIST0 =                      "                            0️⃣ 로그아웃";

    public static final String EXCEPTION_DOUBLE_ID = "아이디 중복";
    public static final String EXCEPTION_NO_ID = "아이디 없음";
    public static final String EXCEPTION_WRONG_PW = "비밀번호 불일치";

    public static final String HEADER_HOME =                     "                    \uD83D\uDCB0 조미김 은행에 오신걸 환영합니다 \uD83D\uDCB0";
    public static final String HEADER_LOGIN =                    "                            \uD83D\uDCB0 로그인 페이지 \uD83D\uDCB0";
    public static final String HEADER_SIGN_UP =                  "                           \uD83D\uDCB0 회원가입 페이지 \uD83D\uDCB0";

    public static final String MESSAGE_WRONG_INPUT =             "                           \uD83D\uDD34 잘못된 입력입니다 \uD83D\uDD34";
    public static final String MESSAGE_DOUBLE_ID =               "                        \uD83D\uDD34 이미 가입된 아이디입니다 \uD83D\uDD34";
    public static final String MESSAGE_NO_ID =                   "                        \uD83D\uDD34 존재하지 않는 아이디입니다 \uD83D\uDD34";
    public static final String MESSAGE_WRONG_PW =                "                       \uD83D\uDD34 비밀번호가 일치하지 않습니다 \uD83D\uDD34";
    public static final String MESSAGE_SUCCESS_SIGNUP =          "                      \uD83D\uDFE2 정상적으로 회원가입 되었습니다 \uD83D\uDFE2";
    public static final String MESSAGE_SUCCESS_LOGOUT =          "                      \uD83D\uDFE2 정상적으로 로그아웃 되었습니다 \uD83D\uDFE2";

    public static final String HEADER_USER =                     "                         \uD83D\uDCB0 조미김 은행 회원 페이지 \uD83D\uDCB0";
    public static final String HEADER_DEPOSIT =                  "                             \uD83D\uDCB0 입금 페이지 \uD83D\uDCB0";
    public static final String HEADER_WITHDRAW =                 "                             \uD83D\uDCB0 출금 페이지 \uD83D\uDCB0";
    public static final String HEADER_SHOW_ACCOUNT_INFO =        "                          \uD83D\uDCB0 사용자 정보 페이지 \uD83D\uDCB0";
    public static final String HEADER_MAKE_ACCOUNT =             "                         \uD83D\uDCB0 계좌 추가 생성 페이지 \uD83D\uDCB0";

    public static final String MESSAGE_SUCCESS_LOGIC =           "                     \uD83D\uDFE2 요청이 정상적으로 처리되었습니다 \uD83D\uDFE2";
    public static final String MESSAGE_STOP_LOGIC =              "                          \uD83D\uDD34 요청이 중단 되었습니다 \uD83D\uDD34";
    public static final String MESSAGE_NO_MORE_ACCOUNT =         "                     \uD83D\uDD34 계좌는 5개 이상 만드실 수 없습니다 \uD83D\uDD34";
    public static final String MESSAGE_NO_ACCOUNT =              "             \uD83D\uDD34 잘못 입력하셨거나, 해당 유저의 계좌가 존재하지 않습니다 \uD83D\uDD34";

    public static final String HEADER_ADMIN =                    "                        \uD83D\uDCB0 조미김 은행 관리자 페이지 \uD83D\uDCB0";
    public static final String HEADER_CHANGE_PASSWORD =          "                       \uD83D\uDCB0 사용자 비밀번호 변경 페이지 \uD83D\uDCB0";
    public static final String HEADER_DELETE_ACCOUNT =           "                         \uD83D\uDCB0 사용자 계좌 삭제 페이지 \uD83D\uDCB0";
    public static final String HEADER_FIND_USER =                "                     \uD83D\uDCB0 계좌번호로 사용자 찾기 페이지 \uD83D\uDCB0";
    public static final String HEADER_FIND_ACCOUNT =             "                      \uD83D\uDCB0 사용자 ID로 계좌 찾기 페이지 \uD83D\uDCB0";
    public static final String HEADER_ALL_ACCOUNT =              "                         \uD83D\uDCB0 모든 계좌 조회 페이지 \uD83D\uDCB0";
    public static final String HEADER_ALL_HISTORY =              "                       \uD83D\uDCB0 모든 거래 내역 조회 페이지 \uD83D\uDCB0";
    public static final String FOOTER =                          "==============================================================================";

    public static final String HEADER_USER_WELCOME =             " 님 환영합니다!";

    public static final String ACCOUNT_LIST = "\uD83C\uDFE6 소지하고 계신 계좌의 목록입니다";
    public static final String HISTORY_LIST = "\uD83C\uDFE6 요청하신 거래 내역의 목록입니다";
    public static final String ACCOUNT_BLANCE = "\uD83D\uDCB5 해당 계좌의 잔액입니다: ";
    public static final String USER_ID = "\uD83D\uDCB5 사용자 아이디 : ";
    public static final String USER_NAME = "\uD83D\uDCB5 사용자 이름 : ";

    public static final String ALL_USER_ID = "\uD83C\uDFE6 은행 내 모든 사용자 ID 입니다";
    public static final String ALL_ACCOUNT = "\uD83C\uDFE6 은행 내 모든 계좌번호 목록 입니다";
    public static final String ALL_HISTORY = "\uD83C\uDFE6 은행 내 모든 거래 내역 목록 입니다";

    public static final String USER_NAME_No_Emoji = " 사용자 이름 : ";
    
    public static final String BALANCE = ", 잔액: ";

    public static final String ENTER_NAME = "☑️ 이름 입력: ";
    public static final String ENTER_ID = "☑️ 아이디 입력: ";
    public static final String ENTER_PW = "☑️ 비밀번호 입력: ";
    public static final String ENTER_TASK_NUM = "☑️ 원하시는 작업을 입력해주세요: ";

    public static final String ENTER_MONEY = "☑️ 처리할 금액을 입력해주세요: ";
    public static final String ENTER_ACCOUNT = "☑️ 처리할 계좌의 순번을 입력해주세요: ";
    public static final String ENTER_Y_TO_MAKE_ACCOUNT = "☑️ 계좌를 추가로 만드시려면 y 를 입력해주세요: ";
    public static final String ENTER_Y_TO_DELETE = "☑️ 계좌를 정말 삭제하려면 y 를 입력해주세요: ";

    public static final String ENTER_USER_ID = "☑️ 변경하려는 유저 ID를 입력해주세요: ";
    public static final String ENTER_NEW_PW = "☑️ 새로운 비밀번호를 입력해주세요: ";
    public static final String ENTER_USER_ID_ACCOUNT = "☑️ 찾으려는 계좌를 가진 사용자의 ID를 입력해주세요: ";
    public static final String ENTER_ACCOUNT_USER_ACCOUNTNUM = "☑️ 찾으려는 계좌의 계좌번호를 입력해주세요: ";
    public static final String ENTER_ANYKEY_TO_BACK = "☑️ 돌아가려면 아무 키나 입력해주세요: ";

    public static final String ADMIN_WELCOME_SUFFIX = " 관리자님 환영합니다";
    public static final String USER_ACCOUNT =  "사용자 계좌 번호:";
    public static final String IS_ACCOUNT_LIST =  " 님의 계좌 목록입니다";

    public static void clearCmd() {
        System.out.println(CLEAR);
    }

    public static void println(String s){
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
