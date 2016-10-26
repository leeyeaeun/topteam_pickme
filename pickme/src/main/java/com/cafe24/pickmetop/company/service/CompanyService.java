package com.cafe24.pickmetop.company.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.admin.model.JobTopIndexVo;
import com.cafe24.pickmetop.company.model.CompanyInfoVo;
import com.cafe24.pickmetop.company.repository.CompanyDao;

@Service
public class CompanyService {
	private static final Logger logger = LoggerFactory.getLogger(CompanyService.class);
	
	@Autowired
	CompanyDao companyDao;
	
	//������� ����Ʈ��� �޼���
	public List<CompanyInfoVo> getCompanyInfoList(){
		return companyDao.selectCompanyInfoAllList();
	}
	
	//�����ߺз� ����Ʈ ��� �޼���
	public List<JobTopIndexVo> getJobTopIndexList(){
		return companyDao.selectJobTopIndexAllList();
	}
	
}
