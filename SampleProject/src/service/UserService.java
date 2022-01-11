package service;

import java.util.HashMap;
import java.util.Map;

import controller.Controller;
import dao.UserDao;
import util.ScanUtil;
import util.View;

public class UserService {
	//싱글톤 패턴
	private UserService() {}
	private static UserService instance;
	public static UserService getInstnace() {
		if(instance == null) {
			instance= new UserService();
		}
		return instance;
	}
	
	private UserDao userDao = UserDao.getInstnace();
	
	public int join() {
		System.out.println("=====================회원가입======================");
		System.out.print("아이디  > ");
		String memId = ScanUtil.nextLine();
		System.out.print("비밀번호  > ");
		String password = ScanUtil.nextLine();
		System.out.print("이름  > ");
		String memName = ScanUtil.nextLine();
		//아이디 중복 확인 생략
		//비밀번호 확인 생략
		//유효성 검사(정규식표현) 생략
		
		Map<String, Object> param = new HashMap<>();
		param.put("MEM_ID", memId);
		param.put("PASSWORD", password);
		param.put("MEM_NAME", memName);
		
		int result = userDao.insertMember(param);
		
		if(0 < result) {
		System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		return View.HOME;
	}

	public int login() {
		System.out.println("===========================로그인=======================");
		System.out.println("아이디 > ");
		String memId = ScanUtil.nextLine();
		System.out.println("비밀번호 > ");
		String password = ScanUtil.nextLine();
		
		Map<String, Object> member = userDao.selectMember(memId, password);
		
		if(member == null) {
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else {
			System.out.println("로그인 성공");
			
			Controller.LoginMember = member;
			
			return View.BOARD_LIST;
		}
		
		return View.LOGIN;
	}
	
}
