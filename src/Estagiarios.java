public class Estagiarios extends Funcionarios {

    public Estagiarios(double bolsa, String nome, long cpf, int numeroDeRegistro, String orgaoDeLotacao) {
        super(bolsa, nome, cpf, numeroDeRegistro, orgaoDeLotacao);
    }

    //----------

    @Override
    public double reembolsoDeDespesas(double reembolso) {
        return super.reembolsoDeDespesas(reembolso);
    }

    //----------

}
