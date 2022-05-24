package ONE.DIO.SINGLETON;

/**
 * Singleton "preguiçoso".
 *
 * @author LEO
 */

public class SINGLETONLAZY {

    private static SINGLETONLAZY instancia;

    private SINGLETONLAZY() {
        super();
    }

    public static SINGLETONLAZY getInstance() {
        if (instancia == null) {
            instancia  = new SINGLETONLAZY();
        }

        return instancia;
    }
}