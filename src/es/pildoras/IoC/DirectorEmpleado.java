package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//Construcor que Inyecta la Dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+ informeNuevo.getInforme();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	//Creacion de Campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	// Metodo Init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		 System.out.println("Dentro del metodo Init. Aqui iran las tareas a ejecutar "
		 		+ "antes de que el bean este listo.");
	}
	
	// Metodo Init. Ejecutar tareas despues de que el bean se uso.
		public void metodoFinal() {
			 System.out.println("Dentro del metodo destroy. Aqui iran las tareas a ejecutar "
			 		+ "despues de que el bean muera.");
		}
		
		private String email;
		private String nombreEmpresa;
}
