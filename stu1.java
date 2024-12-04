package chip22.batch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		 ApplicationContext con1=new AnnotationConfigApplicationContext(annotation.class);
	       question3 q=con1.getBean(question3.class);
		 question1 p=con.getBean(question1.class);
		 question2 m=con.getBean(question2.class);
		 System.out.println(p);
		 System.out.println(m);
		 System.out.println(q);
	}

}
