package entidades;

public class Discente {
    private int idDiscente;
    private String nome;
    private String enderecoResidencial;
    private int creditosCumpridos;
    private double ira;
    private String email;
    private String senha;

    // Construtor padrão
    public Discente() {
    }

    // Construtor com todos os parâmetros
    public Discente(int idDiscente, String nome, String enderecoResidencial, int creditosCumpridos, 
                    double ira, String email, String senha) {
        this.idDiscente = idDiscente;
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.creditosCumpridos = creditosCumpridos;
        this.ira = ira;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public int getIdDiscente() {
        return idDiscente;
    }

    public void setIdDiscente(int idDiscente) {
        this.idDiscente = idDiscente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public int getCreditosCumpridos() {
        return creditosCumpridos;
    }

    public void setCreditosCumpridos(int creditosCumpridos) {
        this.creditosCumpridos = creditosCumpridos;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Discente{" +
               "idDiscente=" + idDiscente +
               ", nome='" + nome + '\'' +
               ", enderecoResidencial='" + enderecoResidencial + '\'' +
               ", creditosCumpridos=" + creditosCumpridos +
               ", ira=" + ira +
               ", email='" + email + '\'' +
               ", senha='" + senha + '\'' +
               '}';
    }
}
