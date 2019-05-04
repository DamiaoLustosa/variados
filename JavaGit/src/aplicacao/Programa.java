package aplicacao;

import java.util.Date;

import enumeracoes.OrderStatus;
import aplicacao.Ordem;


//Escrito para atividade com a classe OrderStatus e Ordem, sobre enumerações
public class Programa {

	public static void main (String args []) {
		
		Ordem order = new Ordem(1080, new Date(), OrderStatus.AGUARDANDOPAGAMENTO);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		System.out.println(os1);
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");	//CONVERSÃO PARA STRING
		System.out.println(os2);
		
				
	}
}
