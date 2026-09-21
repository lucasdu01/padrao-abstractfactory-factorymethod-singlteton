public class Fabrica {

    private Fabrica() {};

    private static Fabrica instance = new Fabrica();
    private String tipoFabrica;

    public static Fabrica getInstance() {
        return instance;
    }

    public String getTipoFabrica() {
        return tipoFabrica;
    }

    public void setTipoFabrica(String tipoFabrica) {
        this.tipoFabrica = tipoFabrica;
    }

    public static Fabrica obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof Fabrica)) {
            throw new IllegalArgumentException("Fabrica inválida");
        }
        return (Fabrica) objeto;
    }
}
