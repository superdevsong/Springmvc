package com.song.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.song.web.entity.Notice;
import com.song.web.service.NoticeService;
import com.song.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller {
	
	private NoticeService noticeService;
	// 이젠 필요없는 내용 다음 commit때 없엘거임 

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("fdfdfd");
		ModelAndView mv = new ModelAndView("notice.list");// 아래처럼 사용해도
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list",list);
		return mv;
	}
	@Autowired//자동으로 xml내용에서 알아서 조건에 맞는 내용 찾아서 di 적
	public void setNoticeService(JDBCNoticeService noticeService) {
		this.noticeService = noticeService;
	}

}
