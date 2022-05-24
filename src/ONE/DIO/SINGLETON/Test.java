package ONE.DIO.SINGLETON;

import Strategy.*;
import facade.Facade;

public class Test {

    public static void main(String[] args) {
        SINGLETONLAZY lazy = SINGLETONLAZY.getInstance();
        System.out.println(lazy);
        lazy = SINGLETONLAZY.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();
        robo.mover();

        // facade

        Facade facade = new Facade();
        facade.migrarCliente("Leo" , "5782370");

    }
}
