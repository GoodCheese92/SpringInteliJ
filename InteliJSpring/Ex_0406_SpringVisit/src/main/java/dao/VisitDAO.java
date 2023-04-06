package dao;

import org.apache.ibatis.session.SqlSession;
import vo.VisitVO;

import java.util.List;

public class VisitDAO {
    SqlSession sqlSession;

    public VisitDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    } // end of constructor

    public List<VisitVO> selectList(){
        List<VisitVO> list = sqlSession.selectList("v.visit_list");
        return list;
    } // end of selectList()

} // end of class
