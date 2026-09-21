public class FabricaPF implements FabricaAbstrata {

    public Contrato createContrato() {
        return new ContratoPF();
    }

    public Procuracao createProcuracao() {
        return new ProcuracaoPF();
    }
}
