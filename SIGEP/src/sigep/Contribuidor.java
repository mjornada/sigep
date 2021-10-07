package sigep;

public class Contribuidor {
    private Investidor nome;
    private int valor;

    public Contribuidor(Investidor nome, int valor) {
        setNome(nome);
        setValor(valor);
    }
    
    public Investidor getNome() {
        return nome;
    }

    public void setNome(Investidor nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
