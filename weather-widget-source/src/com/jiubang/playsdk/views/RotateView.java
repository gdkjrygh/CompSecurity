// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.main.c;

public class RotateView extends ImageView
{

    private Animation a;

    public RotateView(Context context)
    {
        super(context);
        a();
    }

    public RotateView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public RotateView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        setImageResource(y.a().b().j());
        a = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
        a.setInterpolator(new LinearInterpolator());
        a.setDuration(1000L);
        a.setRepeatCount(-1);
        a.setFillAfter(true);
        startAnimation(a);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (i == 0)
        {
            clearAnimation();
            startAnimation(a);
            return;
        } else
        {
            clearAnimation();
            return;
        }
    }
}
