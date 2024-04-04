package Jeep;

import Lista.Carro;

public abstract class Jeep implements Carro{

	@Override
    public String getMarca() {
        return "Jeep";
    }
}
