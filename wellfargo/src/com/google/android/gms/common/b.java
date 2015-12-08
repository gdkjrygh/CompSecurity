// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common:
//            d

public class b
{

    public static final int a;
    private static final b b = new b();

    b()
    {
    }

    public static b a()
    {
        return b;
    }

    public int a(Context context)
    {
        int j = d.a(context);
        int i = j;
        if (d.b(context, j))
        {
            i = 18;
        }
        return i;
    }

    public Intent a(int i)
    {
        return d.a(i);
    }

    public boolean a(Context context, int i)
    {
        return d.b(context, i);
    }

    public void b(Context context)
    {
        d.b(context);
    }

    static 
    {
        a = d.a;
    }
}
