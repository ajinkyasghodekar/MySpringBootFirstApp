package in.practice.ajinkya.product;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("pob")
@ConfigurationProperties(prefix="my.app")
public class Product {
	private int a;
	private String s;
	private int b;
	private String s1;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "Product [a=" + a + ", s=" + s + ", b=" + b + ", s1=" + s1 + "]";
	}
	
}
