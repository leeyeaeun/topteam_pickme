package com.cafe24.pickmetop.recruit.controller;

import java.util.List;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


import com.cafe24.pickmetop.recruit.model.RecruitCompany;
import com.cafe24.pickmetop.recruit.model.RecruitCompanyJobVo;
import com.cafe24.pickmetop.recruit.service.RecruitService;

@Controller
public class RecruitController {
	final static Logger logger = LoggerFactory.getLogger(RecruitController.class);
	@Autowired
	@Resource
	RecruitService recruitService;
	final String imgDir = "D:\\LeeYeaEun\\imgs";
	
	
	/* ä�� ����*/
	/* ä�� ����Ʈ */
	
	/* ä�� �Է� ó�� */
	@RequestMapping(value = "/recruitInsert", method = RequestMethod.POST)
	public String recruitInsert(RecruitCompany recruitCompany, RecruitCompanyJobVo recruitCompanyJobVo) {
		
		logger.info("recruitCompany : {}",recruitCompany.toString());
		logger.info("recruitCompanyJobVo : {}",recruitCompanyJobVo.toString());
		recruitService.insertRecruitCompany( recruitCompany);
		recruitService.insertRecruitCompanyJob(recruitCompanyJobVo);
		
		return "index";
	}
	
	/* ä�� �Է� ȭ�� */
	@RequestMapping(value = "/recruit", method = RequestMethod.GET)
	public String recruitInsert(Model model) {
		List<String> companyList = recruitService.selectCompany();
		logger.info("companyList : {}",companyList);
		model.addAttribute("companyList", companyList);
		return "/recruit/company/companyRecruitInsert";
	}
}
