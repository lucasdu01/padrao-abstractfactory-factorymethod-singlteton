import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF emitido", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ emitido", cliente.emitirProcuracao());
    }

    @Test
    void deveRetornarTipoFabrica() {
        Fabrica.getInstance().setTipoFabrica("PF");
        assertEquals("PF", Fabrica.getInstance().getTipoFabrica());
    }
}
