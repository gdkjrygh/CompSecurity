// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class b
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public b()
    {
        a.put(ah.a, "\u0130ptal");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Bitti");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Posta Kodu");
        a.put(ah.j, "Son kullanma tarihi");
        a.put(ah.k, "AA/YY");
        a.put(ah.l, "Kart\u0131n\u0131z\u0131 buraya tutun.\nOtomatik olarak taranacakt\u0131r.");
        a.put(ah.m, "Klavye\u2026");
        a.put(ah.n, "Kart Numaras\u0131");
        a.put(ah.o, "Kart Ayr\u0131nt\u0131lar\u0131");
        a.put(ah.p, "Bu cihaz\u0131n kameras\u0131 kart rakamlar\u0131n\u0131 okuyamaz.");
        a.put(ah.q, "Cihaz kameras\u0131 kullan\u0131lam\u0131yor.");
        a.put(ah.r, "Cihaz kameray\u0131 a\347arken beklenmedik bir hata verdi.");
    }

    public final String a()
    {
        return "tr";
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
