package com.cafe24.pickmetop.recruit.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;
import com.cafe24.pickmetop.recruit.repository.RecruitDao;

@Service
public class RecruitService {
	@Autowired
	RecruitDao recruitDao;
	
	
	public List<String> selectCompany(){
		
		return recruitDao.selectCompany();
	}
	
	
	
	//companyRecruit�Է�
	public void insertRecruitCompany(RecruitCompany recruitCompany){
		//RecruitCompanyCd�� ���ڿ� + �����ϴ¼��� ����� 
		recruitCompany.setRecruitCompanyCd("");
		
		recruitDao.insertRecruitCompany(recruitCompany);
	}
	
	//companyRecruitJob�Է�
	public void insertRecruitCompanyJob(RecruitCompanyJobVo recruitCompanyJobVo){
		recruitDao.insertRecruitJob(recruitCompanyJobVo);
	}
}
