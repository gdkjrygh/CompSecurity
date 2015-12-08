// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.jiubang.commerce.utils.j;

public class f
{

    private static f a;
    private String b;
    private Resources c;
    private LayoutInflater d;

    private f(Context context)
    {
        b = context.getPackageName();
        c = context.getResources();
        d = LayoutInflater.from(context);
    }

    public static f a(Context context)
    {
        com/jiubang/commerce/ad/f;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new f(context);
        }
        context = a;
        com/jiubang/commerce/ad/f;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public int a(String s)
    {
        int i = c.getIdentifier(s, "id", b);
        if (i == 0)
        {
            j.d("ResourcesProvider", (new StringBuilder()).append("id:").append(s).append(" is not found").toString());
        }
        return i;
    }

    public int b(String s)
    {
        int i = c.getIdentifier(s, "layout", b);
        if (i == 0)
        {
            j.d("ResourcesProvider", (new StringBuilder()).append("layout:").append(s).append(" is not found").toString());
        }
        return i;
    }

    public int c(String s)
    {
        int i = c.getIdentifier(s, "drawable", b);
        if (i == 0)
        {
            j.d("ResourcesProvider", (new StringBuilder()).append("drawable:").append(s).append(" is not found").toString());
        }
        return i;
    }

    public int d(String s)
    {
        int i = c.getIdentifier(s, "dimen", b);
        if (i == 0)
        {
            j.d("ResourcesProvider", (new StringBuilder()).append("dimen:").append(s).append(" is not found").toString());
        }
        return c.getDimensionPixelOffset(i);
    }

    public String e(String s)
    {
        int i = c.getIdentifier(s, "string", b);
        if (i == 0)
        {
            j.d("ResourcesProvider", (new StringBuilder()).append("string:").append(s).append(" is not found").toString());
        }
        return c.getString(i);
    }
}
