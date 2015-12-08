// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class ak
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public ak()
    {
        a.put(ah.a, "Annuller");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Udf\370rt");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Postnummer");
        a.put(ah.j, "Udl\370ber");
        a.put(ah.k, "MM/\305\305");
        a.put(ah.l, "Hold kortet her.\nDet scannes automatisk.");
        a.put(ah.m, "Tastatur\u2026");
        a.put(ah.n, "Kortnummer");
        a.put(ah.o, "Kortoplysninger");
        a.put(ah.p, "Denne enhed kan ikke anvende kameraet til at l\346se kortnumre.");
        a.put(ah.q, "Enhed kamera ikke er tilg\346ngelig.");
        a.put(ah.r, "Enheden havde en uventet fejl under \345bning af kamera.");
    }

    public final String a()
    {
        return "da";
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
