// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            bl

public abstract class bk extends FrameLayout
{

    private bl a;
    protected Context b;
    protected LayoutInflater c;

    public bk(Context context, bl bl)
    {
        super(context);
        b = context;
        c = LayoutInflater.from(context);
        c.inflate(a(), this);
        a = bl;
    }

    public abstract int a();

    public bl k()
    {
        return a;
    }
}
