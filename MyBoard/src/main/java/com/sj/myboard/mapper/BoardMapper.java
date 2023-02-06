package com.sj.myboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sj.myboard.vo.Board;

public interface BoardMapper {

	
	@Select("SELECT * FROM board ORDER BY write_date DESC")
	List<Board> getAll();
	
	
	
}
