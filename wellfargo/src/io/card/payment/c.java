// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class c
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public c()
    {
        a.put(ah.a, "\u53D6\u6D88");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "\u5B8C\u6210");
        a.put(ah.h, "CVV");
        a.put(ah.i, "\u90AE\u653F\u7F16\u7801");
        a.put(ah.j, "\u5931\u6548\u65E5\u671F\uFF1A");
        a.put(ah.k, "MM/YY");
        a.put(ah.l, "\u6301\u5361\u7F6E\u4E8E\u6B64\u5904\u3002\n\u8BBE\u5907\u4F1A\u81EA\u52A8\u626B\u63CF\u5361\u3002");
        a.put(ah.m, "\u952E\u76D8\u2026");
        a.put(ah.n, "\u5361\u53F7");
        a.put(ah.o, "\u5361\u8BE6\u7EC6\u4FE1\u606F");
        a.put(ah.p, "\u6B64\u8BBE\u5907\u65E0\u6CD5\u4F7F\u7528\u6444\u50CF\u5934\u8BFB\u53D6\u5361\u53F7\u3002");
        a.put(ah.q, "\u8BBE\u5907\u6444\u50CF\u5934\u4E0D\u53EF\u7528\u3002");
        a.put(ah.r, "\u8BBE\u5907\u6253\u5F00\u6444\u50CF\u5934\u65F6\u51FA\u73B0\u610F\u5916\u9519\u8BEF\u3002");
    }

    public final String a()
    {
        return "zh-Hans";
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
