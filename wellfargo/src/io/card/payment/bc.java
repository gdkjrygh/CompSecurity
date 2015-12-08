// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class bc
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public bc()
    {
        a.put(ah.a, "Anuluj");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Gotowe");
        a.put(ah.h, "Kod CVV2/CVC2");
        a.put(ah.i, "Kod pocztowy");
        a.put(ah.j, "Wygasa");
        a.put(ah.k, "MM/RR");
        a.put(ah.l, "Przytrzymaj kart\u0119 tutaj.\nZostanie ona zeskanowana automatycznie.");
        a.put(ah.m, "Klawiatura\u2026");
        a.put(ah.n, "Numer karty");
        a.put(ah.o, "Dane karty");
        a.put(ah.p, "Na tym urz\u0105dzeniu nie mo\u017Cna odczyta\u0107 numeru karty za pomoc\u0105 aparatu.");
        a.put(ah.q, "Aparat na tym urz\u0105dzeniu jest niedostepny.");
        a.put(ah.r, "Przy otwieraniu aparatu na tym urz\u0105dzeniu wyst\u0105pi\u0142 nieoczekiwany b\u0142\u0105d.");
    }

    public final String a()
    {
        return "pl";
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
