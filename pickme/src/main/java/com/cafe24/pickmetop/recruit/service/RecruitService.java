package com.cafe24.pickmetop.recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;
import com.cafe24.pickmetop.recruit.repository.RecruitDao;

@Service
public class RecruitService {
	@Autowired
	RecruitDao recruitDao;
	public void insertRecruitCompany(RecruitCompany recruitCompany, RecruitCompanyJobVo recruitCompanyJobVo){
		recruitDao.insertRecruitCompany(recruitCompany,recruitCompanyJobVo);
	}
}
