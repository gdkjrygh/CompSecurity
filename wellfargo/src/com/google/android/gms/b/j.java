// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            m, i

class j extends m
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    protected int a()
    {
        return a.h;
    }

    protected int a(Object obj)
    {
        if (obj == null)
        {
            return a.a();
        } else
        {
            return a.a(obj, obj.hashCode());
        }
    }

    protected Object a(int k, int l)
    {
        return a.g[(k << 1) + l];
    }

    protected Object a(int k, Object obj)
    {
        return a.a(k, obj);
    }

    protected void a(int k)
    {
        a.d(k);
    }

    protected void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected int b(Object obj)
    {
        return a.a(obj);
    }

    protected Map b()
    {
        return a;
    }

    protected void c()
    {
        a.clear();
    }
}
