// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b;

import android.content.Context;
import com.gau.a.a.a;

public class d
{

    private static volatile d b = null;
    private a a;

    private d(Context context)
    {
        a = null;
        if (context == null)
        {
            throw new IllegalArgumentException("context can not be null");
        } else
        {
            a = new a(context.getApplicationContext());
            a.a(2);
            return;
        }
    }

    public static d a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/jiubang/commerce/ad/b/d;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new d(context);
        }
        com/jiubang/commerce/ad/b/d;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/jiubang/commerce/ad/b/d;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(com.gau.a.a.d.a a1)
    {
        if (a != null)
        {
            a.a(a1);
        }
    }

    public void a(com.gau.a.a.d.a a1, boolean flag)
    {
        a1.a(flag);
        a1.b(false);
        a(a1);
    }

}
