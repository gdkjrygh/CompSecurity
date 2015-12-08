// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.rain:
//            ForecastRainProbabilityGraphs, f

class e extends Animation
{

    final ForecastRainProbabilityGraphs a;
    private float b;

    public e(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs, float f1)
    {
        a = forecastrainprobabilitygraphs;
        super();
        b = f1;
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        if (ForecastRainProbabilityGraphs.a(a) != null && ForecastRainProbabilityGraphs.a(a).size() > 0)
        {
            int k = ForecastRainProbabilityGraphs.b(a).size();
            int i = 0;
            while (i < k) 
            {
                transformation = (f)ForecastRainProbabilityGraphs.b(a).get(i);
                float f2 = transformation.j() * ForecastRainProbabilityGraphs.c(a);
                if (f1 >= f2)
                {
                    if (transformation.k() == 0.0F)
                    {
                        transformation.d(0);
                        transformation.a(1.0F);
                    } else
                    {
                        f2 = (f1 - f2) / transformation.k();
                        if (f2 < 1.0F)
                        {
                            transformation.d((int)((float)transformation.d() * f2));
                            transformation.a(f2);
                        } else
                        if (!transformation.l())
                        {
                            if (transformation.d() > 0 && f1 < 1.0F)
                            {
                                if (transformation.i())
                                {
                                    if (transformation.h() < ForecastRainProbabilityGraphs.d(a))
                                    {
                                        transformation.b(transformation.h() + ForecastRainProbabilityGraphs.e(a));
                                    } else
                                    {
                                        transformation.a(false);
                                    }
                                } else
                                if (transformation.h() > 0.0F)
                                {
                                    transformation.b(transformation.h() - ForecastRainProbabilityGraphs.e(a));
                                } else
                                {
                                    transformation.b(true);
                                }
                                transformation.d(transformation.d() + (int)transformation.h());
                            } else
                            {
                                transformation.d(transformation.d());
                            }
                            transformation.a(1.0F);
                        }
                    }
                } else
                {
                    transformation.d(0);
                    transformation.a(0.0F);
                }
                i++;
            }
            if (f1 == 1.0F)
            {
                for (int j = 0; j < ForecastRainProbabilityGraphs.b(a).size(); j++)
                {
                    transformation = (f)ForecastRainProbabilityGraphs.b(a).get(j);
                    if (transformation != null)
                    {
                        transformation.e(0);
                        transformation.b(0.0F);
                        transformation.a(1.0F);
                    }
                }

                a.invalidate();
            } else
            if (ForecastRainProbabilityGraphs.a >= 11)
            {
                a.invalidate();
                return;
            }
        }
    }
}
