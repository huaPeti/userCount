package com.example.count.com.example.count.contorller;

import com.example.count.com.example.count.dao.UserCount;
import com.example.count.com.example.count.service.UserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author chen1
 * @annotation:统计控制类
 * @create 2018-07-31 14:37
 **/
@Controller
@RequestMapping("/userCount")
public class UserCountContorller {

	@Autowired
	@Qualifier("userCountServiceImpl")
	private UserCountService userCountService;

	@RequestMapping("/toList")
	public String toList(Model model) {
		List<UserCount> userCounts = userCountService.findAll();
		model.addAttribute("userCounts", userCounts);
		return "/userCount/userCountList";
	}

	@RequestMapping("/save")
	@ResponseBody
	public String save(UserCount userCount) {
		String back = "false";
		boolean saveFlag = userCountService.save(userCount);
		if (saveFlag) {
			back = "success";
		}
		return back;
	}

}
