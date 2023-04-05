package dao;

import org.apache.ibatis.session.SqlSession;
import vo.VisitVO;

import java.util.List;

public class VisitDAO {
    SqlSession sqlSession;

    public VisitDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        System.out.println("dao 생성자");
    } // end of constructor

    public List<VisitVO> selectList(){
        List<VisitVO> visit_list = sqlSession.selectList("v.visit_list");
        return visit_list;
    } // end of class
} // end of class
