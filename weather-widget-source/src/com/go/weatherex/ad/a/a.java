// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.go.weatherex.ad.a:
//            i, b

public abstract class a
{

    protected Activity a;
    protected i b;

    public a(Activity activity)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException("Activity cannot be null.");
        } else
        {
            a = activity;
            return;
        }
    }

    public abstract b a();

    public void a(i i)
    {
        b = i;
    }

    public abstract void a(boolean flag);

    public abstract View b();

    public abstract void c();

    public void d()
    {
    }

    public void e()
    {
    }

    public boolean f()
    {
        return true;
    }

    public boolean g()
    {
        return false;
    }

    protected boolean h()
    {
        return a.getResources().getInteger(0x7f0b0004) == 1;
    }
}
