package entieties;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Automato {
    
    private List<String> estado = new ArrayList<>();
    private List<String> alfabeto = new ArrayList<>();
    private List<Transicao> transicoes = new ArrayList<>();
    private String qInicial;
    private List<String> finais = new ArrayList<>();
    private List<Transicao> tabela = new ArrayList<>();
    private Set<String> novosFinais = new TreeSet<String>();
    
    public Set<String> getNovosFinais() {
		return novosFinais;
	}

	public void setNovosFinais(Set<String> novosFinais) {
		for(String x: novosFinais){
            System.out.println("novos final: " + x);
        }
		this.novosFinais = novosFinais;
	}

	public List<String> getEstado() {
        for(String x: estado){
            System.out.println("estado: " + x);
        }
        return estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }


    public List<String> getAlfabeto() {
         for(String x: alfabeto){
            System.out.println("alfabeto: " + x);
        }
        return alfabeto;
    }

    public void setAlfabeto(List<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public List<Transicao> getTransicoes() {
        for(Transicao x: transicoes){
            System.out.println("transicoes: " + x);
        }
        return transicoes;
    }

    public void setTransicoes(List<Transicao> transicoes) {
        this.transicoes = transicoes;
    }

    public String getqInicial() {
        System.out.println("inicial:" + qInicial);
        return qInicial;
    }

    public void setqInicial(String qInicial) {
        this.qInicial = qInicial;
    }


    public List<String> getFinais() {
    	for(String x: finais){
            System.out.println("final: " + x);
        }
        return finais;
    }

    public void setFinais(List<String> finais) {
        this.finais = finais;
    }
    
    public List<Transicao> getTabela() {
    	 for(Transicao x: tabela){
             System.out.println("Tabela: " + x);
         }
		return tabela;
	}

	public void setTabela(List<Transicao> tabela) {
		this.tabela = tabela;
	}

	@Override
    public String toString() {
        return "Automato{" + "estado=" + estado + ", alfabeto=" + alfabeto + ", transicoes=" + transicoes + ", qInicial=" + qInicial + ", finais=" + finais + '}';
    }
    
}
