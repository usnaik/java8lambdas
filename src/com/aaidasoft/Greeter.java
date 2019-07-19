package com.aaidasoft;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();

		Greeting lambdaGreeting = () -> System.out.println("Lambda - Hello World!");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("InnerClass- Hello World!");
			}
		};

		// greeter.greet(helloWorldGreeting);
		// greeter.greet(lambdaGreeting);

		helloWorldGreeting.perform();
		innerClassGreeting.perform();
		lambdaGreeting.perform();
	}

}
