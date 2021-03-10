package com.hmt.graduate.paper.service.patients;

import com.hmt.graduate.paper.pojo.MmseQuestions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

//@SpringbootTest
@MybatisTest    //缓存mybatsitest注解
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)    //这个是启用自己配置的数据元，不加则采用虚拟数据源
@Rollback(false)    //这个是默认是回滚，不会commit入数据库，改成false 则commit
public class MmseQuestionServiceImplTest {

    @Autowired
    private MmseQuestionServiceImpl mmseService;

    @Test
    public void selectByExample() {
        MmseQuestions mmse = new MmseQuestions();
        mmse.setQuestionId(1);
        List<MmseQuestions> mmseList = mmseService.selectByExample(mmse);
        System.out.println(mmseList);
    }
}