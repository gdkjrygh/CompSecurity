// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.view.animation.Interpolator;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherTrendView

class af
    implements Interpolator
{

    final WeatherTrendView a;

    af(WeatherTrendView weathertrendview)
    {
        a = weathertrendview;
        super();
    }

    public float getInterpolation(float f)
    {
        return (float)Math.pow(f / 0.4F, 2D);
    }
}
