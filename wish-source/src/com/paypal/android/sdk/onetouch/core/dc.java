// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            r, Protocol, RequestTarget

public abstract class dc
{

    private static final String a = com/paypal/android/sdk/onetouch/core/dc.getSimpleName();
    private List b;
    private RequestTarget c;
    private Protocol d;
    private String e;
    private String f;
    private Collection g;

    public dc()
    {
        b = new ArrayList();
        g = new HashSet();
    }

    public static Intent a(String s, String s1)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (!"*".equals(s1))
        {
            s.setPackage(s1);
        }
        return s;
    }

    public static boolean a(Context context, String s, String s1)
    {
        s = a(s, s1);
        boolean flag;
        if (s.resolveActivity(context.getPackageManager()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = (new StringBuilder("browser intent with package:")).append(s.getPackage()).append(" can ");
        if (flag)
        {
            context = "";
        } else
        {
            context = "NOT ";
        }
        s.append(context).append("be resolved");
        return flag;
    }

    public abstract dc a();

    public final dc a(RequestTarget requesttarget)
    {
        c = requesttarget;
        return a();
    }

    public final boolean a(Context context, String s)
    {
        for (Iterator iterator = c().iterator(); iterator.hasNext();)
        {
            if (a(context, s, (String)iterator.next()))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(Context context, boolean flag)
    {
        for (Iterator iterator = c().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            boolean flag2 = (new r()).a(context, f, e);
            String s1 = Locale.getDefault().toString();
            boolean flag1;
            if (g.isEmpty() || g.contains(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((new r()).a(context, flag, s) && flag2 && flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                return true;
            }
        }

        return false;
    }

    public final dc c(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 48 51: default 36
    //                   48 78
    //                   49 92
    //                   50 106
    //                   51 120;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 134
    //                   1 146
    //                   2 156
    //                   3 166;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        throw new IllegalArgumentException("invalid protocol");
_L2:
        if (s.equals("0"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("1"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s.equals("2"))
        {
            byte0 = 2;
        }
          goto _L1
_L5:
        if (s.equals("3"))
        {
            byte0 = 3;
        }
          goto _L1
_L7:
        d = Protocol.v0;
_L12:
        return a();
_L8:
        d = Protocol.v1;
        continue; /* Loop/switch isn't completed */
_L9:
        d = Protocol.v2;
        continue; /* Loop/switch isn't completed */
_L10:
        d = Protocol.v3;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final List c()
    {
        return new ArrayList(b);
    }

    public final RequestTarget d()
    {
        return c;
    }

    public final dc d(String s)
    {
        b.add(s);
        return a();
    }

    public final Protocol e()
    {
        return d;
    }

    public final dc e(String s)
    {
        g.add(s);
        return a();
    }

    public final dc f(String s)
    {
        e = s;
        return a();
    }

    public final dc g(String s)
    {
        f = s;
        return a();
    }

    public String toString()
    {
        return (new StringBuilder("Recipe(target=")).append(c).append(", protocol=").append(d).append(", packages=").append(b).append(", targetComponent=").append(e).append(", targetIntentAction=").append(f).append(", supportedLocales=").append(g).append(")").toString();
    }

}
