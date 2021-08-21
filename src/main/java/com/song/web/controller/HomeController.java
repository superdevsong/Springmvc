package com.song.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	//index로 요청왔을때 매핑 이렇게해도 xml에 작성한내용과 효과가같음 그래서 같은부분 주석처리했고 담에는 정리를 위해삭제할거
	@RequestMapping("/index")
	public String aaaa() {
		return "root.index";
		
	}
	//예시로 만든것 근데 이렇게해도 매핑한다고 하긴하는데 파일이없어서 오류
	@RequestMapping("/help")
	public String bbbb() {
		return "root.help";
		
	}

//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("fdfdfd");
//		ModelAndView mv = new ModelAndView("root.index");//아래처럼 사용해도
//		mv.addObject("data","Hello Spring MVC");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
//	원래는 이렇게 작성해야된다. 정해진 규격이 있고 그걸 수행하여야한다 하지만 위와같이 어노테이션을 쓰면 좀더 형식에서 자유로워지고 간단해진다.
	// 즉 원래처럼 구현한 인터페이스를 상속할 필요가없다는뜻이다.
	
}
