import java.util.ArrayList;

class Turma{
	private ArrayList<Aluno> alunos;
	private double mediaTurma;	

	public Turma(){
		this.alunos = new ArrayList<Aluno>();	
	}
	
	public void calcularMedia(){
		int quantidadeAlunos = this.alunos.size();		
		for(Aluno aluno : this.alunos){
			this.mediaTurma += aluno.calcularMedia();
		}	
		this.mediaTurma = this.mediaTurma / quantidadeAlunos;
	}

 	public void adicionarAluno(Aluno aluno){
		alunos.add(aluno);
	}
}
