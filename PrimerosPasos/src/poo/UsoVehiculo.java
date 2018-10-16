package poo;

//import javax.swing.JOptionPane;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// parte 1
//		Coche miCoche = new Coche();
//		miCoche.setColor(JOptionPane.showInputDialog("Introduce color"));
//		System.out.println(miCoche.getDatosGrales());
//		System.out.println(miCoche.getColor());
//		miCoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
//		System.out.println(miCoche.getAsientos());
//		miCoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
//		System.out.println(miCoche.getClimatizador());
//		System.out.println(miCoche.dimePesoCoche());
//		System.out.println("El precio final del coche es: " + miCoche.getPrecioCoche());
		
		// parte 2
		Coche miCoche1 = new Coche();
		miCoche1.setColor("Rojo");
		Furgoneta miFurgoneta1 = new Furgoneta(7, 500);
		miFurgoneta1.setColor("Azul");
		miFurgoneta1.setAsientos("si");
		miFurgoneta1.setClimatizador("si");
		System.out.println(miCoche1.getDatosGrales() + " " + miCoche1.getColor());
		System.out.println(miFurgoneta1.getDatosGrales() + " " + miFurgoneta1.getDatosFurgoneta());
		
	}

}
