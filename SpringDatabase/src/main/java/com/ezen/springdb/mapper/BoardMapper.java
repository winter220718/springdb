package com.ezen.springdb.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ezen.springdb.dto.Board;

public interface BoardMapper {
	
	// resultset.get()으로 꺼낼 필요가 없어짐
	// 중요한 점은 dto의 이름과 컬럼의 이름이 같아야 한다
	@Select("SELECT * FROM board WHERE board_id=#{board_id}")
	Board get(Integer board_id);
	
	
	@Insert("INSERT INTO board VALUES(board_id_seq.NEXTVAL,"
			+ "#{writer_id},#{writer_pw},#{write_title},#{write_content},sysdate,0,0,0)")
	Integer add(Board board);

	
	@Delete("DELETE FROM board WHERE board_id = #{board_id}")
	Integer delete(Board board);
	
}
