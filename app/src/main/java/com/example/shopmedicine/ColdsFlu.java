package com.example.shopmedicine;

public class ColdsFlu
{

    private String name;
    private String description;
    private String  price;

    private ColdsFlu(String name, String description, String price)
    {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public static final ColdsFlu[] coldsFlus={
            new ColdsFlu("Symmettrel","SYMMETREL (Amantadine Hydrochloride, USP) is designated generically as amantadine hydrochloride and chemically as 1-adamantanamine hydrochloride.","100"),
            new ColdsFlu("Flumadine","Flumadine® (rimantadine hydrochloride) is a synthetic antiviral drug available as a 100 mg film-coated tablet. Each film-coated tablet contains 100 mg of rimantadine hydrochloride plus hypromellose, magnesium stearate, microcrystalline cellulose, sodium starch glycolate, FD&C Yellow No. 6 Lake and FD&C Yellow No. 6. The film coat contains hypromellose and polyethylene glycol.","105"),
            new ColdsFlu("Relenza","The active component of RELENZA is zanamivir. The chemical name of zanamivir is 5-(acetylamino)- 4-[(aminoiminomethyl)-amino]-2,6-anhydro-3,4,5-trideoxy-D-glycero-D-galacto-non-2-enonic acid. It has a molecular formula of C12H20N4O7 and a molecular weight of 332.3.","50"),
            new ColdsFlu("Tamiflu","Oseltamivir, sold under the brand name Tamiflu, is an antiviral medication used to treat and prevent influenza A and influenza B.","150")
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
