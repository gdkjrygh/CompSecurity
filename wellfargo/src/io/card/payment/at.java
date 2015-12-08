// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class at
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public at()
    {
        a.put(ah.a, "\u05D1\u05D9\u05D8\u05D5\u05DC");
        a.put(ah.b, "\u05D0\u05DE\u05E8\u05D9\u05E7\u05DF \u05D0\u05E7\u05E1\u05E4\u05E8\u05E1");
        a.put(ah.c, "Discover\u200F");
        a.put(ah.d, "JCB\u200F");
        a.put(ah.e, "\u05DE\u05D0\u05E1\u05D8\u05E8\u05E7\u05D0\u05E8\u05D3");
        a.put(ah.f, "\u05D5\u05D9\u05D6\u05D4");
        a.put(ah.g, "\u05D1\u05D5\u05E6\u05E2");
        a.put(ah.h, "\u05E7\u05D5\u05D3 \u05D0\u05D9\u05DE\u05D5\u05EA \u05DB\u05E8\u05D8\u05D9\u05E1");
        a.put(ah.i, "\u05DE\u05D9\u05E7\u05D5\u05D3");
        a.put(ah.j, "\u05EA\u05D0\u05E8\u05D9\u05DA \u05EA\u05E4\u05D5\u05D2\u05D4");
        a.put(ah.k, "MM/YY\u200F");
        a.put(ah.l, "\u05D4\u05D7\u05D6\u05E7 \u05D0\u05EA \u05D4\u05DB\u05E8\u05D8\u05D9\u05E1 \u05DB\u05D0\u05DF.\n\u05D4\u05E1\u05E8\u05D9\u05E7\u05D4 \u05EA\u05EA\u05D1\u05E6\u05E2 \u05D1\u05D0\u05D5\u05E4\u05DF \u05D0\u05D5\u05D8\u05D5\u05DE\u05D8\u05D9.");
        a.put(ah.m, "\u05DE\u05E7\u05DC\u05D3\u05EA\u2026");
        a.put(ah.n, "\u05DE\u05E1\u05E4\u05E8 \u05DB\u05E8\u05D8\u05D9\u05E1");
        a.put(ah.o, "\u05E4\u05E8\u05D8\u05D9 \u05DB\u05E8\u05D8\u05D9\u05E1");
        a.put(ah.p, "\u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05D0\u05D9\u05E0\u05D5 \u05DE\u05E1\u05D5\u05D2\u05DC \u05DC\u05D4\u05E9\u05EA\u05DE\u05E9 \u05D1\u05DE\u05E6\u05DC\u05DE\u05D4 \u05DC\u05E7\u05E8\u05D9\u05D0\u05EA \u05DE\u05E1\u05E4\u05E8\u05D9 \u05DB\u05E8\u05D8\u05D9\u05E1.");
        a.put(ah.q, "\u05DE\u05E6\u05DC\u05DE\u05EA \u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05D0\u05D9\u05E0\u05D4 \u05D6\u05DE\u05D9\u05E0\u05D4.");
        a.put(ah.r, "\u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05E0\u05EA\u05E7\u05DC \u05D1\u05E9\u05D2\u05D9\u05D0\u05D4 \u05D1\u05DC\u05EA\u05D9 \u05E6\u05E4\u05D5\u05D9\u05D4 \u05D1\u05D6\u05DE\u05DF \u05D4\u05E4\u05E2\u05DC\u05EA \u05D4\u05DE\u05E6\u05DC\u05DE\u05D4.");
    }

    public final String a()
    {
        return "he";
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
