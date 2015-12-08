// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.mapbar.android.location:
//            g, u, h

public class j
{

    Context a;
    Locale b;

    public j()
    {
    }

    public j(Context context, Locale locale)
    {
        a = context;
        b = locale;
        if (!g.b)
        {
            context = a.getPackageManager();
            g.e = a.getPackageName();
            g.d = g.a(context, g.e);
            g.c = com.mapbar.android.location.b.d.a(context, g.e);
            g.b = g.a(g.d);
        }
    }

    String a()
    {
        char ac[];
        int i;
        int k;
        ac = " lO>_g7L'\027-t^=\026fuZ>\007)j\025-\n%7H+\004:{SaZ/z\006~Wn".toCharArray();
        k = ac.length;
        i = 0;
_L7:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        i % 5;
        JVM INSTR tableswitch 0 3: default 52
    //                   0 71
    //                   1 77
    //                   2 83
    //                   3 89;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_89;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 101;
_L8:
        ac[i] = (char)(byte0 ^ ac[i]);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 72;
          goto _L8
_L3:
        byte0 = 24;
          goto _L8
_L4:
        byte0 = 59;
          goto _L8
        byte0 = 78;
          goto _L8
        return new String(ac);
    }

    public final List a(String s, int i)
        throws UnsupportedEncodingException
    {
        ArrayList arraylist = new ArrayList();
        if (!g.b)
        {
            return arraylist;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a()).append("ct=").append(URLEncoder.encode("\u5168\u56FD", "utf-8")).append("&ch=UTF-8&fd=5&rn=").append(i).append("&pn=1&tp=1&q=").append(URLEncoder.encode(s, "utf-8"));
        s = new u(a, 3, 0);
        s.a(stringbuilder.toString());
        s = (String)s.a();
        if (s != null)
        {
            s = h.b(b, s);
            if (s != null)
            {
                arraylist.addAll(s);
            }
        }
        return arraylist;
    }
}
