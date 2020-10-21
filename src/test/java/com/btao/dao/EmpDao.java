package com.btao.dao;

import com.btao.Day63SpringbootDemoApplication;
import com.btao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by S_TU on 2019/12/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Day63SpringbootDemoApplication.class)
public class EmpDao {
    @Resource
    private IEmpDao iEmpDao;

    @Test
    public void testGetAll() {
        List<Emp> list = iEmpDao.findAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void testfindById() {
        Optional<Emp> byId = iEmpDao.findById(1);
        if (byId.isPresent()) {
            Emp emp = byId.get();
            System.out.println(emp);
        }
    }

    @Test
    public void testsave() {
        Emp emp = new Emp();
        emp.setEname("lisi");
        emp.setEpass("123");
        emp.setSalary(3000);
        emp.setAddr("xian");
        iEmpDao.save(emp);
    }

    @Test
    public void testsaveAndFlush() {
        Emp emp = new Emp();
        emp.setEid(5);
        emp.setEname("lisi");
        emp.setEpass("222");
        emp.setSalary(5000);
        emp.setAddr("beijin");
        iEmpDao.saveAndFlush(emp);
    }

    @Test
    public void testdeleteById(){
        iEmpDao.deleteById(5);
    }
    @Test
    public void textdeleteAll(){
        iEmpDao.deleteAll();
    }
}
