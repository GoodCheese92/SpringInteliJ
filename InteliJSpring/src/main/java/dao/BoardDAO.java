package dao;

import java.util.List;

public interface BoardDAO {
    public List<String> selectList();
    public int insert(Object ob);
    public int update(Object ob);
    public int delete(int idx);

} // end of interface
