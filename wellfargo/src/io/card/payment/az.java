// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class az
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public az()
    {
        a.put(ah.a, "Batal");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Selesai");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Poskod");
        a.put(ah.j, "Luput");
        a.put(ah.k, "BB/TT");
        a.put(ah.l, "Pegang kad di sini.\nIa akan mengimbas secara automatik.");
        a.put(ah.m, "Papan Kekunci\u2026");
        a.put(ah.n, "Nombor Kad");
        a.put(ah.o, "Butiran Kad");
        a.put(ah.p, "Peranti ini tidak dapat menggunakan kamera untuk membaca nombor kad.");
        a.put(ah.q, "Kamera peranti tidak tersedia.");
        a.put(ah.r, "Peranti mengalami ralat tidak dijangka semasa membuka kamera.");
    }

    public final String a()
    {
        return "ms";
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
