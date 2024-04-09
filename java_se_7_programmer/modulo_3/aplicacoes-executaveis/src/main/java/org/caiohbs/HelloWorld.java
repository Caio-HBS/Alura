package org.caiohbs;

public class HelloWorld {

    // Para que uma classe Java seja executável, ela necessariamente precisa ter
    // um método "main":
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " => " + args[i]);
        }
    }

}