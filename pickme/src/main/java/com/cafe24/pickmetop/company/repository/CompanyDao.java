package com.cafe24.pickmetop.company.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.admin.model.JobTopIndexVo;
import com.cafe24.pickmetop.company.model.*;

@Repository
public class CompanyDao {
	final String NS = "com.cafe24.pickmetop.company.repository.CompanyMapper";
	@Autowired
	@Resource(name = "sqlSessionCompany")
	private SqlSessionTemplate sqlSessionFactoryCompany;
	
	//기업리뷰등록(사용자) 메서드
	public int insertCompanyReview(CompanyReviewVo companyReviewVo){
		return sqlSessionFactoryCompany.insert(NS + ".insertCompanyReview", companyReviewVo);
	}
	//기업코드검색
	public String selectCompanyInfoByCompanyCd(String companyName){
		return sqlSessionFactoryCompany.selectOne(NS + ".selectCompanyInfoByCompanyCd", companyName);
	}
	
	//기업정보 테이블에서 기업이름 리스트 전체
	public List<CompanyInfoVo> selectCompanyInfoAllList(){
		return sqlSessionFactoryCompany.selectList(NS + ".selectCompanyInfoAllList");
	}
	//직무중분류 테이블에서 리스트 전체
	public List<JobTopIndexVo> selectJobTopIndexAllList(){
		return sqlSessionFactoryCompany.selectList(NS + ".selectJobTopIndexAllList");
	}
	//기업리뷰목록(비승인)
	public List<CompanyReviewVo> selectCompanyListByReviewAllow(){
		return sqlSessionFactoryCompany.selectList(NS + ".selectCompanyListByReviewAllow");
	}
	//기업리뷰상세보기
	public CompanyReviewVo selectCompanyListByReviewCd(int companyReviewCd){
		return sqlSessionFactoryCompany.selectOne(NS + ".selectCompanyListByReviewCd", companyReviewCd);
	}
}
