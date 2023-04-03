package vo;

public class PersonVO {
    public PersonVO(String name, String tel, int age) {
        System.out.println("----PersonVO 생성자 실행 됨----");
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    private String name, tel;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // System.out.println("이름 생성 됨" + name);
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

} // end of class
