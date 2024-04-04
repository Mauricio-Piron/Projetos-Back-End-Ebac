package Fiat;

import Lista.Carro;

public abstract class Fiat implements Carro {
	
	@Override
    public String getMarca() {
        return "Fiat";
    }
}
