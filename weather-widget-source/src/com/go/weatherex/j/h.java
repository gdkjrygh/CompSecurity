// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.Context;

// Referenced classes of package com.go.weatherex.j:
//            i, j

public abstract class h
{

    private Context a;
    private i b;

    public h(Context context)
    {
        a = context;
    }

    public Context a()
    {
        return a;
    }

    public void a(i j)
    {
        b = j;
    }

    protected void a(j j)
    {
        if (b != null)
        {
            b.a(j);
        }
    }
}
