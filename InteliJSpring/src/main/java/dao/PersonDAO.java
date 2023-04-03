package dao;

import vo.PersonVO;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public List<PersonVO> selectList(){
        PersonVO p1 = new PersonVO("홍길동", "010-1111-1111", 30);
        PersonVO p2 = new PersonVO("이길동", "010-2222-2222", 34);
        PersonVO p3 = new PersonVO("삼길동", "010-3333-3333", 32);
        List<PersonVO> person_list = new ArrayList<>();

        person_list.add(p1);
        person_list.add(p2);
        person_list.add(p3);

        return person_list;
    } // end of selectList()


} // end of class
