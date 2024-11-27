package entidades;

public class PedidoIntencaoEstagio {
    private int idPedido;
    private Discente discente;
    private boolean primeiroEstagio;
    private String nomeEmpresa;
    private String enderecoEmpresa;
    private String modalidadeEstagio;
    private int cargaHorariaSemanal;
    private double valorBolsa;
    private String resumoAtividades;
    private String conteudosTeoricos;
    private String motivoIntencao;

    // Construtor padrão
    public PedidoIntencaoEstagio() {
    }

    // Construtor com todos os parâmetros
    public PedidoIntencaoEstagio(int idPedido, Discente discente, boolean primeiroEstagio, String nomeEmpresa,
                          String enderecoEmpresa, String modalidadeEstagio, int cargaHorariaSemanal,
                          double valorBolsa, String resumoAtividades, String conteudosTeoricos,
                          String motivoIntencao) {
        this.idPedido = idPedido;
        this.discente = discente;
        this.primeiroEstagio = primeiroEstagio;
        this.nomeEmpresa = nomeEmpresa;
        this.enderecoEmpresa = enderecoEmpresa;
        this.modalidadeEstagio = modalidadeEstagio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.valorBolsa = valorBolsa;
        this.resumoAtividades = resumoAtividades;
        this.conteudosTeoricos = conteudosTeoricos;
        this.motivoIntencao = motivoIntencao;
    }

    // Getters e Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Discente getDiscente() {
        return discente;
    }

    public void setDiscente(Discente discente) {
        this.discente = discente;
    }

    public boolean isPrimeiroEstagio() {
        return primeiroEstagio;
    }

    public void setPrimeiroEstagio(boolean primeiroEstagio) {
        this.primeiroEstagio = primeiroEstagio;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getModalidadeEstagio() {
        return modalidadeEstagio;
    }

    public void setModalidadeEstagio(String modalidadeEstagio) {
        this.modalidadeEstagio = modalidadeEstagio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public String getResumoAtividades() {
        return resumoAtividades;
    }

    public void setResumoAtividades(String resumoAtividades) {
        this.resumoAtividades = resumoAtividades;
    }

    public String getConteudosTeoricos() {
        return conteudosTeoricos;
    }

    public void setConteudosTeoricos(String conteudosTeoricos) {
        this.conteudosTeoricos = conteudosTeoricos;
    }

    public String getMotivoIntencao() {
        return motivoIntencao;
    }

    public void setMotivoIntencao(String motivoIntencao) {
        this.motivoIntencao = motivoIntencao;
    }

    @Override
    public String toString() {
        return "PedidoIntencao{" +
               "idPedido=" + idPedido +
               ", discente=" + discente +
               ", primeiroEstagio=" + primeiroEstagio +
               ", nomeEmpresa='" + nomeEmpresa + '\'' +
               ", enderecoEmpresa='" + enderecoEmpresa + '\'' +
               ", modalidadeEstagio='" + modalidadeEstagio + '\'' +
               ", cargaHorariaSemanal=" + cargaHorariaSemanal +
               ", valorBolsa=" + valorBolsa +
               ", resumoAtividades='" + resumoAtividades + '\'' +
               ", conteudosTeoricos='" + conteudosTeoricos + '\'' +
               ", motivoIntencao='" + motivoIntencao + '\'' +
               '}';
    }
}
