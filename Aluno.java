import java.util.ArrayList;

class Aluno{
	private ArrayList<Prova> provas; 
	private double media;
	
	public Aluno(){
		media = 0;
		this.provas = new ArrayList<Prova>();	
	}
		
	public Aluno(Prova prova1, Prova prova2){
		media = 0;
		this.provas = new ArrayList<Prova>();	
		this.provas.add(prova1);
		this.provas.add(prova2);
	}
	
	public double calcularMedia(){
		int quantidadeProvas = this.provas.size();		
		for(Prova prova : this.provas){
			this.media += prova.calcularNotaTotal();		
		}	
		this.media = this.media / quantidadeProvas;
		return this.media;
	}

	public double getMedia(){
		return this.media;	
	}

	public void adicionarProva(Prova prova){
		this.provas.add(prova);	
	}

		
}
