package sigep;


public class Empreendedor {
    private String nome, cpf;
    IdeiaDeNegocio lista[] = new IdeiaDeNegocio[300];
    Contribuidor listaContribuidor[] = new Contribuidor[3];

    public Contribuidor[] getListaContribuidor() {
        return listaContribuidor;
    }

    public void setListaContribuidor(Contribuidor[] lista) {
        if(lista.length < 3){
            this.listaContribuidor = lista;
        }else{
            System.out.println("Quantidade maxima de Investidores extrapolada.");
        }
        
    }

    public Empreendedor(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-')
            this.cpf = cpf;
    }

    public IdeiaDeNegocio[] getLista() {
        return lista;
    }

    public void setLista(IdeiaDeNegocio[] lista) {
        this.lista = lista;
    }
    
      
}
