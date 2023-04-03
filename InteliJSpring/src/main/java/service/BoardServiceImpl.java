package service;

import dao.BoardDAOImpl;

import java.util.List;

public class BoardServiceImpl implements BoardService{

    BoardDAOImpl dao;

    public BoardServiceImpl(BoardDAOImpl dao) {
        this.dao = dao;
    } // end of constructor

    @Override
    public List<String> selectList() {
        return dao.selectList();
    } // end of selectList()

} // end of class
