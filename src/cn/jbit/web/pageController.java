package cn.jbit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/*��ҳ��������ת��Ŀ����������ʵurl��ַ*/
@Controller
@RequestMapping("/page")
public class pageController {
	@RequestMapping("/{url}")
	public String toPage(@PathVariable String url) {
		return url;
	}

}
