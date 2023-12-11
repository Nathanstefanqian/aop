package aspect;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.po.MyApple;

@Aspect
@Component
public class MyAspect {
    @Before("@annotation(aspect.MyCustomAnnotation)")
    public void beforeLogToTextFile( HttpServletRequest request) {
    	 try {
    		 	String aplace = request.getParameter("aplace");
    	     	String saweight = request.getParameter("aweight");
    	        String saprice = request.getParameter("aprice");
    	    	String aa=aplace+" ,"+saweight+" ,"+saprice;
    	   	 Files.write(Paths.get("${pageContext.request.contextPath }/output.txt"), aa.getBytes(), StandardOpenOption.CREATE);
    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }
    	
    }
   
}
