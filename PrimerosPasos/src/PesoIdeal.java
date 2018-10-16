import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero = "";
		do{
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M):");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("F"));
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm:"));
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H"))
			pesoIdeal = altura - 110;
		else if(genero.equalsIgnoreCase("M"))
			pesoIdeal = altura - 120;
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " kg.");
	}

}
