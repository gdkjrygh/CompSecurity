// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.go.weatherex.home.b:
//            o, m

public class n
{

    private int a;
    private m b;
    private ConcurrentHashMap c;

    public n(int i)
    {
        a = 0x500000;
        b = null;
        c = new ConcurrentHashMap();
        if (i > 0)
        {
            a = i;
        }
        b = new o(this, a);
    }

    static ConcurrentHashMap a(n n1)
    {
        return n1.c;
    }

    public void a(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            b.a(s);
            c.remove(s);
            return;
        }
    }

    public void a(String s, Bitmap bitmap)
    {
        while (s == null || bitmap == null || b == null) 
        {
            return;
        }
        b.a(s, bitmap);
    }
}
