// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class au
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public au()
    {
        a.put(ah.a, "H\346tta vi\360");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Loki\360");
        a.put(ah.h, "CVV");
        a.put(ah.i, "P\363stn\372mer");
        a.put(ah.j, "Rennur \372t");
        a.put(ah.k, "MM/\301\301");
        a.put(ah.l, "Haltu kortinu kyrru h\351r.\n\336a\360 ver\360ur sj\341lvirkt skanna\360.");
        a.put(ah.m, "Lyklabor\360\u2026");
        a.put(ah.n, "Kortan\372mar");
        a.put(ah.o, "Kortauppl\375singar");
        a.put(ah.p, "\336etta t\346ki getur ekki nota\360 myndav\351lina til a\360 lesa af n\372mer af kortinu.");
        a.put(ah.q, "Ekki n\346st samband vi\360 myndav\351lina.");
        a.put(ah.r, "Upp kom villa vi\360 a\360 opna myndav\351lina..");
    }

    public final String a()
    {
        return "is";
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
