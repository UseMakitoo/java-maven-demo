package com.example.helloworld;


import com.makitoo.Makitoo;

public class HelloWorld {

    public static void main(String[] args) throws Exception{
        com.makitoo.MakitooJava.init(
                "https://dashboard.makitoo.com/rest",
                "APPLICATION_ID",   // Application ID
                "TOKEN",            // Application TOKEN
                "0.0.1");

        // Give some time to get hotpatchs
        Thread.sleep(1000);

        runMethod("npe");
        runMethod("unhandled");

        // Give some time to send reports
        Thread.sleep(10000);
    }

    private static void runMethod(String name) {
        System.out.println("/**********************************/");
        System.out.format("/* run method %s\n", name);
        System.out.println("/**********************************/");
        try {
            HelloWorld.class.getMethod(name).invoke(null);
            System.out.println("success !");
        } catch (Throwable e) {
            System.out.println("fail !");
        }
    }

    public static void npe() {
        String version = System.getProperty("version");
        System.out.println(version.toLowerCase());
    }

    public static void unhandled() {
        System.out.format("5 / 0 = %d\n", divide(5, 0));
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }


}
