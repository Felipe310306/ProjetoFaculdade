package model;

import java.util.ArrayList;
import java.util.List;

public class PacoteViagem {
    private int id;
    private String nome;
    private String destino;
    private int duracao;
    private String tipo;
    private float preco;
    private String detalhes;
    private List<ServicoAdicional> servicosAdicionais = new ArrayList<>();

    public PacoteViagem() {}

    public PacoteViagem(String nome, String destino, int duracao, String tipo, float preco, String detalhes) {
        this.nome = nome;
        this.destino = destino;
        this.duracao = duracao;
        this.tipo = tipo;
        this.preco = preco;
        this.detalhes = detalhes;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    public String getDetalhes() { return detalhes; }
    public void setDetalhes(String detalhes) { this.detalhes = detalhes; }

    public List<ServicoAdicional> getServicosAdicionais() {
        return servicosAdicionais;
    }

    public void setServicosAdicionais(List<ServicoAdicional> servicosAdicionais) {
        this.servicosAdicionais = servicosAdicionais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome)
                .append("\nDestino: ").append(destino)
                .append("\nDuração: ").append(duracao).append(" dias")
                .append("\nTipo: ").append(tipo)
                .append("\nPreço: R$").append(preco)
                .append("\nDetalhes: ").append(detalhes);

        if (!servicosAdicionais.isEmpty()) {
            sb.append("\nServiços Adicionais:");
            for (ServicoAdicional servico : servicosAdicionais) {
                sb.append("\n - ").append(servico.getNome()).append(" (R$").append(servico.getPreco()).append(")");
            }
        }

        return sb.toString();
    }
}
