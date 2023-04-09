package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.VisitVO;

import java.util.List;

@Repository
public class VisitDAO {
    SqlSessionTemplate sqlSession;

    @Autowired
    public VisitDAO(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
        System.out.println("sqlSession 생성자 : " + sqlSession);
    } // end of constructor

    public List<VisitVO> selectList() {
        List<VisitVO> list = sqlSession.selectList("VisitMapper.visit_list2");
        return list;
    } // end of selectList()

} // end of class
