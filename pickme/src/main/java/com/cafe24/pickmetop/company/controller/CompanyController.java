package com.cafe24.pickmetop.company.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.company.service.CompanyService;

@Controller
public class CompanyController {
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	CompanyService companyService;

	@RequestMapping(value = "/companyInfo", method = RequestMethod.GET)
	public String companyMain(Locale locale, Model model) {
		return "/companyinfo/companymain";
	}
	
	@RequestMapping(value = "/review/companyReviewInsertForm", method = RequestMethod.GET)
	public String companyReviewInsertForm(Model model) {
		model.addAttribute("companyInfoList", companyService.getCompanyInfoList());
		model.addAttribute("jobTopIndexList", companyService.getJobTopIndexList());
		return "/companyinfo/review/companyReviewInsert";
	}
}
