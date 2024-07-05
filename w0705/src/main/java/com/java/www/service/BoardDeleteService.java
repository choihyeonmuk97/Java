package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BoardDeleteService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		System.out.println(bno);
		BoardDao boardDao = new BoardDao();
		boardDao.deleteOne(bno);
		
	}

}
