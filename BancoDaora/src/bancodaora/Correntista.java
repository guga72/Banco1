package bancodaora;


public class Correntista {
    private String nome;
    private String cpf;
    
    Correntista(String a, String b){
        this.nome = a;
        this.cpf = b;
    }
    
    public String getCpf() {
		return cpf;
	}
    
    public String getNome() {
		return nome;
	}
}
