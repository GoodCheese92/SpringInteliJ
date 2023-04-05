package com.korea.visit;

import dao.VisitDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import util.MyCommon;
import vo.VisitVO;

import java.util.List;

@Controller
public class VisitController {
   // SqlSession sqlSession;
//    VisitDAO visit_dao = new VisitDAO(sqlSession);
    VisitDAO visit_dao;
    public void setVisit_dao(VisitDAO visit_dao) {
        this.visit_dao = visit_dao;
        System.out.println("visit_dao 생성자");
    } // end of setter

    @RequestMapping(value = {"/", "visit_list.do"})
    public String selectList(Model model){
        List<VisitVO> visit_list = visit_dao.selectList();
        model.addAttribute("visit_list", visit_list);

        return MyCommon.Visit.VIEW_PATH + "visit_list.jsp";
    } // end of selectList()
} // end of class
