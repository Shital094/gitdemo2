package gitdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap=new AnnotationConfigApplicationContext(Appconfig.class);
	Student s=(Student) ap.getBean("s");
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	System.out.println(s.getMobno());
}
}
