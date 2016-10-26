package com.cafe24.pickmetop.resume.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeEducationVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeLangaugeVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainningVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;

@Repository
public class ResumeDao {
	private final String NS = "com.cafe24.pickmetop.resume.repository.ResumeMapper";
	@Autowired
	@Resource(name="sqlSessionResume")
	private SqlSessionTemplate sqlSessionFactoryResume;
	public int insertResume(ResumeVo resume, ResumeAwardVo award, ResumeCareerVo career, ResumeCertificateVo certif, 
			ResumeEducationVo edu, ResumeEtcVo etc, ResumeFamilyVo family, ResumeLangaugeVo language, ResumeMilitaryserviceVo military,
			ResumePersonalVo personal, ResumeTrainningVo trainning){
		return sqlSessionFactoryResume.insert(NS+".insertResume", resume);
	}
}
