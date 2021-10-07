package sigep;

import java.util.ArrayList;

public class IdeiaDeNegocio{
    private String descricao;
    private Data data;
    private ImplanteIdeia estado;
    

    public IdeiaDeNegocio(Data data, String descricao, ImplanteIdeia estado) {
        setData(data);
        setDescricao(descricao);
        setEstado(estado);
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length()<1000){
            this.descricao = descricao;
                }else{
                    System.out.println("A descricao deve ter menos de 1000 caracteres.");
                }
    }

    public ImplanteIdeia getEstado() {
        return estado;
    }

    public void setEstado(ImplanteIdeia estado) {
        this.estado = estado;
    }
}
