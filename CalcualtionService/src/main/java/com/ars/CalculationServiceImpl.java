package com.ars;

public class CalculationServiceImpl implements CalculationService {

	@Override
	public int sum(Operand op) {
		return op.getNum1() + op.getNum2();
	}

	@Override
	public int multiplication(Operand op) {
		return op.getNum1() * op.getNum2();
	}

}