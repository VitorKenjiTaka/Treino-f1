package Controller;

public class Tempo {
	int[] tempos = new int[14];
	private int t;
	private int threadId;
	
	
	public Tempo(int threadId, int t) {
		this.t = t;
		this.threadId = threadId;
	}
	
	public Tempo() {
		super();
	}
	
	
	public void salvar() {
		
		tempos[threadId] = t;
		
	}

}
