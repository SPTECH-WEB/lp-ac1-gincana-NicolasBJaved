package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;

    public Gincana(String nome, Double premio){
        this.nome = nome;
        this.premio = premio;
        this.qtdInscrito = 0;
        this.ativa = true;
    }

    public void inscrever(Integer qtd){
        if(qtd == null || qtd <= 0 || !this.ativa){
            return;
        }

        this.qtdInscrito += qtd;
    }

    public Integer remover(Integer qtd){
        if(qtd == null || qtd <= 0 || !this.ativa || qtd >= this.qtdInscrito){
            return null;
        }

        this.qtdInscrito -= qtd;
        return qtd;
    }

    public Integer desativar(){
        if(!this.ativa){
            return null;
        }

        this.ativa = false;
        Integer quantidade = this.qtdInscrito;
        this.qtdInscrito = 0;
        return quantidade;
    }

    public void transferir(Gincana destino, Integer qtdATransferir){
        if(destino == null || !destino.ativa || qtdATransferir == null || qtdATransferir <= 0 || qtdATransferir > this.qtdInscrito || !this.ativa){
            return;
        }

        this.qtdInscrito -= qtdATransferir;
        destino.qtdInscrito += qtdATransferir;
    }

    public Boolean reajustarPremio(Double reajuste){
        if(reajuste == null || reajuste <=0){
            return false;
        }

        this.premio += premio*reajuste;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public Double getPremio() {
        return premio;
    }

    public Integer getQtdInscrito() {
        return qtdInscrito;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
