package com.cafe24.pickmetop.recruit.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;

@Repository
public class RecruitDao {
	private final String NS = "com.cafe24.pickmetop.recruit.repository.RecruitMapper";
	@Autowired
	@Resource(name = "sqlSessionRecruit")
	private SqlSessionTemplate sqlSessionFactoryRecruit;	
	
	
	public int insertRecruitCompany(RecruitCompany recruitCompany, RecruitCompanyJobVo recruitCompanyJobVo){
		return sqlSessionFactoryRecruit.insert(NS+".insertRecruit",recruitCompany);
	}
}
