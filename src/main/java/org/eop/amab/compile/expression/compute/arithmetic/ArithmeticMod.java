package org.eop.amab.compile.expression.compute.arithmetic;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eop.amab.compile.expression.compute.ArithmeticExpression;

/**
 * @author lixinjie
 * @since 2017-05-21
 */
public class ArithmeticMod<TLeft, TRight, TResult> extends ArithmeticExpression<TLeft, TRight, TResult> {

	protected Byte arithmeticMod(byte left, byte right) {
		return ((Integer)(left % right)).byteValue();
	}
	
	protected Short arithmeticMod(short left, short right) {
		return ((Integer)(left % right)).shortValue();
	}
	
	protected Integer arithmeticMod(int left, int right) {
		return left % right;
	}
	
	protected Long arithmeticMod(long left, long right) {
		return left % right;
	}
	
	protected Float arithmeticMod(float left, float right) {
		return left % right;
	}
	
	protected Double arithmeticMod(double left, double right) {
		return left % right;
	}
	
	protected BigInteger arithmeticMod(BigInteger left, BigInteger right) {
		return left.mod(right);
	}
	
	protected BigDecimal arithmeticMod(BigDecimal left, BigDecimal right) {
		return null;
	}
}
