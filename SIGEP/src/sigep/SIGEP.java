package sigep;

public class SIGEP {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Empreendedor listaEmp[] = new Empreendedor[100];
        
        Investidor listaInv[] = new Investidor[100];
        Contribuidor listaCon[] = new Contribuidor[3];
        Beneficiario listaBen[] = new Beneficiario[3];
        int contadoraux=0, opcao, contaE=0, contaId=0, contaInv=0, contaC=0, contaB=0;
        do {
	System.out.println("Digite: ");
	System.out.println("(1) Cadastrar Empreendedor");
	System.out.println("(2) Cadastrar Ideia de Negocio");
	System.out.println("(3) Cadastrar Investidor");
        System.out.println("(4) Listar Empreendedores");
        System.out.println("(5) Aplicar um Investimento");
        System.out.println("(6) Sair");

        opcao = leitor.leInteiro();

        switch(opcao) {
            case 1:
                String nome, cpf, estado, descricao, investidor;
                int dia, mes, ano, aux, valor, numero, index;
                Investidor novo;
                IdeiaDeNegocio listaIdeia[] = new IdeiaDeNegocio[300];

                System.out.println("Digite o nome");
                nome = leitor.leString();
                System.out.println("Digite o cpf");
                cpf = leitor.leString();
                System.out.println("Digite o dia de criacao da Ideia");
                dia = leitor.leInteiro();
                System.out.println("Digite o mes de criacao da Ideia");
                mes = leitor.leInteiro();
                System.out.println("Digite o ano de criacao da Ideia");
                ano = leitor.leInteiro();
                System.out.println("A ideia ja foi implementada? (SIM/NAO)");
                estado = leitor.leString();
                System.out.println("Digite a descricao da Ideia (MAX = 1000 caracteres)");
                descricao = leitor.leString();
                
                listaIdeia[contaId] = new IdeiaDeNegocio(new Data(dia, mes, ano), descricao, ImplanteIdeia.valueOf(estado));
                listaEmp[contaE] = new Empreendedor(nome, cpf);
                listaEmp[contaE].setLista(listaIdeia);
                
                System.out.println("Esse Empreendedor possui investidores? (1)Sim, (2)Nao");
                aux = leitor.leInteiro();
                if(aux==1){
                    System.out.println("Quantos Investidores esse Empreendedor possui? (1), (2) ou (3)");
                    numero = leitor.leInteiro();
                    
                    for(index=0; index<numero; index++){
                        
                        System.out.println("Digite o valor do Investimento "+index+1);
                            valor = leitor.leInteiro();
                        System.out.println("Digite o nome do Investidor "+index+1);
                            investidor = leitor.leString();
                        
                            while(contadoraux < 100){
                                if(listaInv[contadoraux].getNome().equals(investidor)){
                                    novo = listaInv[contadoraux];
                                    listaCon[contaC] = new Contribuidor(novo, valor);
                                    contaC++;
                                }else{
                                    System.out.println("Investidor Nao Encontrado");
                                }
                            contadoraux++;
                            }  
                    }
                    listaEmp[contaE].setListaContribuidor(listaCon);
                    contaId++;
                    contaE++;
                }else{
                    contaId++;
                    contaE++;
                    break;
                }
                break;

            case 2:
                String estadoA, descricaoA, investidorA, nomeA;
                int diaA, mesA, anoA, auxA, valorA, numeroA, indexA, contadorauxA=0;
                Investidor novoA;
                IdeiaDeNegocio listaIdeiaB[] = new IdeiaDeNegocio[300];

                System.out.println("Digite o dia de criacao da Ideia");
                diaA = leitor.leInteiro();
                System.out.println("Digite o mes de criacao da Ideia");
                mesA = leitor.leInteiro();
                System.out.println("Digite o ano de criacao da Ideia");
                anoA = leitor.leInteiro();
                System.out.println("A ideia ja foi implementada? (SIM/NAO)");
                estadoA = leitor.leString();
                System.out.println("Digite a descricao da Ideia (MAX = 1000 caracteres)");
                descricaoA = leitor.leString();
                listaIdeiaB[contaId] = new IdeiaDeNegocio(new Data(diaA, mesA, anoA), descricaoA, ImplanteIdeia.valueOf(estadoA));
                /*
                System.out.println("Essa Ideia possui investidores? (1)Sim, (2)Nao");
                auxA = leitor.leInteiro();
                if(auxA==1){
                    System.out.println("Quantos Investidores essa Ideia possui? (1), (2) ou (3)");
                    numeroA = leitor.leInteiro();
                    
                    for(indexA=0; indexA<numeroA; indexA++){
                        
                        System.out.println("Digite o valor do Investimento "+indexA+1);
                            valorA = leitor.leInteiro();
                        System.out.println("Digite o nome do Investidor "+indexA+1);
                            investidorA = leitor.leString();
                        
                            while(contadorauxA < 100){
                                if(listaInv[contadoraux].getNome() == investidorA){
                                    novoA = listaInv[contadoraux];
                                    listaCon[contaC] = new Contribuidor(novoA, valorA);
                                    contaC++;
                                }else{
                                    System.out.println("Investidor Nao Encontrado");
                                }
                            contadorauxA++;
                            }  
                    }
                    listaIdeiaB[contaId].setLista(listaCon);
                }else{
                    break;
                }*/
                
                System.out.println("Digite o nome do Empreendedor criador da Ideia");
                nomeA = leitor.leString();
                  
                    for(int i=0; i<100; i++){
                        if(listaEmp[i].getNome().equals(nomeA)){
                            listaEmp[i].setLista(listaIdeiaB);
                            System.out.println("Ideia registrada com sucesso.");
                        }else{
                            System.out.println("Empreendedor nao encontrado.");
                        }
                    }
                
                
                contaId++;
                break;

            case 3:
                String nomeB, tipo, beneficiario;
                int det, numeroB, indexB, valorB, contadorauxB=0;
                Empreendedor novoB;
                
                System.out.println("Digite o nome do Investidor");
                nomeB = leitor.leString();
                System.out.println("Digite o tipo de investidor. (PEQUENO, MEDIO, GRANDE)");
                tipo = leitor.leString();
                
                listaInv[contaInv] = new Investidor(nomeB, PorteInvestidor.valueOf(tipo));
                
                System.out.println("Esse Investidor ja possui Investimentos? (1)Sim, (2)Nao");
                det = leitor.leInteiro();
                
                if(det == 1){
                    System.out.println("Quantos Investimentos esse Investidor possui? (1), (2) ou (3)");
                    numeroB = leitor.leInteiro();
                    
                    for(indexB=0; indexB<numeroB; indexB++){
                        
                        System.out.println("Digite o valor do Investimento "+indexB+1);
                            valorB = leitor.leInteiro();
                        System.out.println("Digite o nome do Empreendedor a ser beneficiado "+indexB+1);
                            beneficiario = leitor.leString();
                        
                            while(contadorauxB < 100){
                                if(listaEmp[contadorauxB].getNome().equals(beneficiario)){
                                    novoB = listaEmp[contadorauxB];
                                    listaBen[contaB] = new Beneficiario(novoB, valorB);
                                    contaB++;
                                }else{
                                    System.out.println("Empreendedor Nao Encontrado");
                                }
                            contadorauxB++;
                            }  
                    }
                    listaInv[contaInv].setLista(listaBen);
                    contaInv++;
                }else{
                    contaInv++;
                    break;
                }
                
                break;

            case 4:
                int indiceA, indiceB, indiceC;
                IdeiaDeNegocio listaAuxA[] = new IdeiaDeNegocio[300];
                Contribuidor listaAuxB[] = new Contribuidor[3];
                for(indiceA=0; indiceA<100; indiceA++){
                   
                    System.out.println("Nome: "+listaEmp[indiceA].getNome());
                    System.out.println();
                    System.out.println("CPF: "+listaEmp[indiceA].getCpf());
                    System.out.println();
                    
                    for(indiceC=0; indiceC<3; indiceC++){
                        
                        listaAuxB = listaEmp[indiceA].getListaContribuidor();
                        System.out.println("Nome Investidor: "+ listaAuxB[indiceC].getNome());
                        System.out.println();
                        System.out.println("Valor Investimento: "+ listaAuxB[indiceC].getValor());
                        System.out.println();
                    }
                    listaAuxA = listaEmp[indiceA].getLista();
                    
                        for(indiceB=0; indiceB<300; indiceB++){
                            System.out.println("Ideia Numero "+ indiceB);
                            System.out.println();
                            System.out.println("Data: "+ listaAuxA[indiceA].getData());
                            System.out.println();
                            System.out.println("Descricao: "+ listaAuxA[indiceA].getDescricao());
                            System.out.println();
                            System.out.println("Estado: "+ listaAuxA[indiceA].getEstado());
                            System.out.println();
                        }
                    
                }

                break;

            case 5:
                String nomeC, nomeD;
                int valorC, contadorA=0, contadorB=0;
                Investidor invest;
                Empreendedor emp;
                
                
                System.out.println("Digite o Nome do Investidor");
                nomeC = leitor.leString();
                System.out.println("Digite o Nome do Empreendedor");
                nomeD = leitor.leString();
                System.out.println("Digite o Valor do Investimento");
                valorC = leitor.leInteiro();
                
                while(contadorA<100){
                    if(listaInv[contadorA].getNome().equals(nomeC)){
                        invest = listaInv[contadorA];
                        Contribuidor contribuidor1 = new Contribuidor(invest, valorC);
                    }else{
                        System.out.println("Investidor Nao Encontrado");
                    }
                contadorA++;
                }
                while(contadorB<100){
                    if(listaEmp[contadorB].getNome().equals(nomeD)){
                        emp = listaEmp[contadorB];
                        Beneficiario beneficiario1 = new Beneficiario(emp, valorC);
                    }else{
                        System.out.println("Empreendedor Nao Encontrado");
                    }
                contadorB++;
                }
                break;        

            case 6:
                System.out.println("Saindo...");
                break;
        }
		} while(opcao != 6);
        
    }
}
