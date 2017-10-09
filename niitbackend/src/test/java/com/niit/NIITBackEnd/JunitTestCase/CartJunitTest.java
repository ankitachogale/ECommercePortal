package com.niit.NIITBackEnd.JunitTestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.NIITBackEnd.Dao.CartDao;
import com.niit.NIITBackEnd.model.Cart;

public class CartJunitTest {
private static AnnotationConfigApplicationContext context;
private static CartDao cartdao;
private Cart cart;
@BeforeClass
public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("niitbackend");
	context.refresh();
	cartdao=(CartDao)context.getBean("cartdao");
}
@Test
public void addCartTest()
{
	Cart cart=new Cart();
	cart.setOrderid(10001);
	cart.setPid(101);
	cart.setQuantity(2);
	cart.setPrice(500000);
	cart.setStatus("NP");
	cart.setUsername("ankita");
	assertTrue("Problem in Adding CartItem",cartdao.addCart(cart));
}

}
