// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class ba
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public ba()
    {
        a.put(ah.a, "Avbryt");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Fullf\370rt");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Postnummer");
        a.put(ah.j, "Utl\370per");
        a.put(ah.k, "MM/\305\305");
        a.put(ah.l, "Hold kortet her.\nDet skannes automatisk.");
        a.put(ah.m, "Tastatur \u2026");
        a.put(ah.n, "Kortnummer");
        a.put(ah.o, "Kortdetaljer");
        a.put(ah.p, "Denne enheten kan ikke bruke kameraet til \345 lese kortnumre.");
        a.put(ah.q, "Kameraet er utilgjengelig.");
        a.put(ah.r, "Det oppstod en uventet feil ved kameraoppstart.");
    }

    public final String a()
    {
        return "nb";
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
