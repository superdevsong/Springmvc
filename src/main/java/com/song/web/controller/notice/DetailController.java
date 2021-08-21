package com.song.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("fdfdfd");
		ModelAndView mv = new ModelAndView("notice.detail");//tiles 사용
		//		ModelAndView mv = new ModelAndView("notice/detail"); 이렇게 사용하면 일반적인 view resolver 사용 
		// 이젠 필요없는 내용 다음 commit때 없엘거임 
		
		return mv;
	}

}
