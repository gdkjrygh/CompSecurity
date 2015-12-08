// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.go.gl.animation.RotateAnimation;
import com.go.gl.widget.GLImageView;

public class GLProgressBar extends GLImageView
{

    private RotateAnimation a;

    public GLProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new RotateAnimation(0.0F, 359F, 1, 0.5F, 1, 0.5F);
        a.setRepeatCount(-1);
        a.setDuration(700L);
        context = new LinearInterpolator();
        a.setInterpolator(context);
    }

    public void startAnimation()
    {
        setAnimation(null);
        startAnimation(((com.go.gl.animation.Animation) (a)));
    }

    public void stopAnimation()
    {
        if (a != null)
        {
            clearAnimation();
        }
    }
}
