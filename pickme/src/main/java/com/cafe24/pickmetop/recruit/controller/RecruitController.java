package com.cafe24.pickmetop.recruit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;
import com.cafe24.pickmetop.recruit.service.RecruitService;

@Controller
public class RecruitController {
	final static Logger logger = LoggerFactory.getLogger(RecruitController.class);
	@Autowired
	RecruitService recruitService;
	
	
	/* 채용 삭제*/
	/* 채용 리스트 */
	
	
	
	/* 채용 입력 처리 */
	@RequestMapping(value = "/recruitInsert", method = RequestMethod.POST)
	public String recruitInsert(RecruitCompany recruitCompany, RecruitCompanyJobVo recruitCompanyJobVo) {
		logger.info("recruitCompany : {}",recruitCompany.toString());
		logger.info("recruitCompanyJobVo : {}",recruitCompanyJobVo.toString());
		recruitService.insertRecruitCompany( recruitCompany, recruitCompanyJobVo);
		return "/index";
	}
	
	/* 채용 입력 화면 */
	@RequestMapping(value = "/recruit", method = RequestMethod.GET)
	public String recruitInsert() {
		return "/recruit/company/companyRecruitInsert";
	}
}
