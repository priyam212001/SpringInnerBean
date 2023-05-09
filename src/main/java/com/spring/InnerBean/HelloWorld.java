package com.spring.InnerBean;

public class HelloWorld {
private Foo foo;
public void setFoo(Foo foo) {
	this.foo=foo;
}
public String toString() {
	return "HelloWorld! "+foo;
}
}
