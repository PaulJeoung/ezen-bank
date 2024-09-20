/**
 * Created : 2024-09-19
 * 작성지 : j
 * 이력 데이터 베이스 설계
 * 
 */

package com.ezenbank.apps.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ezenbank.apps.service.History;

public class HistroryDB {
	private static final HistroryDB historyDB = new HistroryDB();
	
	public static HistroryDB getInstance() {
		return historyDB;
	}
	
	private final ArrayList<History> histories = new ArrayList<>();
	
	public ArrayList<History> getAllHistory() {
		return histories;
	}
	
	public void insertHistory(History history) {
		histories.add(history);
	}
	
	public void deleteHistoriesByAccountNumber(String accountNum) {
		histories.stream().filter(a -> a.getAccountNum().equals(accountNum)).toList().forEach(h -> histories.remove(h));
	}
	
	public List<History> getAllHistoryListByAccountNum(String accountNum) {
		return histories.stream().filter(x -> x.getAccountNum().equals(accountNum)).collect(Collectors.toList());
	}

}
