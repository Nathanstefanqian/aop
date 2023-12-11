package dynamic.jdk;
import org.springframework.stereotype.Repository;
public class TestDaoImpl implements TestDao{

	@Override
	public void eatAppleRaw(){
		System.out.println("生吃苹果");
	}
	
	@Override
	public void eatAppleCooked(){
		System.out.println("熟吃苹果");
	}
}
