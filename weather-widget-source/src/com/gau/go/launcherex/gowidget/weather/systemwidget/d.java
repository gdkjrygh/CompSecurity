// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            a

class d
{

    private a a;
    private boolean b;

    d(a a1)
    {
        b = false;
        a = a1;
    }

    void a(Context context)
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            a.a(context);
            return;
        }
    }

    void a(Context context, int ai[])
    {
        a(context);
        a.a(context, ai);
    }

    void b(Context context)
    {
        if (!b)
        {
            return;
        } else
        {
            b = false;
            a.b(context);
            return;
        }
    }

    void b(Context context, int ai[])
    {
        a(context);
        a.b(context, ai);
    }
}
