package Gof;

import Gof.facade.facade;
import Gof.singleton.SingletonEager;
import Gof.singleton.SingletonLazy;
import Gof.singleton.SingletonLazyHolder;
import Gof.strategy.Comportamento;
import Gof.strategy.ComportamentoAgressivo;
import Gof.strategy.ComportamentoDefensivo;
import Gof.strategy.ComportamentoNormal;
import Gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
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
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		facade facade = new facade();
		facade.migrarCliente("Tiago", "20930460");
	}

}
