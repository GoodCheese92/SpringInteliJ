package com.korea.project1.controller;

import dao.PersonDAO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.PersonVO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PersonController {

    public static final String PERSON_PATH = "/WEB-INF/views/person/";
    PersonDAO personDAO;

    public PersonController(PersonDAO personDAO) {
        System.out.println("PersonController 생성자");
        this.personDAO = personDAO;
    } // end of constructor

    @RequestMapping(value = {"/","/list.do"})
    public String selectList(Model model, HttpServletRequest request){
        String ip = request.getRemoteAddr();
        List<PersonVO> person_list = personDAO.selectList();

        model.addAttribute("ip", ip);
        model.addAttribute("person_list", person_list);

        return PERSON_PATH + "person_list.jsp";
    } // end of selectList()
} // end of class
