// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bz, di, bh, DataLayer

class dm
{

    private static bz a(bz bz1)
    {
        bz bz2;
        try
        {
            bz2 = new bz(di.u(dg(di.j((com.google.android.gms.internal.d.a)bz1.getObject()))), bz1.pX());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            bh.b("Escape URI: unsupported encoding", unsupportedencodingexception);
            return bz1;
        }
        return bz2;
    }

    private static bz a(bz bz1, int i)
    {
        if (!q((com.google.android.gms.internal.d.a)bz1.getObject()))
        {
            bh.T("Escaping can only be applied to strings.");
            return bz1;
        }
        switch (i)
        {
        default:
            bh.T((new StringBuilder()).append("Unsupported Value Escaping: ").append(i).toString());
            return bz1;

        case 12: // '\f'
            return a(bz1);
        }
    }

    static bz a(bz bz1, int ai[])
    {
        boolean flag = DataLayer.a;
        int j = ai.length;
        int i = 0;
        bz bz2;
        do
        {
            bz2 = bz1;
            if (i >= j)
            {
                break;
            }
            bz2 = a(bz1, ai[i]);
            i++;
            bz1 = bz2;
        } while (!flag);
        return bz2;
    }

    static String dg(String s)
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean q(com.google.android.gms.internal.d.a a1)
    {
        return di.o(a1) instanceof String;
    }
}
