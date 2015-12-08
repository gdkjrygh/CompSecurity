// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DayIcon extends LinearLayout
{

    private TextView a;
    private ImageView b;

    public DayIcon(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(Drawable drawable)
    {
        b.setImageDrawable(drawable);
    }

    public void a(String s)
    {
        a.setText(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(0x7f0900b5);
        b = (ImageView)findViewById(0x7f0900af);
    }
}
