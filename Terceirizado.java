
package salario;

public class Terceirizado extends Funcionario{
	private int horasTrabalhadas;
	private boolean insalubre;
        double salario;

	public Terceirizado(String nome, int horasTrabalhadas,
		boolean insalubre) {
		super(nome, 3);
		this.horasTrabalhadas = horasTrabalhadas;
		this.insalubre = insalubre;
                calcularSalario();
	} 

	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public boolean isInsalubre() {
		return this.insalubre;
	}
	public void setInsalubre(boolean insalubre) {
		this.insalubre = insalubre;
	}

	private void calcularSalario(){

		 setSalario(4 *  this.horasTrabalhadas);

		if(this.insalubre){
			 setSalario(getSalario()+500);
		}

		

	}

	public String toString(){
		String res ="";
                res+="Ter ";
		res += super.toString();
		res += "Horas de Trabalho: " + this.horasTrabalhadas +"\n" +
		"Salubridade: " + this.insalubre + "\n";
		return res;
	}

}


    
    
    
    
    
    
    
    
    
    

