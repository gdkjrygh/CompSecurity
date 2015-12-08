// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class av
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public av()
    {
        a.put(ah.a, "Annulla");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Fine");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Codice postale");
        a.put(ah.j, "Scadenza");
        a.put(ah.k, "MM/AA");
        a.put(ah.l, "Inquadra la carta.\nLa scansione \350 automatica.");
        a.put(ah.m, "Tastiera\u2026");
        a.put(ah.n, "Numero di carta");
        a.put(ah.o, "Dati carta");
        a.put(ah.p, "La fotocamera non legge il numero di carta.");
        a.put(ah.q, "Fotocamera non disponibile.");
        a.put(ah.r, "Errore inatteso nell\u2019apertura della fotocamera.");
    }

    public final String a()
    {
        return "it";
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
