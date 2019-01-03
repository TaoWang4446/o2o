package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置:spring 与 Junit 整合,Junit启动时加载springioc容器. 
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)//告诉spring用这个类去跑程序
//告诉Junit spring配置文件的路径
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
	
}
