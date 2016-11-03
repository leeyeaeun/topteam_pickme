package com.cafe24.pickmetop.recruit.controller;

import java.util.List;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.recruit.model.Recruit;
import com.cafe24.pickmetop.recruit.service.RecruitService;
import com.cafe24.pickmetop.recruit.service.Commons;

@Controller
public class RecruitController {
	final static Logger logger = LoggerFactory.getLogger(RecruitController.class);
	@Autowired
	@Resource
	RecruitService recruitService;	
	@Autowired
	Commons commons;
	
	/* ä�� ����*/
	/* ä�� ����Ʈ */
	
	/* ä�� �Է� ó�� */
	@RequestMapping(value = "/recruitInsert", method = RequestMethod.POST)
	public String recruitInsert(Recruit recruit,HttpSession session,Model model) {
		//���� Ÿ�� �˻� �޼��� 
		boolean result =commons.checkFileType(recruit);
		//���� Ÿ���� �̹����ϰ�� 
		if(result){
			//��������� ����ڵ带 �˻��Ѵ�
			String companyCd = recruitService.getCompanyCd(recruit.getCompanyName());
			recruit.setCompanyCd(companyCd);
			if(companyCd==null){
				logger.info("�ش����� ������ �� �����ֱ�/ ����� : {}",recruit.getCompanyName());
			}else{
				recruitService.insertRecruitCompany(recruit,session);
				recruitService.insertRecruitCompanyJob(recruit);	
			}
			return "index";
		//����Ÿ���� �̹����� �ƴҰ��
		}else{
			model.addAttribute("errorMsg","������Ÿ�� ����ġ");
			return "/recruit/company/companyRecruitInsert";
		}
		
	}
	
	/* ä�� �Է� ȭ�� */
	@RequestMapping(value = "/recruit", method = RequestMethod.GET)
	public String recruitInsert(Model model,HttpSession session) {
		//��ü ���� ��з�
		model.addAttribute("jobTopIndex", recruitService.getJobTopIndexCd());
		
		//db���� ������ ��ü �����ߺз� �ڵ�� ��������Ʈ�� �𵨿� ��´�
		model.addAttribute("jobIndex",recruitService.getJobMidIndexCd());
		logger.info("recruitService.getJobMidIndexCd() : {}",recruitService.getJobMidIndexCd());
		
		//db���� ������ ��ü �������Ʈ�� �𵨿� ��´�
		List<String> companyList = recruitService.selectCompany();
		logger.info("companyList : {}",companyList);
		model.addAttribute("companyList", companyList);
		
		//test������ ���ǿ� ���̵� �Է�
		session.setAttribute("id", "id001");
		return "/recruit/company/companyRecruitInsert";
	}
}
