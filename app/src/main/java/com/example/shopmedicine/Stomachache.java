package com.example.shopmedicine;

public class Stomachache
{
    private String name;
    private String description;
    private String  price;

    private Stomachache(String name, String description, String price)
    {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public static final Stomachache[] stomachaches={
            new Stomachache("Imodium","IMODIUM-Loperamide, sold under the brand name Imodium, among others, is a medication used to decrease the frequency of diarrhea. It is often used for this purpose in inflammatory bowel disease and short bowel syndrome. It is not recommended for those with blood in the stool, mucus in the stool, or fevers.","85"),
            new Stomachache("Kaopectate","KAOPECTATE-Bismuth subsalicylate, sold as generic and under the brand name Pepto-Bismol, is an antacid elixir medication used to treat temporary discomforts of the stomach and gastrointestinal tract, such as nausea, heartburn, indigestion, upset stomach, and diarrhea.","95"),
            new Stomachache("liquiprin","LIQUIPRIN-Paracetamol, also known as acetaminophen, is a medication used to treat pain and fever. It is typically used for mild to moderate pain relief. Evidence is mixed for its use to relieve fever in children. It is often sold in combination with other medications, such as in many cold medications.","95"),
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
