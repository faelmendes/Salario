
package salario;


public class Professor extends Funcionario{

	private char classe;
        

	public Professor(String nome, char classe){
		super(nome, 2);
		this.classe = classe;
                calcularSalario();
	}
	public char getClasse(){
		return this.classe;
	}
	public void setClasse(char classe){
		this.classe = classe;
	}
        
        
       
        
        
	public String toString(){
		String res ="";
                res+="Prof ";
		res += super.toString();
		res += "Classe: " + this.classe + "\n";
		return res;
	}
        
        private void calcularSalario(){
		switch(this.classe){
			case 'A':
				this.setSalario(3000);
                                break;
			case 'B':
                                this.setSalario(5000);
                                break;
			case 'C':
                                this.setSalario(7000);
                                break;
			case 'D':
                                this.setSalario(9000);
                                break;
			default:
                                this.setSalario(11000);
				 
		}
	}
        
               
	
}





    
    
    
    
    
    
 