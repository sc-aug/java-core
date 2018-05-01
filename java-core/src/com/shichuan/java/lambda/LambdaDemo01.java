package com.shichuan.java.lambda;

import java.util.concurrent.*;

public class LambdaDemo01 {

	public static void main(String[] args) throws Exception {
		Callable<Double> c1 = new Callable<Double>(){
            public Double call(){
                return Math.random();
            }
        };

        System.out.println(c1.call()); // not creating thread, just for test
        
        // Do the same thing with lambda expression
        Callable<Double> c2 = (() -> Math.random());
        
        System.out.println(c2.call()); // not creating thread, just for test
	}

}
