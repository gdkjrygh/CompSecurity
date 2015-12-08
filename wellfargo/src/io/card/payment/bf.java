// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class bf
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public bf()
    {
        a.put(ah.a, "\u041E\u0442\u043C\u0435\u043D\u0430");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "\u0413\u043E\u0442\u043E\u0432\u043E");
        a.put(ah.h, "\u041A\u043E\u0434 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
        a.put(ah.i, "\u0418\u043D\u0434\u0435\u043A\u0441");
        a.put(ah.j, "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043B\u044C\u043D\u0430 \u0434\u043E");
        a.put(ah.k, "\u041C\u041C/\u0413\u0413");
        a.put(ah.l, "\u0414\u0435\u0440\u0436\u0438\u0442\u0435 \u043A\u0430\u0440\u0442\u0443 \u0432\u043D\u0443\u0442\u0440\u0438 \u0440\u0430\u043C\u043A\u0438.\n\u041E\u043D\u0430 \u0431\u0443\u0434\u0435\u0442 \u0441\u0447\u0438\u0442\u0430\u043D\u0430\n\u0430\u0432\u0442\u043E\u043C\u0430\u0442\u0438\u0447\u0435\u0441\u043A\u0438.");
        a.put(ah.m, "\u041A\u043B\u0430\u0432\u0438\u0430\u0442\u0443\u0440\u0430\u2026");
        a.put(ah.n, "\u041D\u043E\u043C\u0435\u0440 \u043A\u0430\u0440\u0442\u044B");
        a.put(ah.o, "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u043A\u0430\u0440\u0442\u0435");
        a.put(ah.p, "\u0412 \u0434\u0430\u043D\u043D\u043E\u043C \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0435 \u043D\u0435\u0442 \u043E\u043F\u0446\u0438\u0438 \u0441\u0447\u0438\u0442\u044B\u0432\u0430\u043D\u0438\u044F \u043D\u043E\u043C\u0435\u0440\u0430 \u043A\u0430\u0440\u0442\u044B \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u0444\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u044B.");
        a.put(ah.q, "\u0424\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u0430 \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0430 \u043D\u0435\u0434\u043E\u0441\u0442\u0443\u043F\u043D\u0430.");
        a.put(ah.r, "\u0412\u043E\u0437\u043D\u0438\u043A\u043B\u0430 \u043D\u0435\u0437\u0430\u043F\u043B\u0430\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u0430\u044F \u043E\u0448\u0438\u0431\u043A\u0430 \u043F\u0440\u0438 \u043E\u0442\u043A\u0440\u044B\u0442\u0438\u0438 \u0444\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u044B \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0430.");
    }

    public final String a()
    {
        return "ru";
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
