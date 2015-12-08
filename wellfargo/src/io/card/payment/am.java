// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class am
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public am()
    {
        a.put(ah.a, "Cancel");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Done");
        a.put(ah.h, "CVV");
        a.put(ah.i, "Postal Code");
        a.put(ah.j, "Expires");
        a.put(ah.k, "MM/YY");
        a.put(ah.l, "Hold card here.\nIt will scan automatically.");
        a.put(ah.m, "Keyboard\u2026");
        a.put(ah.n, "Card Number");
        a.put(ah.o, "Card Details");
        a.put(ah.p, "This device cannot use the camera to read card numbers.");
        a.put(ah.q, "Device camera is unavailable.");
        a.put(ah.r, "The device had an unexpected error opening the camera.");
    }

    public final String a()
    {
        return "en";
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
