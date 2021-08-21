package com.song.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.song.web.entity.Notice;
import com.song.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
	@RequestMapping("list")
	public String list() throws ClassNotFoundException, SQLException {
		List<Notice> list = noticeService.getList(1, "TITLE", "");

		return "notice.list";
	}
}
