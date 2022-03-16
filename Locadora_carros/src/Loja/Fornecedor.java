package Loja;

public class Fornecedor {
	
	
	private String nome;
	private String endereço;
	private long telefone;
	private long cpf;
	private String cidade;
	private String estado;
	private String email;
	
	public Fornecedor (String nome, String endereço , long telefone, long cpf, strin cidade, string estado, string email)
	{ 
		this.nome=nome;
		this.endereço=endereço;
		this.telefone=telefone;
		this.cpf=cpf;
		this.cidade=cidade;
		this.estado=estado;
		this.email=email;
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fornecedor F1= new Fornecedor("fornecedor1", "Endereço1", 123456789, 4564556581, "cidade1", "estado1", "fornecedor1@gmail.com");
		Fornecedor F2= new Fornecedor("fornecedor2", "Endereço2", 987654123, 4585155612, "cidade2", "estado2", "fornecedor2@gmail.com");
		Fornecedor F3= new Fornecedor("fornecedor3", "Endereço1", 456789123, 7894556554, "cidade3", "estado3", "fornecedor3@gmail.com");
		
		System.out.println(F1.nome + ' ' + F2.endereço + ' ' + F3.telefone);
	}

}
