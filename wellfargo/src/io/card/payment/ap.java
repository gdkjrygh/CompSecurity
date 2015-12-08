// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class ap
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public ap()
    {
        a.put(ah.a, "Cuncel");
        a.put(ah.b, "Emereecun Ixpress");
        a.put(ah.c, "Deescufer");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MesterCerd");
        a.put(ah.f, "Feesa");
        a.put(ah.g, "B\366rk B\366rk B\366rk!");
        a.put(ah.h, "CFF");
        a.put(ah.i, "Pustel Cude");
        a.put(ah.j, "Expures");
        a.put(ah.k, "MM/YY");
        a.put(ah.l, "Huld cerd here-a.\nIt veell scun ootumeteecelly.");
        a.put(ah.m, "Keybuerd\u2026");
        a.put(ah.n, "Cerd Noomber");
        a.put(ah.o, "Cerd Deteeels");
        a.put(ah.p, "Thees defeece-a cunnut use-a zee cemera tu reed cerd noombers.");
        a.put(ah.q, "Device camera is unavailable.");
        a.put(ah.r, "Zee defeece-a hed un unexpected irrur oopeneeng zee cemera.");
    }

    public final String a()
    {
        return "en_SE";
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
