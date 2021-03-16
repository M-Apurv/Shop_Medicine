package com.example.shopmedicine;

public class Headache
{
    private String name;
    private String description;
    private String  price;

    private Headache(String name, String description, String price)
    {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public static final Headache[] headaches={
            new Headache("Panadol,","PANADOL-Acetaminophen,","75"),
            new Headache("Nalfon","NALFON-Fenoprofen","105"),
            new Headache("Actron","ACTRON-Ketoprofen","85"),
            new Headache("Sumo","SUMO-paracetamol,nimesulide","150")
    };

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String getPrice()
    {
        return price;
    }

    public String toString()
    {
        return this.name;
    }
}
