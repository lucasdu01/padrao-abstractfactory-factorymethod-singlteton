public class FabricaPJ implements FabricaAbstrata {

    public Contrato createContrato() {
        return new ContratoPJ();
    }

    public Procuracao createProcuracao() {
        return new ProcuracaoPJ();
    }
}
