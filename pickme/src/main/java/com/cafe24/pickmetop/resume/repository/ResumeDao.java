package com.cafe24.pickmetop.resume.repository;


import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumeLanguageVo;
import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeClubVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainingVo;
import com.cafe24.pickmetop.resume.model.ResumeUniversityVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;

@Repository
public class ResumeDao {
	private final String nameSpace = "com.cafe24.pickmetop.resume.repository.ResumeMapper";
	@Autowired
	@Resource(name="sqlSessionResume")
	private SqlSessionTemplate sqlSessionFactoryResume;
	
	//01_00 이력서입력
	public int insertResume(ResumeVo resume){
		return sqlSessionFactoryResume.insert(nameSpace +".insertResume",resume);
	}
	//01_01 개인신상
	public int insertResumePersonal(ResumePersonalVo personal){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumePersonal", personal);
	}
	//01_02 고등학교
	public int insertResumeHighschool(ResumeHighschoolVo highschool){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeHighschool", highschool);
	}
	//01_03 대학교 다중입력
	public int insertResumeUniversity(ResumeUniversityVo university){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeUniversity", university);
	}
	//01_04 가족 다중입력
	public int insertResumeFamily(ResumeFamilyVo family){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeFamily", family);
	}
	//01_05 병역
	public int insertResumeMilitaryservice(ResumeMilitaryserviceVo militaryService){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeMilitaryservice", militaryService);
	}
	//01_06 자격증 다중입력
	public int insertResumeCertificate(ResumeCertificateVo certificate){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeCertificate", certificate);
	}
	//01_07 경력사항 다중입력
	public int insertResumeCareer(ResumeCareerVo career){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeCareer", career);
	}
	//01_08 어학 다중입력
	public int insertResumeLanguage(ResumeLanguageVo language){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeLanguage", language);
	}
	//01_09 수상경력 다중입력
	public int insertResumeAward(ResumeAwardVo award){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeAward", award);
	}
	//01_10 국내외연수 다중입력
	public int insertResumeTraining(ResumeTrainingVo training){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeTraining", training);
	}
	//01_11 동아리 다중입력
	public int insertResumeClub(ResumeClubVo club){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeClub", club);
	}
	//01_12 기타 다중입력
	public int insertResumeEtc(ResumeEtcVo etc){
		return sqlSessionFactoryResume.insert(nameSpace + ".insertResumeEtc", etc);
	}
	
	
	
	//02 이력서 리스트
	public List<ResumeVo> selectResumeList(){
		return sqlSessionFactoryResume.selectList(nameSpace + ".selectResumeList");
	}
	//03 이력서 상세보기
	public ResumeVo selectResumeDetailByResumeCd(String resumeCd){
		return sqlSessionFactoryResume.selectOne(nameSpace + ".selectResumeDetailByResumeCd", resumeCd);
	}
	
	//이력서 수정
	
	//이력서 삭제
	
}
