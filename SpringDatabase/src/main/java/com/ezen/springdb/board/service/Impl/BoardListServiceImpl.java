package com.ezen.springdb.board.service.Impl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.springdb.board.mapper.ServiceBoardMapper;
import com.ezen.springdb.board.service.BoardListService;
import com.ezen.springdb.dto.BoardDTO;

@Service
public class BoardListServiceImpl implements BoardListService{

	@Autowired
	ServiceBoardMapper board_mapper;
	// 나중에 들어올거야 하고 어음을 써놓는다.. 무슨소리임?
	
	@Override
	public BoardDTO clickTitle(Integer board_id, HttpServletRequest request, HttpServletResponse response) {
		// 비즈니스 계층에서 영속으로 접근이 이뤄져야함. 컨트로럴에서 x
		
		// 글의 상세 내용을 가져온다 (영속)
		BoardDTO board = board_mapper.get(board_id);
		
		// 최근에 조회한적이 있는지 검사한 후 (쿠키 검사, 추가 또는 갱신)
		Cookie[] cookies = request.getCookies();
		
		boolean viewed = false;
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("viewed")){
				//조회가 된다는 것은 본적이 이따
				viewed = true;
			}
		}
		
		if (!viewed) {
			
			// 해당 글의 조회수를 1 올린다 (영속)
			board_mapper.plusView(board_id);		
			response.addCookie(new Cookie("viewed", "1"));
		}
				
		
		return board;
	}



	
	
}
