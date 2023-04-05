package dao;

import org.apache.ibatis.session.SqlSession;
import vo.VisitVO;

import java.util.List;

public class VisitDAO {
    SqlSession sqlSession;

    public VisitDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    } // end of class

    public List<VisitVO> selectList(){
        List<VisitVO> visit_list = sqlSession.selectList("v.visit_list");
        return visit_list;
    } // end of class
} // end of class
