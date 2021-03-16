package com.example.shopmedicine;

public class Allergies
{
    private String name;
    private String description;
    private String  price;

    private Allergies(String name, String description, String price)
    {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public static final Allergies[] allergies={
            new Allergies("Zyrtec","ZYRTEC-D® (cetirizine, pseudoephedrine) Tablets (cetirizine hydrochloride 5 mg and pseudoephedrine hydrochloride 120 mg) Extended Release Tablets for oral administration contain 5 mg of cetirizine hydrochloride for immediate release and 120 mg of pseudoephedrine hydrochloride for extended release in a bilayer tablet. Tablets also contain as inactive ingredients: colloidal silicon dioxide, croscarmellose sodium, hypromellose, lactose monohydrate, magnesium stearate, microcrystalline cellulose.","200"),
            new Allergies("Allegra","ALLEGRA(fexofenadine hydrochloride)","300"),
            new Allergies("Xyzal","XYZAL(antihistamines-Levocetirizine (5mg)","350")
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