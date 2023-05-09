package com.spring.InnerBean;

public class Foo {
  private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String toString() {
	return "I am "+name+" of inner bean foo.";
}
}
