package Controller;
import java.util.concurrent.Semaphore;

public class Processos extends Thread {
	private int threadId;
	Semaphore semaforo01;
	Semaphore semaforo02;
	Semaphore semaforo03;
	Semaphore semaforo04;
	Semaphore semaforo05;
	Semaphore semaforo06;
	Semaphore semaforo07;
	Semaphore semaforo08;
	int volta = 1;
	int t = 1000000000;
	Tempo tem = new Tempo(threadId, t);
	
	public Processos(int threadId, Semaphore semaforo01, Semaphore semaforo02, Semaphore semaforo03, Semaphore semaforo04, Semaphore semaforo05, Semaphore semaforo06, Semaphore semaforo07, Semaphore semaforo08) {
		this.threadId = threadId;
		this.semaforo01 = semaforo01;
		this.semaforo02 = semaforo02;
		this.semaforo03 = semaforo03;
		this.semaforo04 = semaforo04;
		this.semaforo05 = semaforo05;
		this.semaforo06 = semaforo06;
		this.semaforo07 = semaforo07;
		this.semaforo08 = semaforo08;
	}
	
	public void run() {
		
		if (threadId == 1) {
			time01();
		}
		if (threadId == 2) {
			time01();
		}
		if (threadId == 3) {
			time02();
		}
		if (threadId == 4) {
			time02();
		}
		if (threadId == 5) {
			time03();
		}
		if (threadId == 6) {
			time03();
		}
		if (threadId == 7) {
			time04();
		}
		if (threadId == 8) {
			time04();
		}
		if (threadId == 9) {
			time05();
		}
		if (threadId == 10) {
			time05();
		}
		if (threadId == 11) {
			time06();
		}
		if (threadId == 12) {
			time06();
		}
		if (threadId == 13) {
			time07();
		}
		if (threadId == 14) {
			time07();
		}
		
		tem.salvar();
	}

	private void time01() {
		
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo02.acquire();
				pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo02.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time02() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo03.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo03.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time03() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo04.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo04.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time04() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo05.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo05.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time05() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo06.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo06.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time06() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo07.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo07.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time07() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				semaforo08.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo08.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private int pista() {
		try {
			semaforo01.acquire();
			
			System.out.println("O carro #" + threadId +" está dando a " + volta + " volta!");
			int tempo = (int) (Math.random()* 17001) + 1000;
			sleep(tempo);
			System.out.println("O carro #" + threadId +" completou a " + volta + " volta em "+(tempo/1000)+" segundos");
			volta++;
			if (tempo < t) {
				t = tempo;
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaforo01.release();
		}
		return(t);
	}
}