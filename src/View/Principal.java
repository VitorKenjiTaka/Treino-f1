package View;
import java.util.concurrent.Semaphore;
import Controller.Processos;
public class Principal {

	public static void main(String[] args) {
		Semaphore semaforo01 = new Semaphore(5);
		Semaphore semaforo02 = new Semaphore(1);
		Semaphore semaforo03 = new Semaphore(1);
		Semaphore semaforo04 = new Semaphore(1);
		Semaphore semaforo05 = new Semaphore(1);
		Semaphore semaforo06 = new Semaphore(1);
		Semaphore semaforo07 = new Semaphore(1);
		Semaphore semaforo08 = new Semaphore(1);
		
		System.out.println("Carro #1 - time: 1\n"
				+ "Carro #2 - time: 1\n"
				+ "Carro #3 - time: 2\n"
				+ "Carro #4 - time: 2\n"
				+ "Carro #5 - time: 3\n"
				+ "Carro #6 - time: 3\n"
				+ "Carro #7 - time: 4\n"
				+ "Carro #8 - time: 4\n"
				+ "Carro #9 - time: 5\n"
				+ "Carro #10 - time: 5\n"
				+ "Carro #11 - time: 6\n"
				+ "Carro #12 - time: 6\n"
				+ "Carro #13 - time: 7\n"
				+ "Carro #14 - time: 7\n");
		
		for (int threadId = 1; threadId < 15; threadId ++) {
			Thread thread = new Processos(threadId, semaforo01, semaforo02, semaforo03, semaforo04, semaforo05, semaforo06, semaforo07, semaforo08);
			thread.start();
		}
	}

}
