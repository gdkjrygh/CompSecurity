// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            ai, ah

public final class ar
    implements ai
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public ar()
    {
        a.put(ah.a, "Cancelar");
        a.put(ah.b, "American Express");
        a.put(ah.c, "Discover");
        a.put(ah.d, "JCB");
        a.put(ah.e, "MasterCard");
        a.put(ah.f, "Visa");
        a.put(ah.g, "Listo");
        a.put(ah.h, "CVV");
        a.put(ah.i, "C\363digo postal");
        a.put(ah.j, "Caduca");
        a.put(ah.k, "MM/AA");
        a.put(ah.l, "Sostenga la tarjeta aqu\355.\nSe escanear\341 autom\341ticamente.");
        a.put(ah.m, "Teclado\u2026");
        a.put(ah.n, "N\372mero de tarjeta");
        a.put(ah.o, "Detalles de la tarjeta");
        a.put(ah.p, "Este dispositivo no puede usar la c\341mara para leer n\372meros de tarjeta.");
        a.put(ah.q, "La c\341mara del dispositivo no est\341 disponible.");
        a.put(ah.r, "El dispositivo tuvo un error inesperado al abrir la c\341mara.");
    }

    public final String a()
    {
        return "es_MX";
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
