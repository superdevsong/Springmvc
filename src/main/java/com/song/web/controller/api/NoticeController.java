package com.song.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.web.entity.Notice;
import com.song.web.service.NoticeService;

@RestController("apiNoticeController")// 평소에 컨트롤러와 좀 다르다 이건 jsp 와같은 문서가아닌 문자열과 같은 데이터를 보낼때 쓰는것 
@RequestMapping("/api/notice/")//이렇게 하면 기본적으로 /api/notice에 매핑되고 아래와같이 list를 씀으로써 다음과같이 /api/notice/list 추가적인 매핑을 갖음 
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		List<Notice> list = noticeService.getList(1, "title", "");		
		return list;
	}
}
