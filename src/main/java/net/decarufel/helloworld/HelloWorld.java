package net.decarufel.helloworld;

import static java.lang.System.out;

public class HelloWorld {
    public static void main(String[] args){
        Greeting greeting = new Greeting();
        out.println(greeting.Hello("World"));
    }
}
