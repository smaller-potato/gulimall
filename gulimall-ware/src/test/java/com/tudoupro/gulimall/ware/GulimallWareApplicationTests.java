package com.tudoupro.gulimall.ware;


import com.tudoupro.gulimall.ware.entity.PurchaseEntity;
import com.tudoupro.gulimall.ware.service.PurchaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallWareApplicationTests {

    @Autowired
    PurchaseService purchaseService;

    @Test
    public void contextLoads() {
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setAmount(new BigDecimal("123"));
        purchaseService.save(purchaseEntity);
        System.out.println("保存成功");
    }

}
