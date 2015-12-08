// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class bg
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public bg()
    {
        a.put(ah.a, "Avbryt");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Klart");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Postnummer");
        a.put(ah.j, "G\345r ut");
        a.put(ah.k, "MM/\305\305");
        a.put(ah.l, "H\345ll kortet h\344r.\nDet skannas automatiskt.");
        a.put(ah.m, "Tangentbord \u2026");
        a.put(ah.n, "Kortnummer");
        a.put(ah.o, "Kortinformation");
        a.put(ah.p, "Den h\344r enheten kan inte anv\344nda kameran till att l\344sa kortnummer.");
        a.put(ah.q, "Enhetens kamera \344r inte tillg\344nglig.");
        a.put(ah.r, "Ett ov\344ntat fel uppstod n\344r enheten skulle \366ppna kameran.");
    }

    public final String a()
    {
        return "sv";
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
