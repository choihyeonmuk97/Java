package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;

public class BoardWriteService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		BoardDao boardDao = new BoardDao();
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		System.out.println(btitle);
		System.out.println(bcontent);
		
		boardDao.listInsert(btitle,bcontent);
		
	}

}
