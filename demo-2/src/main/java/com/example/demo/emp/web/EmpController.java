package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	
	@Autowired EmpMapper dao;
	
	@RequestMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("empList", dao.findAll());
		return "emp/empList";
	}
	
	@RequestMapping("/updEmp1")
	@ResponseBody
	public EmpVO updEmp1(EmpVO vo) {
		return vo;
	}
	
	@RequestMapping("/updEmp2/{id}/{fname}")
	@ResponseBody
	// @PathVariable : 보일러 플레이트(반복적으로 비슷한 형태를 띄는 코드)가 하는 역할을 스프링이 알아서 하게끔 하는것
	public String updEmp2(@PathVariable int id, @PathVariable String fname) {
		return fname;
	}
}
