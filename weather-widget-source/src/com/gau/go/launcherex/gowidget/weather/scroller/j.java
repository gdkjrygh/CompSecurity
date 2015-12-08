// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.view.animation.Interpolator;

public class j
    implements Interpolator
{

    static float a = 1.0F;

    public j()
    {
    }

    public static float a(float f)
    {
        f = 8F * f;
        if (f < 1.0F)
        {
            f -= 1.0F - (float)Math.exp(-f);
        } else
        {
            f = (1.0F - (float)Math.exp(1.0F - f)) * 0.6321205F + 0.3678795F;
        }
        return f * a;
    }

    public float getInterpolation(float f)
    {
        return a(f);
    }

    static 
    {
        a = 1.0F / a(1.0F);
    }
}
