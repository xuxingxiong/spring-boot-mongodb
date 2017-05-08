package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.User;
import com.example.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMongodbodbApplicationTests {
	@Autowired
	private UserService userService;

	@Before
	public void setUp() {
		userService.deleteAll();
	}

	@Test
	public void test() throws Exception {
		// 创建三个User，并验证User总数
		userService.save(new User(1L, "didi", 30));
		userService.save(new User(2L, "mama", 40));
		userService.save(new User(3L, "kaka", 50));
		Assert.assertEquals(3, userService.findAll().size());
		// 删除一个User，再验证User总数
		User u = userService.findOne(1L);
		userService.delete(u);
		Assert.assertEquals(2, userService.findAll().size());
		// 删除一个User，再验证User总数
		u = userService.findByUsername("mama");
		userService.delete(u);
		Assert.assertEquals(1, userService.findAll().size());
	}
}
