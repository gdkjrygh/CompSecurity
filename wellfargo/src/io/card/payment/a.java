// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class a
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public a()
    {
        a.put(ah.a, "\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "\u0E40\u0E2A\u0E23\u0E47\u0E08\u0E41\u0E25\u0E49\u0E27");
        a.put(ah.h, "CVV");
        a.put(ah.i, "\u0E23\u0E2B\u0E31\u0E2A\u0E44\u0E1B\u0E23\u0E29\u0E13\u0E35\u0E22\u0E4C");
        a.put(ah.j, "\u0E2B\u0E21\u0E14\u0E2D\u0E32\u0E22\u0E38");
        a.put(ah.k, "\u0E14\u0E14/\u0E1B\u0E1B");
        a.put(ah.l, "\u0E16\u0E37\u0E2D\u0E1A\u0E31\u0E15\u0E23\u0E44\u0E27\u0E49\u0E15\u0E23\u0E07\u0E19\u0E35\u0E49\n\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E08\u0E30\u0E2A\u0E41\u0E01\u0E19\u0E42\u0E14\u0E22\u0E2D\u0E31\u0E15\u0E42\u0E19\u0E21\u0E31\u0E15\u0E34");
        a.put(ah.m, "\u0E04\u0E35\u0E22\u0E4C\u0E1A\u0E2D\u0E23\u0E4C\u0E14\u2026");
        a.put(ah.n, "\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E1A\u0E31\u0E15\u0E23");
        a.put(ah.o, "\u0E23\u0E32\u0E22\u0E25\u0E30\u0E40\u0E2D\u0E35\u0E22\u0E14\u0E1A\u0E31\u0E15\u0E23");
        a.put(ah.p, "\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E44\u0E21\u0E48\u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E43\u0E0A\u0E49\u0E01\u0E25\u0E49\u0E2D\u0E07\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E2D\u0E48\u0E32\u0E19\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E1A\u0E31\u0E15\u0E23\u0E44\u0E14\u0E49");
        a.put(ah.q, "\u0E01\u0E25\u0E49\u0E2D\u0E07\u0E02\u0E2D\u0E07\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E44\u0E21\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19");
        a.put(ah.r, "\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E1E\u0E1A\u0E02\u0E49\u0E2D\u0E1C\u0E34\u0E14\u0E1E\u0E25\u0E32\u0E14\u0E02\u0E13\u0E30\u0E40\u0E1B\u0E34\u0E14\u0E01\u0E25\u0E49\u0E2D\u0E07");
    }

    public final String a()
    {
        return "th";
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
