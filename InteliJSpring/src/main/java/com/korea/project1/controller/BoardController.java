package com.korea.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BoardServiceImpl;

import java.util.List;

@Controller
public class BoardController {
    private BoardServiceImpl boardService;

    public static final String BOARD_PATH = "/WEB-INF/views/board/";

    public BoardController(BoardServiceImpl boardService) {
        System.out.println("---컨트롤러의 생성자---");
        this.boardService = boardService;
    } // end of constructor

    @RequestMapping(value = {"/","list.do"})
    public String selectList(Model model){
        List<String> board_list = boardService.selectList();
        model.addAttribute("board_list", board_list);
        return BOARD_PATH + "board_list.jsp";
    } // end of selectList()

} // end of class
