package aa.bb.cc.service;

import aa.bb.cc.beans.Person;
import aa.bb.cc.dao.Dao;
import aa.bb.cc.dao.DaoImpl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 服务类
 *
 * @author qinyuan
 * @since 2018/5/1 0001 15:15
 */
public class MyService {
    private Dao dao = new DaoImpl();

    /**
     *
     * @return
     */
    public List<Person> getAllPersons(){
        return dao.findAll();
    }


    //------------------------------------------------------------------
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        MyService myService = new MyService();
        List<Person> allPersons = myService.getAllPersons();
        Iterator<Person> iterator = allPersons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName() + "---" + person.getAge());
        }

        Set<String> set = new HashSet<String>();
        set.add("aa");

        Collections.sort(allPersons);
    }
}
