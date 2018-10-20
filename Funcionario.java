
package salario;

public class Funcionario{
      
	private String nome;
	private int maxDiarias;
	private int diarias = 0;
        private double salario;
        private int novoBonus;

   

        
	public Funcionario(String nome, int maxDiarias){
		this.nome = nome;
		this.maxDiarias = maxDiarias;
	}
        
        public void setNovoBonus(int novoBonus) {
                this.novoBonus = novoBonus;
        }
        
        public int getNovoBonus() {
                return novoBonus;
        }
        
        public int getMaxDiarias(){
                return maxDiarias;
        }
        
        public double getSalario() {
                return salario;
        }

        public void setSalario(double salario) {
                this.salario = salario;
        }
        
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}	

	public int getDiarias(){
		return this.diarias;
	}
	public void setDiarias(int diarias){
		this.diarias = diarias;
	}
        
        
        
	public String toString(){
		String res = "";
		res +=  this.nome + "\n" +
                "Diarias "+ this.diarias + "\n" +
	        "Salario: " + this.salario + "\n";
		return res;
	}

}
















