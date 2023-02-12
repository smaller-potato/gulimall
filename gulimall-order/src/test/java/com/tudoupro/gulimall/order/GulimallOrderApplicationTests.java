package com.tudoupro.gulimall.order;

import com.tudoupro.gulimall.order.entity.OrderEntity;
import com.tudoupro.gulimall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillContent("123");
        orderService.save(orderEntity);
        System.out.println("保存成功");
    }

}
