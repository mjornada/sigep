package sigep;

public class Beneficiario {
    private Empreendedor nome;
    private int valor;

    public Beneficiario(Empreendedor nome, int valor) {
        setNome(nome);
        setValor(valor);
    }

    public Empreendedor getNome() {
        return nome;
    }

    public void setNome(Empreendedor nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
