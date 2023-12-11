package aspect;
/**
 * 切面类，可以定义多个通知，即增强处理的方法
 */
public class MyAspect {
	public void buyApple() {
		System.out.println("买苹果");
	}
	public void cleanApple() {
		System.out.println("清洗苹果");
	}
}
