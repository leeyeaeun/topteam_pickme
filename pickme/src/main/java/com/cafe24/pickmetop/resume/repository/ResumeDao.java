package com.cafe24.pickmetop.resume.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeUniversityVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;

@Repository
public class ResumeDao {
	private final String NS = "com.cafe24.pickmetop.resume.repository.ResumeMapper";
	@Autowired
	@Resource(name="sqlSessionResume")
	private SqlSessionTemplate sqlSessionFactoryResume;
	
	//00 �̷¼��Է�
	public int insertResume(ResumeVo resumeVo){
		return sqlSessionFactoryResume.insert(NS +".insertResume",resumeVo);
	}
	//01 ���νŻ�
	public int insertResumePersonal(ResumePersonalVo personal){
		return sqlSessionFactoryResume.insert(NS + ".insertResumePersonal", personal);
	}
	//02 ����б�
	public int insertResumeHighschool(ResumeHighschoolVo highschool){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeHighschool", highschool);
	}
	//03 ���б�
	public int insertResumeUniversity(ResumeUniversityVo university){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeUniversity", university);
	}
	//04 ����
	public int insertResumeFamily(ResumeFamilyVo family){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeFamily", family);
	}
	//05 ����
	public int insertResumeMilitaryservice(ResumeMilitaryserviceVo militaryService){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeMilitaryservice", militaryService);
	}
	
	
	
	
	
	
	
	
	
	//�̷¼� ����Ʈ
	
	//�̷¼� ����
	
	//�̷¼� ����
	
}
