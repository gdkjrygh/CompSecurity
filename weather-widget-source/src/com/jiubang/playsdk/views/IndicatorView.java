// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.e;
import com.jiubang.playsdk.main.c;

public class IndicatorView extends FrameLayout
{

    private int a;
    private int b;
    private LinearLayout c;

    public IndicatorView(Context context)
    {
        this(context, null);
    }

    public IndicatorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = y.a().b().g();
        b = y.a().b().f();
        c = (LinearLayout)findViewById(e.m);
    }
}
