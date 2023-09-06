package com.elec5619.BestCarePet;

import com.elec5619.BestCarePet.mapper.UserMapper;
import com.elec5619.BestCarePet.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTableTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        //selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
//        userMapper.selectList(null).forEach(System.out::println);
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
