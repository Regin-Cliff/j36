package cn.jbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.jbit.dao.StudentMapper;
import cn.jbit.pojo.Student;
import cn.jbit.pojo.StudentExample;
import cn.jbit.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper dao;

	@Override
	public int insert(Student stu) {
		return dao.insert(stu);
	}

	@Override
	public List<Student> select(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		StudentExample example = new StudentExample();
		return dao.selectByExample(example);
	}

	@Override
	public int selectCount() {
		return dao.selectCount();
	}

	@Override
	public int deleteBySno(int sno) {
		return dao.deleteByPrimaryKey(sno);
	}

	@Override
	public int regist(Student stu) {
		return dao.insert(stu);
	}
	
	
}
