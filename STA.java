
package salario;


public class STA extends Funcionario{

	private int nivel;
    

    public STA(String nome, int nivel){
        super(nome, 1);
        this.nivel = nivel;
        calcularSalario();

    }
    
    public int getNivel(){
    	return this.nivel;

    }

    public void setNivel(int nivel){
    	this.nivel =  nivel; 

    }

    public String toString(){
    	String res = "";
        res+="Sta ";
    	res += super.toString();
    	res += "Nível: " + this.nivel + "\n";
    	return res;
    }

    private void calcularSalario(){
    	 setSalario(3000 + (300 * this.nivel));
    }

}