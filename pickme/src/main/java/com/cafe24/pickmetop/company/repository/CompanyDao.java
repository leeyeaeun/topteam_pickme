package com.cafe24.pickmetop.company.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.admin.model.JobTopIndexVo;
import com.cafe24.pickmetop.company.model.CompanyInfoVo;

@Repository
public class CompanyDao {
	final String NS = "com.cafe24.pickmetop.company.repository.CompanyMapper";
	@Autowired
	@Resource(name = "sqlSessionCompany")
	private SqlSessionTemplate sqlSessionFactoryCompany;
	
	//������� ���̺��� ����̸� ����Ʈ ��ü
	public List<CompanyInfoVo> selectCompanyInfoAllList(){
		return sqlSessionFactoryCompany.selectList(NS + ".selectCompanyInfoAllList");
	}
	//�����ߺз� ���̺��� ����Ʈ ��ü
	public List<JobTopIndexVo> selectJobTopIndexAllList(){
		return sqlSessionFactoryCompany.selectList(NS + ".selectJobTopIndexAllList");
	}
}
