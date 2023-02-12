package com.tudoupro.gulimall.member;

import com.tudoupro.gulimall.member.entity.MemberEntity;
import com.tudoupro.gulimall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setCity("小土豆");
        memberService.save(memberEntity);
        System.out.println("保存成功");
    }

}
