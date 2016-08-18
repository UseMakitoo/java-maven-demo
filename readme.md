# Makitoo java with maven example

## Introduction
Makitoo is a technology for monitoring applications in production. It allows you to :
- Remotely monitor your application. Each exception at runtime is automatically monitored in the Makitoo dashboard.
- Diagnostic all your bugs with automatically collected information.
- Fix some bugs at runtime with hot patching, without recompiling and re-deploing your application.

This repository is a Java based application built with maven.

## Usage

First, you should create a Makitoo account : <https://dashboard.makitoo.com/>

When you are successfully logged in, you can create an application, it gives you get an ID and TOKEN of your application.

Then, edit file `src/main/java/com/example/helloworld/HelloWorld.java ` to insert your application id and token in main() method as follows.

    com.makitoo.MakitooJava.init(
                "https://dashboard.makitoo.com/rest",
                "APPLICATION_ID",   // Application ID
                "TOKEN",            // Application TOKEN
                "0.0.1");

## Execution

Start your application on localhost with
`$ mvn compile exec:java

The application is now started and collect execution bugs in your dashboard at <https://dashboard.makitoo.com/>.

## Hotfixe

In the Makitoo dashboard, you can create hotpatch for the both failing methods.

When you create an hotpatch, re-launch the application, the bug should be fixed !
It could take few seconds to dispatch hotpatch to running service.
