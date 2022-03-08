package dsa_Java;
//Instead of using multiple classes for different datatypes we can use a single class that can return different data types just add <> after the name of the class
public class Generics<T> {
T ob;

Generics(T ob){
	
	
	this.ob= ob;
}


public void getType() {
	
	
	System.out.println(ob.getClass().getName());
}
}
