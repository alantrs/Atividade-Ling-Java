# java
package LOJA;

public class carro {
	//c comentario de uma linha
	
	/*
	 * 
	 comentario de bloco 
	 */
	/**
	 *  comenatrio de documentação
	 * @param args
	 */
	
	// atributos de classe -> caracteristicas
	
	private String placa;
	private double potencia;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico;
	private int ano;
	private float preço;
	
	// metodo construtor executado apenas no ato da instância
	
	public carro(String plac, double poten, String modelo,  String cor, String marca, boolean cambio_automatico, int ano)
	{ 
		placa=plac;
		potencia=poten;
	//this necessario quando nomes iguais de atributo e argumentos
		this.modelo=modelo;
		this.cor=cor;
		this.cambio_automatico=cambio_automatico;
		this.ano=ano;
		this.marca=marca;
		
				
	}
	// metodos de acesso aos atributos
	public float get_preço() {
		return preço;
	}
	// set = mudar
	public void set_preço(float novopreço) {
		preço=novopreço;
	}
	// métodos -> ações
	public void andar() {
		System.out.println("andando");
		
	}
	public boolean frear() {
		System.out.println("freando");
		return true;
	} //fim
	public void correr(int velocidade) {
		System.out.println("estou correndo " +velocidade + " km/h");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando objetos da classe
		carro C1 = new carro("FDG6980", 2.0, "MODELO", "vermelho", "ferrari", true , 2020);
		
		// declarei e depois instanciei o objeto 
		carro C2;
		C2 = new carro("FDV5987", 2.0, "MODELO1", "azul", "ferrari", true, 2021);
		
		//usando objetos
		//C1.ano=2020;
		//C1.cor="vermelho";
		//C1.andar();
		
		//C2.marca="Ferrari";
		C2.correr(300);
		
		
		

	}

}
