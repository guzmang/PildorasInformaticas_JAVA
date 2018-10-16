package uso_threads;

public class BancoSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco4 b = new Banco4();
		for(int i = 0; i < 100; i++) {
			EjecucionTransferencias4 r = new EjecucionTransferencias4(b, i, 2000);
			Thread t = new Thread(r);
			t.start();
		}
	}

}

class Banco4 {
	
	public Banco4() {
		cuentas = new double[100];
		
		for(int i = 0; i < cuentas.length; i++)
			cuentas[i] = 2000;
		
	}
	
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		while(cuentas[cuentaOrigen] < cantidad)	// evalua que el saldo no es inferior a la transferencia
			wait();
			
		System.out.println(Thread.currentThread());
		cuentas[cuentaOrigen] -= cantidad;	// dinero que sale de la cuenta origen
		System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
		cuentas[cuentaDestino] += cantidad;
		System.out.printf("Saldo total: %10.2f\n", getSaldoTotal());
		notifyAll();
	}
	
	public double getSaldoTotal() {
		double sumaCuentas = 0;
		for(double a: cuentas) {
			sumaCuentas += a;
		}
		return sumaCuentas;
	}
	
	private final double[] cuentas;
	
}

class EjecucionTransferencias4 implements Runnable {

	public EjecucionTransferencias4(Banco4 b, int de, double max) {
		banco = b;
		deLaCuenta = de;
		cantidadMax = max;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				int paraLaCuenta = (int)(100 * Math.random());
				double cantidad = cantidadMax * Math.random();
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				Thread.sleep((int)(Math.random() * 10));
			}	
		} catch (InterruptedException e) {
			
		}
	}
	
	private Banco4 banco;
	private int deLaCuenta;
	private double cantidadMax;
	
}