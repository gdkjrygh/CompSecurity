// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.content.Context;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            b

public abstract class a
{

    protected final Context a;
    protected String b;
    private b c;

    public a(Context context)
    {
        a = context.getApplicationContext();
    }

    protected void a(com.gau.go.launcherex.gowidget.weather.a.a.a a1)
    {
        if (c != null)
        {
            c.a(this, a1);
        }
    }

    public void a(b b1)
    {
        c = b1;
    }

    public void a(String s)
    {
    }
}
