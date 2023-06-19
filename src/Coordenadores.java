import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coordenadores extends Funcionarios{

    private String professoresSupervisionados;

    public Coordenadores(String nome, long cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    //---------

    int porcentagem = 5;
    double aumento = 0.0;
    public double aumentoSalario(double salarioNovo){
        aumento = (getSalario() * porcentagem) / 100;
        salarioNovo = aumento + getSalario();
        return salarioNovo;
    }

    //---------

    @Override
    public double reembolsoDeDespesas(double reembolso) {
        return super.reembolsoDeDespesas(reembolso);
    }

    //----------

    Scanner resposta = new Scanner(System.in);

    public List adicionaProfessor(int professores){
        System.out.println("Digite 's' para adicionar um professor");
        String selecao = resposta.next();
        List<String> professoresSupervisionados = new ArrayList<>();
        if (selecao.equalsIgnoreCase("s") && (professores <= 5)) {
            professores = professores + 1;
            System.out.println("Qual o nome do professor?");
            String nomeProfessor = resposta.nextLine();
            resposta.nextLine();
            professoresSupervisionados.add(nomeProfessor);
        }
        return professoresSupervisionados;
    }

    //---------

    public String getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(String professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
