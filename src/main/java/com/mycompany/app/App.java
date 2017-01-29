package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args==null||args.length==0){
    		throw new GreeterException("Invalid name.");
    	}
    	System.out.print(Greeter.greetTo("world"));
    }
}
