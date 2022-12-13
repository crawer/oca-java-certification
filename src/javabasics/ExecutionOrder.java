package javabasics;

public class ExecutionOrder {

    //fields and blocks running first
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public ExecutionOrder(){
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        ExecutionOrder order = new ExecutionOrder();
        System.out.println(order.name);
    }

}