package aplicacao;

import java.util.Date;

import enumeracoes.OrderStatus;

public class Ordem {
	private Integer Id;
	private Date momento;
	private OrderStatus status;
	
	//Construtores
	public Ordem() {
		
	}


	public Ordem(Integer id, Date momento, OrderStatus status) {
		this.Id = id;
		this.momento = momento;
		this.status = status;
	}


	//Getters e Setters
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Ordem [Id=" + Id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
	
	

}
