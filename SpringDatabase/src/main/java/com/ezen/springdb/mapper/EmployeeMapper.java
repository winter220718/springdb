package com.ezen.springdb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ezen.springdb.dto.Employee;

public interface EmployeeMapper {
	
	// �씠�윴 mapper瑜� 留뚮뱾�뼱�떖�씪怨� mtbitise�뿉寃� 遺��긽
	@Select("SELECT * FROM employees")
	public List<Employee> getList();
	
	
}
