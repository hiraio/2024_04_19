package com.mokcoding.ex01.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mokcoding.ex01.domain.InfoVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/example3")
@Log4j

public class ExampleController3 {
	
	// info.jsp 페이지 호출
	@GetMapping("/info")
	public void infoGET(Model model) { // Model 객체 사용
		// Model : Map 형식으로 데이터 전송하는 객체
		log.info("infoGET()");
		// vo 객체 생성 및 데이터 설정
		InfoVO vo = new InfoVO();
		vo.setName("목진혁");
		vo.setEmail("jhmocu@gmail.com");
		vo.setBirthDate(new Date());
		
		// 서버에서 client로 정보를 보낼 때는 Attribute !
		model.addAttribute("vo", vo); // model에 name="vo", object = vo 전송
	} // end infoGET()
	
	   // page3.jsp 페이지 호출 및 데이터 전송
	   @GetMapping("/page3")
	   public void page3(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		   // @ModelAttribute() : request parameter 전달받은
		   // 데이터를 Model에 담아서 View 전달해주는 역할
	         log.info("page3()");
	   } // end page3()
	   
	   // result.jsp 페이지 호출
	   @GetMapping("/result")
	   public void result() {
		   log.info("result()");
	   }
	   
	   // result() 메서드로 이동(redirect)
	   @GetMapping("/redirect")
		   public String redirect(RedirectAttributes reAttr) {
		   // RedirectAttributes : 일회성 데이터 전달 객체. attribute 방식
		   
		   log.info("redirect()");
		   reAttr.addFlashAttribute("result", "success");
		   
		   return "redirect:/example3/result";
	   }
	

}
