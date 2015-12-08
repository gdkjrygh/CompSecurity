// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ad extends Dialog
{

    private TextView a;
    private ProgressBar b;

    private ad(Context context, int i)
    {
        super(context, i);
        a();
    }

    public static ad a(Context context)
    {
        context = new ad(context, 0x7f07001a);
        context.getWindow().getAttributes().gravity = 17;
        return context;
    }

    private void a()
    {
        setContentView(0x7f030056);
        a = (TextView)findViewById(0x7f090117);
        b = (ProgressBar)findViewById(0x7f090260);
    }

    public ad a(String s)
    {
        a.setText(s);
        return this;
    }
}
