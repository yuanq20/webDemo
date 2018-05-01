package aa.bb.cc.dao;

import aa.bb.cc.beans.Person;

import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {

    public List<Person> findAll() {
        Person p1 = new Person("zhangsan", 23);
        Person p2 = new Person("lisi", 25);
        Person p3 = new Person("wangwu", 24);

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }
}
