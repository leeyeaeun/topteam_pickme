package com.cafe24.pickmetop.recruit.repository;

import java.util.List;
import java.util.Map;

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
	
	
	
	public List<String> selectCompany(){
		return sqlSessionFactoryRecruit.selectList(NS+".selectCompany");
	}
	//RecruitCompanyJob입력 
	public int insertRecruitJob(RecruitCompanyJobVo recruitCompanyJobVo){
		return sqlSessionFactoryRecruit.insert(NS+".insertRecruitJob",recruitCompanyJobVo);
	}
	
	
	//RecruitCompany입력
	public int insertRecruitCompany(RecruitCompany recruitCompany){
		return sqlSessionFactoryRecruit.insert(NS+".insertRecruit",recruitCompany);
	}
}
