package com.cafe24.pickmetop.company.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	final String NS = "com.cafe24.pickmetop.company.repository.CompanyMapper";
	
	
}
