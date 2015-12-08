// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class bb
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public bb()
    {
        a.put(ah.a, "Annuleren");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Gereed");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Postcode");
        a.put(ah.j, "Vervaldatum");
        a.put(ah.k, "MM/JJ");
        a.put(ah.l, "Houd uw kaart hier.\nScannen gaat automatisch.");
        a.put(ah.m, "Toetsenbord\u2026");
        a.put(ah.n, "Creditcardnummer");
        a.put(ah.o, "Kaartgegevens");
        a.put(ah.p, "Met de camera van dit apparaat kunnen geen kaartnummers worden gelezen.");
        a.put(ah.q, "Camera apparaat niet beschikbaar.");
        a.put(ah.r, "Er is een onverwachte fout opgetreden bij het starten van de camera.");
    }

    public final String a()
    {
        return "nl";
    }

    public final String a(Enum enum, String s)
    {
        enum = (ah)enum;
        s = (new StringBuilder()).append(enum.toString()).append("|").append(s).toString();
        if (b.containsKey(s))
        {
            return (String)b.get(s);
        } else
        {
            return (String)a.get(enum);
        }
    }

    static 
    {
        new HashMap();
    }
}
