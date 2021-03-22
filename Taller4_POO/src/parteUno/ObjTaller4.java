package parteUno;

public class ObjTaller4 {
	public static void main(String[] args) {
		String[] nombres = { "Alejandro", "Jaime", "Daniel", "Santiago", "Alexander" };
		Persona[] personas = new Persona[5];

		// System.out.println(personas[3]); <- ERROR

		for (int i = 0; i < nombres.length; i++) {
			personas[i] = new Persona(nombres[i]);
		}

		System.out.println(personas[3]); // Soy Jaime

		Vehiculo auto = new Vehiculo("ABC-306", Motor.ELECTRICO, personas[4]);
		System.out.println("Yo, " + auto.getDueno().getNombre() + ", soy el dueño" + "del primer carro.");

		Vehiculo auto2 = new Vehiculo("TXT-452", Motor.GASOLINA);
		auto2.setDueno(personas[2]);
		System.out.println("Yo, " + auto2.getDueno().getNombre() + ", soy " + "el dueño del segundo carro.");
		// Obtener la velocid máxima del auto2.
		System.out.println(auto2.getMotor().getVelocidadMaxima());
		
		auto.getDueno().setMejorAmigo(personas[3]);
		System.out.println("Yo soy " + auto.getDueno().getNombre() +
				" y mi mejor amigo es " + auto.getDueno().getMejorAmigo().getNombre());

		personas[0] = null;
		personas[1] = personas[2];
		personas[4] = null;
		personas[3].finalize();
		System.out.println(personas[1]);
		System.out.println(personas[3]); // Soy Daniel
		System.out.println(auto2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
