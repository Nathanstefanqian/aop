package dynamic.jdk;
import org.springframework.stereotype.Repository;

import aspect.MyCustomAnnotation;
@Repository("testDao")
public class TestDaoImpl implements TestDao{

	@Override
	 @MyCustomAnnotation
	public void eatAppleRaw(){
		System.out.println("生吃苹果");
	}
	
	@Override
	 @MyCustomAnnotation
	public void eatAppleCooked(){
		System.out.println("熟吃苹果");
	}
}
