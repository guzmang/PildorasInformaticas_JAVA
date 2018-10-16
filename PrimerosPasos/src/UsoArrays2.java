
public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] matrizAleatorios = new int[150];
		
		for(int i = 0; i < matrizAleatorios.length; i++) {
			matrizAleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numero: matrizAleatorios) {
			System.out.print(numero + " ");
		}
		
	}

}
