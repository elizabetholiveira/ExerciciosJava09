public class FuncionariosAdministrativos extends Funcionarios{

    private String funcaoAdministrativa;
    private int senioridade;

    public FuncionariosAdministrativos(String nome, long cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, int senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    //---------

    int porcentagem = 10;
    double aumento = 0.0;
    public double aumentoSalario(double salarioNovo){
        aumento = (getSalario() * porcentagem) / 100;
        salarioNovo = aumento + getSalario();
        return salarioNovo;
    }

    //----------

    @Override
    public double reembolsoDeDespesas(double reembolso) {
        return super.reembolsoDeDespesas(reembolso);
    }

    //----------

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public int getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(int senioridade) {
        this.senioridade = senioridade;
    }
}
