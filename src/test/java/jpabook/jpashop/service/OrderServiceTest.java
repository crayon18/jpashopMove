package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class OrderServiceTest {

    @Test
    public void 상품주문() throws Exception{
        Member member = new Member();
        Item item  = new Book();
    }

    @Test
    public void 주문취소() throws Exception{

    }

    @Test
    public void 상품주문_재고수량초과() throws Exception{

    }
}