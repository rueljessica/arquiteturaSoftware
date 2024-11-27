package camada_dominio;

/**
 * Classe responsável pela verificação das regras de negócio relacionadas ao estágio.
 */

public class EstagioMTE {

    // RN1: O(a) discente tem que ter cumprido 80 (oitenta) créditos dentre as disciplinas obrigatórias.
    public static boolean verificarRN1(int creditosCumpridos) {
        return creditosCumpridos >= 80;
    }

    // RN2: O(a) discente tem que ter o Índice de Rendimento Acadêmico (IRA) maior ou igual a 6,0 ou IRA dos dois últimos períodos maiores ou iguais a 7,0.
    public static boolean verificarRN2(double ira) {
        return ira >= 6.0;
    }

    // RN3: O Estágio Supervisionado deverá ter carga horária máxima de 30 horas por semana.
    public static boolean verificarRN3(int cargaHorariaSemanal) {
        return cargaHorariaSemanal <= 30;
    }
}