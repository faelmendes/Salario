
package salario;

import java.util.ArrayList;

public class RH {
  private ArrayList<Funcionario> Afuncionario = new ArrayList();
    private double valor;
    private double bonus;
    
    
    
    public String cadastra(Funcionario t){  
        if(this.Afuncionario.size() >= 0 ){
            for(int i=0;i < this.Afuncionario.size();i++){
                if(this.Afuncionario.get(i).getNome().equals(t.getNome())){
                     return " funcionario(a) já esta cadastrado"; 



                }
        
            }
        }
          this.Afuncionario.add(t);
          return " Done"; 
           
        }
        
    

    public boolean show(String nome){
        for(int i=0;i <  this.Afuncionario.size();i++){
            if( this.Afuncionario.get(i).getNome().equals(nome)){
                System.out.print( this.Afuncionario.get(i));
                return false;


            }

        }
        System.out.println(" funcionario(a) "+nome+" nao existe");
        return true;


    }

    public String diaria(String nome){
        for(int i=0;i <  this.Afuncionario.size();i++){
              if( this.Afuncionario.get(i).getNome().equals(nome) &&  this.Afuncionario.get(i).getMaxDiarias() == 3){
                    return " Terceirizado nao pode receber diaria";
              }
              if(this.Afuncionario.get(i).getNome().equals(nome) && 
                      this.Afuncionario.get(i).getDiarias() < this.Afuncionario.get(i).getMaxDiarias()){
                           this.Afuncionario.get(i).setDiarias(this.Afuncionario.get(i).getDiarias()+1);
                           this.Afuncionario.get(i).setSalario( this.Afuncionario.get(i).getSalario()+100);
                           return " done";


              } 
              if( this.Afuncionario.get(i).getNome().equals(nome) && 
                      this.Afuncionario.get(i).getDiarias() ==  this.Afuncionario.get(i).getMaxDiarias()){
                  return " fail: limite de diarias atingido";
              }

       }
          return " funcionario(a) "+nome+" nao existe";

   }



    public boolean remover(String nome){
        for(int i=0;i < this.Afuncionario.size();i++){
             if( this.Afuncionario.get(i).getNome().equals(nome)){
                  System.out.println(this.Afuncionario.get(i).toString().substring(0, 4)+" "+this.Afuncionario.get(i).getNome()+" removido");
                  this.Afuncionario.remove(i);
                  return true;



             }

         }
         System.out.println(" funcionario(a) "+nome+" nao existe");
         return false;
       
            
    }
    


    public void bonus(double numero){
        this.bonus = numero/ this.Afuncionario.size();
        menosBonus();
        this.valor = this.bonus;
        for(int i=0;i < this.Afuncionario.size();i++){
                this.Afuncionario.get(i).setSalario( this.Afuncionario.get(i).getSalario()+bonus);
                 this.Afuncionario.get(i).setNovoBonus(1);
                 

       }

   }  
    
    public void menosBonus(){
        for(int i=0;i < this.Afuncionario.size();i++){
               if( this.Afuncionario.get(i).getNovoBonus() > 0){
                   this.Afuncionario.get(i).setSalario( this.Afuncionario.get(i).getSalario()-this.valor);
               }

       }
       

   } 
   
   
   
   
   
   
        
        
}
      
  
