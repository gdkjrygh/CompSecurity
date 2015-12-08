// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class i
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public i()
    {
        a.put(ah.a, "\u53D6\u6D88");
        a.put(ah.b, "\u7F8E\u570B\u904B\u901A");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "\u5B8C\u6210");
        a.put(ah.h, "\u4FE1\u7528\u5361\u9A57\u8B49\u78BC");
        a.put(ah.i, "\u90F5\u905E\u5340\u865F");
        a.put(ah.j, "\u5230\u671F\u65E5");
        a.put(ah.k, "\u6708 / \u5E74");
        a.put(ah.l, "\u5C07\u4FE1\u7528\u5361\u653E\u5728\u6B64\u8655\u3002\n\u7CFB\u7D71\u5C07\u81EA\u52D5\u6383\u63CF\u3002");
        a.put(ah.m, "\u9375\u76E4\u2026");
        a.put(ah.n, "\u5361\u865F");
        a.put(ah.o, "\u4FE1\u7528\u5361\u8A73\u7D30\u8CC7\u6599");
        a.put(ah.p, "\u6B64\u88DD\u7F6E\u7121\u6CD5\u4F7F\u7528\u76F8\u6A5F\u8B80\u53D6\u5361\u865F\u3002");
        a.put(ah.q, "\u7121\u6CD5\u4F7F\u7528\u76F8\u6A5F\u3002");
        a.put(ah.r, "\u555F\u52D5\u76F8\u6A5F\u6642\u767C\u751F\u610F\u5916\u7684\u932F\u8AA4\u3002");
    }

    public final String a()
    {
        return "zh-Hant_TW";
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
