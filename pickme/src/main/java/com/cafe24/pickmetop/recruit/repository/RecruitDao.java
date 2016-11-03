package com.cafe24.pickmetop.recruit.repository;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.admin.model.JobMidIndexVo;
import com.cafe24.pickmetop.admin.model.JobTopIndexVo;
import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;

@Repository
public class RecruitDao {
	private final String NS = "com.cafe24.pickmetop.recruit.repository.RecruitMapper";
	@Autowired
	@Resource(name = "sqlSessionRecruit")
	private SqlSessionTemplate sqlSessionFactoryRecruit;	
	
	//��ü ���� ��з�
	public List<JobTopIndexVo> getJopTopIndexCd(){
		return sqlSessionFactoryRecruit.selectList(NS+".getJobTopIndexCd");
	}
	
	//��ü ���� �ߺз� 
	public List<JobMidIndexVo> getJobMidIndexCd(){
		return sqlSessionFactoryRecruit.selectList(NS+".getJobMidIndexCd");
	}
	
	//RecruitCompanyJob�� ��ü���� �˻�
	public int getCountOfRecruitJob(){
		return sqlSessionFactoryRecruit.selectOne(NS+".getCountOfRecruitJob");
	}
	
	//RecruitCompany ��ü �Է°����� �˻�
	public int getCountOfRecruit(){
		return sqlSessionFactoryRecruit.selectOne(NS+".getCountOfRecruit");
	}
	
	//��������� ����ڵ带 �˻�
	public String getCompanyCd(String companyName){
		return sqlSessionFactoryRecruit.selectOne(NS+".getCompanyCd",companyName);
	}
	
	//��ü ������� �˻�
	public List<String> selectCompany(){
		return sqlSessionFactoryRecruit.selectList(NS+".selectCompany");
	}
	
	//RecruitCompanyJob�Է� 
	public int insertRecruitJob(RecruitCompanyJobVo recruitCompanyJobVo){
		return sqlSessionFactoryRecruit.insert(NS+".insertRecruitJob",recruitCompanyJobVo);
	}
	
	
	//RecruitCompany�Է�
	public int insertRecruitCompany(RecruitCompany recruitCompany){
		return sqlSessionFactoryRecruit.insert(NS+".insertRecruit",recruitCompany);
	}
}
