package cn.jbit.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;

import cn.jbit.pojo.Student;
import cn.jbit.service.StudentService;
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping("/index")
	public String select(Model model,@RequestParam(value="currPage",defaultValue="1")int currPage,@RequestParam(value="pageSize",defaultValue="5")int pageSize) {
		int count = service.selectCount();
		int totalPage = count%pageSize==0?count/pageSize:count/pageSize+1;
		List<Student> list = service.select(currPage, pageSize);
		model.addAttribute("msg",JSON.toJSON(list));
		model.addAttribute("currPage",currPage);
		model.addAttribute("pageSize",pageSize);
		model.addAttribute("totalPage",totalPage);
		return "index";
	}
	
	@RequestMapping("/delete")
	public String delete(int sno){
		System.out.println(sno);
		service.deleteBySno(sno);
		return "index";
	}
	
	@RequestMapping("/regist")
	public String regist( @Valid Student stu,Model model ) {
		service.regist(stu);
		return "index";
	}
	
	
}
