// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.home.rain:
//            ForecastRainProbability, ForecastRainProbabilityGraphs

class c
    implements Runnable
{

    final boolean a;
    final ForecastRainProbability b;

    c(ForecastRainProbability forecastrainprobability, boolean flag)
    {
        b = forecastrainprobability;
        a = flag;
        super();
    }

    public void run()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(300L);
        ForecastRainProbability.a(b).startAnimation(alphaanimation);
        ForecastRainProbability.a(b).setVisibility(0);
        if (ForecastRainProbability.b(b))
        {
            ForecastRainProbability.c(b).setVisibility(0);
            ForecastRainProbability.e(b).a(ForecastRainProbability.d(b), false, ForecastRainProbability.b(b), false);
            return;
        } else
        {
            ForecastRainProbability.c(b).setVisibility(8);
            ForecastRainProbability.e(b).a(ForecastRainProbability.d(b), a, ForecastRainProbability.b(b), false);
            return;
        }
    }
}
