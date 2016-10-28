package com.cafe24.pickmetop.company.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.admin.model.JobTopIndexVo;
import com.cafe24.pickmetop.company.model.CompanyInfoVo;
import com.cafe24.pickmetop.company.model.CompanyReviewVo;
import com.cafe24.pickmetop.company.repository.CompanyDao;

@Service
public class CompanyService {
	private static final Logger logger = LoggerFactory.getLogger(CompanyService.class);
	
	@Autowired
	CompanyDao companyDao;
	
	//기업리뷰등록(사용자) 메서드
	public int addCompanyReview(CompanyReviewVo companyReviewVo, String companyName){
		logger.info("CompanyService -> companyName {}", companyName);
		logger.info("CompanyService -> companyCd {}", companyDao.selectCompanyInfoByCompanyCd(companyName));
		companyReviewVo.setCompanyCd(companyDao.selectCompanyInfoByCompanyCd(companyName));
		companyReviewVo.setLoginId("kji212@naver.com");
		/*SimpleDateFormat setToday;
		setToday = new SimpleDateFormat("yyyy-mm-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);
		String today = setToday.format(calendar.getTime());
		companyReviewVo.setReviewRegDate(today);
		companyReviewVo.setReviewModiDate(today);
		logger.info("CompanyService -> today {}",today);*/
		logger.info("CompanyService -> companyCd2 {}", companyReviewVo.getCompanyCd());
		return companyDao.insertCompanyReview(companyReviewVo);
	}
	
	//기업정보 리스트목록 메서드
	public List<CompanyInfoVo> getCompanyInfoList(){
		return companyDao.selectCompanyInfoAllList();
	}
	
	//직무중분류 리스트 목록 메서드
	public List<JobTopIndexVo> getJobTopIndexList(){
		return companyDao.selectJobTopIndexAllList();
	}
	
}
