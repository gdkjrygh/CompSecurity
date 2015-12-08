// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import com.go.weatherex.framework.a.a;

public abstract class f extends Dialog
    implements a
{

    protected Activity a;
    private a b;

    public f(Activity activity)
    {
        this(activity, 0x7f07001f);
    }

    public f(Activity activity, int i)
    {
        super(activity, i);
        a = activity;
        if (activity instanceof a)
        {
            b = (a)activity;
        }
        setCanceledOnTouchOutside(false);
    }

    public Typeface a(Context context, int i, int j)
    {
        if (b != null)
        {
            return b.a(context, i, j);
        } else
        {
            return null;
        }
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        Window window = getWindow();
        android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
        window.setGravity(i);
        layoutparams.x = j;
        layoutparams.y = k;
        layoutparams.width = l;
        layoutparams.height = i1;
        window.setAttributes(layoutparams);
        show();
    }

    public void a(View view, int i, int j)
    {
        if (b != null)
        {
            b.a(view, i, j);
        }
    }

    public void a(View view, int i, boolean flag)
    {
        if (b != null)
        {
            b.a(view, i, flag);
        }
    }
}
