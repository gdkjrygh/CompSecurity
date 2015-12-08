// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class be
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public be()
    {
        a.put(ah.a, "Cancelar");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Conclu\355do");
        a.put(ah.h, "CVV");
        a.put(ah.i, "CEP");
        a.put(ah.j, "Vencimento");
        a.put(ah.k, "MM/AA");
        a.put(ah.l, "Posicionar cart\343o aqui.\nEle ser\341 digitalizado automaticamente.");
        a.put(ah.m, "Teclado\u2026");
        a.put(ah.n, "N\372mero do Cart\343o");
        a.put(ah.o, "Dados do cart\343o");
        a.put(ah.p, "Este dispositivo n\343o pode usar a c\342mera para ler n\372meros de cart\343o.");
        a.put(ah.q, "A c\342mera do dispositivo n\343o est\341 dispon\355vel.");
        a.put(ah.r, "O dispositivo sofreu um erro inesperado ao abrir a c\342mera.");
    }

    public final String a()
    {
        return "pt_BR";
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
