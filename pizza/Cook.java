package by.itacademy.lesson12.pizza;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cook {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new Cheese(new Ham (new Tomato ())));
        System.out.println(pizza.getDescription());
    }


}
