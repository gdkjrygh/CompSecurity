// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service.a;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service.a:
//            b

public abstract class a
{

    private b a;

    public a()
    {
    }

    protected abstract void a();

    final void a(b b1)
    {
        if (b1 == null)
        {
            throw new IllegalStateException("you should never call this method!");
        } else
        {
            a = b1;
            return;
        }
    }

    protected boolean a(a a1)
    {
        return false;
    }

    final void b()
    {
        if (a == null)
        {
            throw new IllegalStateException("you should never call this method!");
        } else
        {
            a = null;
            return;
        }
    }
}
