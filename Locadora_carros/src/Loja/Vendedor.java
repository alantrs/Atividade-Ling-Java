package Loja;

public class Vendedor {
	
	
	
	private String nome;
	private String endereço;
	private long telefone;
	private long cpf;
	private float salario;
	
	public Vendedor (String nome, String endereço , int telefone, int cpf, float salario)
	{ 
		this.nome=nome;
		this.endereço=endereço;
		this.telefone=telefone;
		this.cpf=cpf;
		this.salario=salario;
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Vendedor V1= new Vendedor("Aldrik", "Campos São José", 982169588, 456123456, 1500);
		Vendedor V2= new Vendedor("Igor", "Monte Castelo", 984758916, 456789123, 1500 );
		Vendedor V3= new Vendedor("Ivaldo", "Jardim Paulista", 987459872, 412478496, 1500);
		
		System.out.println(V1.nome + ' ' + V2.endereço + ' ' + V3.telefone);
	}

}
