import java.util.Scanner;

public class UsoTallas {

//	enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {	// El constructor funciona como setter
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Talla s = Talla.MINI;
//		Talla m = Talla.MEDIANO;
//		Talla x = Talla.GRANDE;
//		Talla xl = Talla.MUY_GRANDE;
//		String talle = Talla.MUY_GRANDE.getAbreviatura();

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		String entradaDatos = entrada.next().toUpperCase();
		entrada.close();
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		System.out.println("Talla: " + laTalla);
		System.out.println("Abreviatura: " + laTalla.getAbreviatura());
	}

}
