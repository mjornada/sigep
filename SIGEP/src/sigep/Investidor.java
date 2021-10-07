package sigep;

import java.util.ArrayList;

public class Investidor {
    private String nome;
    private PorteInvestidor tipo;
    Beneficiario lista[] = new Beneficiario[3];

    public Investidor(String nome, PorteInvestidor tipo) {
        setNome(nome);
        setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()<30){
            this.nome = nome;
                }else{
                    System.out.println("Nome deve ter menos de 30 caracteres.");
                }
    }

    public PorteInvestidor getTipo() {
        return tipo;
    }

    public void setTipo(PorteInvestidor tipo) {
        this.tipo = tipo;
    }

    public Beneficiario[] getLista() {
        return lista;
    }

    public void setLista(Beneficiario[] lista) {
        if(lista.length < 3){
            this.lista = lista;
        }else{
            System.out.println("Quantidade maxima de Investimentos extrapolada.");
        }
    }
    
    
}
