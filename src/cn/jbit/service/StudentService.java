package cn.jbit.service;

import java.util.List;

import cn.jbit.pojo.Student;

public interface StudentService {
	int insert(Student stu);
	
	List<Student> select(int pageNum,int pageSize);
	
	int selectCount();
	
	int deleteBySno(int sno);
	
	int regist(Student stu);
}
