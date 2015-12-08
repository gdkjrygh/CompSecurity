// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.youtube.h;
import com.google.android.youtube.r;

public class OfflineArrowView extends LinearLayout
{

    private Resources a;
    private DisplayMetrics b;
    private ImageView c;
    private ProgressBar d;
    private AnimationDrawable e;
    private int f;
    private int g;
    private int h;

    public OfflineArrowView(Context context)
    {
        super(context);
        a(context, null);
    }

    public OfflineArrowView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public OfflineArrowView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        a = context.getResources();
        b = a.getDisplayMetrics();
        attributeset = context.obtainStyledAttributes(attributeset, r.v);
        f = attributeset.getResourceId(0, h.U);
        g = attributeset.getResourceId(1, h.Y);
        h = attributeset.getResourceId(2, h.V);
        int i = attributeset.getResourceId(3, h.an);
        attributeset.recycle();
        setOrientation(1);
        setGravity(17);
        c = new ImageView(context);
        c.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        c.setImageResource(f);
        addView(c, new android.widget.LinearLayout.LayoutParams(-2, -2));
        d = new ProgressBar(context, null, 0x103001f);
        d.setProgressDrawable(a.getDrawable(i));
        addView(d, new android.widget.LinearLayout.LayoutParams(l.a(b, 24), l.a(b, 3)));
    }

    public final void a()
    {
        if (e == null)
        {
            e = (AnimationDrawable)a.getDrawable(g);
        }
        c.setImageDrawable(e);
        if (!e.isRunning())
        {
            e.start();
        }
    }

    public final void b()
    {
        if (e != null)
        {
            e.stop();
        }
    }

    public final void c()
    {
        setIcon(f);
    }

    public final void d()
    {
        setIcon(h);
    }

    public void setIcon(int i)
    {
        b();
        c.setImageResource(i);
    }

    public void setProgress(float f1)
    {
        setProgress((int)(Math.min(f1, 1.0F) * 100F));
    }

    public void setProgress(int i)
    {
        setProgress(i, 100);
    }

    public void setProgress(int i, int j)
    {
        setProgressVisible(true);
        d.setMax(j);
        d.setProgress(i);
    }

    public void setProgressVisible(boolean flag)
    {
        ProgressBar progressbar = d;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
    }
}
