package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("@annotation(aspect.MyCustomAnnotation)")
    public void buyApple() {
        System.out.println("买苹果");
    }

    @Before("@annotation(aspect.MyCustomAnnotation)")
    public void cleanApple() {
        System.out.println("清洗苹果");
    }
}
