package com.jrj.quant.broker;

public class IntegerTraits implements IInstrumentTraits {

	@Override
	public double roundQuantity(double quantity) {

		return (int) (quantity);
	}

}