import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professores extends Funcionarios{

    private int nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantDeAlunos;
    private int quantDeTurmas;

    Turma turma;

    //---------

    public Professores(String nome, long cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, int nivelDeGraduacao, String disciplinaMinistrada, int quantDeAlunos, int quantDeTurmas, Turma turma) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantDeAlunos = quantDeAlunos;
        this.quantDeTurmas = quantDeTurmas;
        this.turma = turma;
    }

    //---------

    int porcentagem = 10;
    double aumento = 0.0;
    public double aumentoSalario(double salarioNovo){
        aumento = (getSalario() * porcentagem) / 100;
        salarioNovo = aumento + getSalario();
        return salarioNovo;
    }

    //---------

    Scanner resposta = new Scanner(System.in);

    public List adicionaTurma(int turma){
       System.out.println("Digite 's' para adicionar uma turma");
       String selecao = resposta.next();
        List<Integer> turmas = new ArrayList<>();
       if (selecao.equalsIgnoreCase("s")) {
           turma = turma + 1;
           turmas.add(turma);
           quantDeTurmas = turma;
       }
           return turmas;
    }

    //----------

    public List adicionaEstagiario(int estagiarios){
        System.out.println("Digite 's' para adicionar um estagiario");
        String selecao = resposta.next();
        List<String> estagiariosSupervisionados = new ArrayList<>();
        if (selecao.equalsIgnoreCase("s") && (estagiarios <= 2)) {
            estagiarios = estagiarios + 1;
            System.out.println("Qual o nome do estagiário?");
            String nomeEstagiario = resposta.nextLine();
            resposta.nextLine();
            estagiariosSupervisionados.add(nomeEstagiario);
        }
        return estagiariosSupervisionados;
    }

    //---------

    @Override
    public double reembolsoDeDespesas(double reembolso) {
        return super.reembolsoDeDespesas(reembolso);
    }

    //----------

    public int getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(int nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantDeAlunos() {
        return quantDeAlunos;
    }

    public void setQuantDeAlunos(int quantDeAlunos) {
        this.quantDeAlunos = quantDeAlunos;
    }

    public int getQuantDeTurmas() {
        return quantDeTurmas;
    }

    public void setQuantDeTurmas(int quantDeTurmas) {
        this.quantDeTurmas = quantDeTurmas;
    }
}
