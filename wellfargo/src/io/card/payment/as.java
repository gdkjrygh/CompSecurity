// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class as
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public as()
    {
        a.put(ah.a, "Annuler");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "OK");
        a.put(ah.h, "Crypto.");
        a.put(ah.i, "Code postal");
        a.put(ah.j, "Date d\u2019expiration");
        a.put(ah.k, "MM/AA");
        a.put(ah.l, "Maintenez la carte \340 cet endroit.\nElle va \352tre automatiquement scann\351e.");
        a.put(ah.m, "Clavier\u2026");
        a.put(ah.n, "N\272 de carte");
        a.put(ah.o, "Carte");
        a.put(ah.p, "Cet appareil ne peut pas utiliser l\u2019appareil photo pour lire les num\351ros de carte.");
        a.put(ah.q, "L\u2019appareil photo n\u2019est pas disponible.");
        a.put(ah.r, "Une erreur s\u2019est produite en ouvrant l\u2019appareil photo.");
    }

    public final String a()
    {
        return "fr";
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
