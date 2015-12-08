// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.View;
import android.widget.ImageView;

public class ac
{

    public View a;
    public ImageView b;
    public ImageView c;

    public ac()
    {
    }

    public void a(int i)
    {
        a.setVisibility(i);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            b.setEnabled(false);
            c.setVisibility(0);
            return;
        } else
        {
            b.setEnabled(true);
            c.setVisibility(4);
            return;
        }
    }

    public void b(boolean flag)
    {
        b.setSelected(flag);
    }
}
