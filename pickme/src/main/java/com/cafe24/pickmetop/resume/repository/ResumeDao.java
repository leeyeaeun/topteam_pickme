package com.cafe24.pickmetop.resume.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeLanguageVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainingVo;
import com.cafe24.pickmetop.resume.model.ResumeUniversityVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;

@Repository
public class ResumeDao {
	private final String NS = "com.cafe24.pickmetop.resume.repository.ResumeMapper";
	@Autowired
	@Resource(name="sqlSessionResume")
	private SqlSessionTemplate sqlSessionFactoryResume;
	
	//이력서 저장
	public int insertResume(ResumeAwardVo award, ResumeCareerVo career, ResumeCertificateVo certificate, ResumeEtcVo etc, ResumeFamilyVo family, 
			ResumeHighschoolVo highshool, ResumeMilitaryserviceVo militaryservice, ResumeLanguageVo language, ResumePersonalVo personal, ResumeTrainingVo training,
			ResumeUniversityVo university, ResumeVo resume){
		return sqlSessionFactoryResume.insert(NS+".insertResume", resume);
	}
	
	//이력서 리스트
	
	//이력서 수정
	
	//이력서 삭제
	
}
