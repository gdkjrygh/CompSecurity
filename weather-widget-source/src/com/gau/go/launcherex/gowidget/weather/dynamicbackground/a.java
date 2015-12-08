// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground:
//            DynamicBackgroundView

class a
    implements Runnable
{

    long a;
    final DynamicBackgroundView b;
    private boolean c;

    public a(DynamicBackgroundView dynamicbackgroundview)
    {
        b = dynamicbackgroundview;
        super();
        c = false;
        a = 25L;
    }

    void a()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            b.removeCallbacks(this);
            b.post(this);
            return;
        }
    }

    void b()
    {
        c = false;
        b.removeCallbacks(this);
    }

    public void run()
    {
        b.invalidate();
        if (c)
        {
            b.postDelayed(this, a);
        }
    }
}
