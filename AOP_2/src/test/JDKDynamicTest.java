package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;
import service.JDKDynamicProxy;

public class JDKDynamicTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建代理对象
		JDKDynamicProxy jdkProxy = (JDKDynamicProxy)appCon.getBean("JDKDynamicProxy");
		//创建目标对象
		TestDao testDao = (TestDao)appCon.getBean("testDao");
		//从代理对象中获取增强后的目标对象，该对象是一个被代理的对象，它会进入代理的逻辑方法invoke里
		TestDao testDaoAdvice = (TestDao)jdkProxy.createProxy(testDao);
		//执行方法
		testDaoAdvice.eatAppleRaw();
		System. out. println("===========================" );
		testDaoAdvice.eatAppleCooked();

	}
}
