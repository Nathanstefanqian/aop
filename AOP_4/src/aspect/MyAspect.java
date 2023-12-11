package aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 切面类，在此类中编写各种类型通知
 */
@Aspect//对应<aop:aspect ref="myAspect">
@Component//对应<bean id="myAspect" class="aspectj.xml.MyAspect"/>
public class MyAspect {
	/**
	 * 定义切入点
	 */
	@Pointcut("execution(* dynamic.jdk.*.*(..))")
	private void myPointCut() {
		//对应<aop:pointcut expression="execution(* dynamic.jdk.*.*(..))" id="myPointCut"/>
	}
	/**
	 * 前置通知，使用Joinpoint接口作为参数获得目标对象信息
	 */
	@Before("myPointCut()")//对应<aop:before method="before" pointcut-ref="myPointCut"/>
	public void buyApple() {
		System.out.println("买苹果");
	} 
	@Before("myPointCut()")
	public void cleanApple() {
		System.out.println("清洗苹果");
	}
}
