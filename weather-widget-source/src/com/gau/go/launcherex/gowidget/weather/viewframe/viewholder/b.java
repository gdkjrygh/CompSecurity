// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.viewframe.viewholder;

import android.content.Context;
import android.view.View;

public class b
{

    protected View e;
    protected Context f;

    public b()
    {
    }

    public b(Context context)
    {
        f = context;
    }

    public b(Context context, View view)
    {
        f = context;
        e = view;
    }

    public void a(int i)
    {
        e.setVisibility(i);
    }

    public View b()
    {
        return e;
    }

    public View b(int i)
    {
        return e.findViewById(i);
    }

    public void c()
    {
    }
}
