// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.go.weatherex.ad.c:
//            d

public abstract class c
{

    protected Activity a;
    protected d b;

    c(Activity activity)
    {
        a = activity;
        a(a);
    }

    protected String a(int i)
    {
        return a.getString(i);
    }

    protected abstract void a(Context context);

    protected void a(d d1)
    {
        b = d1;
    }

    public abstract void b();

    public abstract boolean c();

    public abstract void d();

    public abstract void e();
}
