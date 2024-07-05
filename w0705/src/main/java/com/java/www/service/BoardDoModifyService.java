package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BoardDoModifyService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		BoardDao boardDao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bfile = request.getParameter("bfile");
		
		System.out.println(btitle);
		System.out.println(bcontent);
		
		boardDao.update(bno,btitle,bcontent,bfile);
//		boardDao.update(new Board(bno,btitle,bcontent,bfile));
		
	}

}
