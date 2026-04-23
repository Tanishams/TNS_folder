package com.tnsif.lambdaexpression;

	// demo for lambda expression

	@FunctionalInterface
	interface Draw{
	        public void draw();
	}

	public class Withlambdaexample {
	public static void main(String[] args) {
	        int width=70;
	        Draw d=()->{System.out.println("drawing"+width);};
	        d.draw();
	}
	}

