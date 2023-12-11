package aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
/**
 * 切面类，在此类中编写各种类型通知
 */
public class MyAspect {
	public void buyApple() {
		System.out.println("买苹果");
	}
	public void cleanApple() {
		System.out.println("清洗苹果");
	}
	
}
