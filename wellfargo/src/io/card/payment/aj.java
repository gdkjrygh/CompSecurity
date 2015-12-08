// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class aj
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public aj()
    {
        a.put(ah.a, "\u0625\u0644\u063A\u0627\u0621");
        a.put(ah.b, "American Express\u200F");
        a.put(ah.c, "Discover\u200F");
        a.put(ah.d, "JCB\u200F");
        a.put(ah.e, "MasterCard\u200F");
        a.put(ah.f, "Visa\u200F");
        a.put(ah.g, "\u062A\u0645");
        a.put(ah.h, "CVV\u200F");
        a.put(ah.i, "\u0627\u0644\u0631\u0645\u0632 \u0627\u0644\u0628\u0631\u064A\u062F\u064A");
        a.put(ah.j, "\u062A\u0627\u0631\u064A\u062E \u0627\u0646\u062A\u0647\u0627\u0621 \u0627\u0644\u0635\u0644\u0627\u062D\u064A\u0629");
        a.put(ah.k, "MM/YY\u200F");
        a.put(ah.l, "\u0627\u0645\u0633\u0643 \u0627\u0644\u0628\u0637\u0627\u0642\u0629 \u0647\u0646\u0627.\n \u0633\u062A\u0645\u0633\u062D \u062A\u0644\u0642\u0627\u0626\u064A\u0627.");
        a.put(ah.m, "\u0644\u0648\u062D\u0629 \u0627\u0644\u0645\u0641\u0627\u062A\u064A\u062D\u2026");
        a.put(ah.n, "\u0631\u0642\u0645 \u0627\u0644\u0628\u0637\u0627\u0642\u0629");
        a.put(ah.o, "\u062A\u0641\u0627\u0635\u064A\u0644 \u0627\u0644\u0628\u0637\u0627\u0642\u0629");
        a.put(ah.p, "\u0647\u0630\u0627 \u0627\u0644\u062C\u0647\u0627\u0632 \u0644\u0627 \u064A\u0645\u0643\u0646\u0647 \u0627\u0633\u062A\u0639\u0645\u0627\u0644 \u0627\u0644\u0643\u0627\u0645\u064A\u0631\u0627 \u0644\u0642\u0631\u0627\u0621\u0629 \u0623\u0631\u0642\u0627\u0645 \u0627\u0644\u0628\u0637\u0627\u0642\u0629.");
        a.put(ah.q, "\u0643\u0627\u0645\u064A\u0631\u0627 \u0627\u0644\u062C\u0647\u0627\u0632 \u063A\u064A\u0631 \u0645\u062A\u0627\u062D\u0629.");
        a.put(ah.r, "\u0627\u0644\u062C\u0647\u0627\u0632 \u062D\u062F\u062B \u0628\u0647 \u062E\u0637\u0627 \u063A\u064A\u0631 \u0645\u062A\u0648\u0642\u0639 \u0639\u0646\u062F \u0641\u062A\u062D \u0627\u0644\u0643\u0627\u0645\u064A\u0631\u0627.");
    }

    public final String a()
    {
        return "ar";
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
