// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class bd
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public bd()
    {
        a.put(ah.a, "Cancelar");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Conclu\355do");
        a.put(ah.h, "CSC");
        a.put(ah.i, "C\363digo Postal");
        a.put(ah.j, "Validade");
        a.put(ah.k, "MM/AA");
        a.put(ah.l, "Segure o cart\343o aqui.\nSer\341 lido automaticamente.");
        a.put(ah.m, "Teclado\u2026");
        a.put(ah.n, "N\372mero do cart\343o");
        a.put(ah.o, "Detalhes do cart\343o");
        a.put(ah.p, "Este dispositivo n\343o pode utilizar a c\342mara para ler n\372meros de cart\365es.");
        a.put(ah.q, "A c\342mara do dispositivo n\343o est\341 dispon\355vel.");
        a.put(ah.r, "Ocorreu um erro inesperado no dispositivo ao abrir a c\342mara.");
    }

    public final String a()
    {
        return "pt";
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
