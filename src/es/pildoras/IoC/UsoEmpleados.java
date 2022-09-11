package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Creacion de Objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los Objetos Creados
		System.out.print(Empleado1.getTareas()); 	
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());																	
		System.out.println(Juan.getNombreEmpresa());
		System.out.println(Juan.getEmail());
		
		/*DirectorEmpleado Maria = contexto.getBean("miSecretarioEmpleado", DirectorEmpleado.class);
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println("Email de Pablo: "+Pablo.getEmail());
		System.out.println("Nombre de la Empresa: "+Maria.getNombreEmpresa());*/
		contexto.close();
	}
}
