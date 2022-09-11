package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Xml Import
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		//Get Bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getInforme());
		
		//Context Close
		contexto.close();
	}

}
