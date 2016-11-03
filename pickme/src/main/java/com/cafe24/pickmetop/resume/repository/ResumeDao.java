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
	private final String NS = "com.cafe24.pickmetop.resume.repository.ResumeMapper";
	@Autowired
	@Resource(name="sqlSessionResume")
	private SqlSessionTemplate sqlSessionFactoryResume;
	
	//01_00 �̷¼��Է�
	public int insertResume(ResumeVo resume){
		return sqlSessionFactoryResume.insert(NS +".insertResume",resume);
	}
	//01_01 ���νŻ�
	public int insertResumePersonal(ResumePersonalVo personal){
		return sqlSessionFactoryResume.insert(NS + ".insertResumePersonal", personal);
	}
	//01_02 ����б�
	public int insertResumeHighschool(ResumeHighschoolVo highschool){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeHighschool", highschool);
	}
	//01_03 ���б� �����Է�
	public int insertResumeUniversity(ResumeUniversityVo university){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeUniversity", university);
	}
	//01_04 ���� �����Է�
	public int insertResumeFamily(ResumeFamilyVo family){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeFamily", family);
	}
	//01_05 ����
	public int insertResumeMilitaryservice(ResumeMilitaryserviceVo militaryService){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeMilitaryservice", militaryService);
	}
	//01_06 �ڰ��� �����Է�
	public int insertResumeCertificate(ResumeCertificateVo certificate){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeCertificate", certificate);
	}
	//01_07 ��»��� �����Է�
	public int insertResumeCareer(ResumeCareerVo career){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeCareer", career);
	}
	//01_08 ���� �����Է�
	public int insertResumeLanguage(ResumeLanguageVo language){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeLanguage", language);
	}
	//01_09 ������ �����Է�
	public int insertResumeAward(ResumeAwardVo award){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeAward", award);
	}
	//01_10 �����ܿ��� �����Է�
	public int insertResumeTraining(ResumeTrainingVo training){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeTraining", training);
	}
	//01_11 ���Ƹ� �����Է�
	public int insertResumeClub(ResumeClubVo club){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeClub", club);
	}
	//01_12 ��Ÿ �����Է�
	public int insertResumeEtc(ResumeEtcVo etc){
		return sqlSessionFactoryResume.insert(NS + ".insertResumeEtc", etc);
	}
	
	
	
	//02 �̷¼� ����Ʈ
	public List<ResumeVo> selectResumeList(){
		return sqlSessionFactoryResume.selectList(NS + ".selectResumeList");
	}
	//03 �̷¼� �󼼺���
	public ResumeVo selectResumeDetailByResumeCd(String resumeCd){
		return sqlSessionFactoryResume.selectOne(NS + ".selectResumeDetailByResumeCd", resumeCd);
	}
	
	//�̷¼� ����
	
	//�̷¼� ����
	
}
