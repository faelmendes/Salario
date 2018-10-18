
package salario;

import java.util.Scanner;
public class Principal{
public static Scanner sc = new Scanner(System.in);
public static void main(String args[]){
RH controle = new RH();
String comando;
String help = "\t============= help =====================\n"+
					  "\taddprof:_nome_latra de A a E_: cadastra professor \n"+
					  "\taddter :_nome_numero de horas_insalubri sim ou nao_ : cadastra terceirizado \n"+
					  "\taddsta :_nome_numero_: cadastra Sta \n"+
                                          "\trm :_nome_: remove funcionario \n"+
                                          "\tsetbonus :_numero_: divide o o bonus pelo numero de funcionario\n"+
                                          "\taddDiaria :_nome_: adiciona 100 ao salario do funcionario\n"+
					  "\tshow:_nome_: mostra o funcionario\n"+
					  "\tend: sai do programa\n"+
					  "\t========================================\n";

while(true){

System.out.print("Digite um comando (help para ver os comandos) ");
comando = sc.nextLine();

         if(comando.equals("help")){
				System.out.println(help);
				
			 
        }else if(comando.equals("end")){
				System.out.println("  Até a próxima :)");
				break;
			}else{ 
		 

                String c[] = comando.split(" ");
                int p;
                double d;
                boolean teste;
                switch(c[0]){
                            case "addprof":
                                     
                                    char um=c[2].charAt(0);
                                    Funcionario Prof = new Professor(c[1],um);
                                    System.out.println(controle.cadastra(Prof));
                                   
                                    
                                break;
                            case "addsta":

                                    p = Integer.parseInt(c[2]);
                                    Funcionario Sta = new STA(c[1],p);
                                    System.out.println(controle.cadastra(Sta));    


                                break;
                            case "addter":
                                    p = Integer.parseInt(c[2]);
                                    if(c[3].equals("sim")){
                                        teste = true;
                                    }else{
                                        teste = false;
                                    }
                                    Funcionario Ter = new Terceirizado(c[1],p,teste);
                                    System.out.println( controle.cadastra(Ter)); 
                                
                                break;
                            case "show":
                                    controle.show(c[1]);
                                        

                                    break;
                            case "addDiaria":
                                    System.out.println(controle.diaria(c[1]));
                                        

                                    break;
                            case "rm":
                                    controle.remover(c[1]);
                                        

                                    break;
                            case "setbonus":
                                    d = Double.parseDouble(c[1]);
                                    controle.bonus(d);
                                        

                                    break;
                            default:

                                    System.out.println("  Comando inválido.");

                            }
            }


}










}
}



	    







