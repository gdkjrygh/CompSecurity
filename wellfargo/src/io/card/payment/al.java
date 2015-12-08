// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class al
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public al()
    {
        a.put(ah.a, "Abbrechen");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Fertig");
        a.put(ah.h, "Kartenpr\374fnr.");
        a.put(ah.i, "PLZ");
        a.put(ah.j, "G\374ltig bis");
        a.put(ah.k, "MM/JJ");
        a.put(ah.l, "Kreditkarte hierhin halten.\nSie wird automatisch gelesen.");
        a.put(ah.m, "Tastatur\u2026");
        a.put(ah.n, "Kartennummer");
        a.put(ah.o, "Kreditkartendetails");
        a.put(ah.p, "Dieses Ger\344t kann mit der Kamera keine Kreditkartennummern lesen.");
        a.put(ah.q, "Die Kamera ist nicht verf\374gbar.");
        a.put(ah.r, "Beim \326ffnen der Kamera ist ein unerwarteter Fehler aufgetreten.");
    }

    public final String a()
    {
        return "de";
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
