// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

public abstract class AdvancedAnimationView extends RelativeLayout
{

    protected boolean a;

    public AdvancedAnimationView(Context context)
    {
        super(context);
        a = true;
    }

    public AdvancedAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
    }

    public abstract void a();

    protected void a(View view, Animation animation)
    {
        if (view.getVisibility() != 0)
        {
            view.setVisibility(0);
        }
        view.startAnimation(animation);
    }

    public abstract void b();

    public abstract long c();
}
