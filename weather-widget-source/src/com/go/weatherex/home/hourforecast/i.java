// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            TrendGraphs, h, f

class i extends Animation
{

    final TrendGraphs a;

    private i(TrendGraphs trendgraphs)
    {
        a = trendgraphs;
        super();
    }

    i(TrendGraphs trendgraphs, f f)
    {
        this(trendgraphs);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        if (TrendGraphs.a(a) && f < 1.0F)
        {
            TrendGraphs.a(a, TrendGraphs.b(a) * f * 2.0F);
            if (TrendGraphs.c(a) > TrendGraphs.b(a))
            {
                int k = 0;
                boolean flag1 = false;
                boolean flag = false;
                while (k < TrendGraphs.d(a).size()) 
                {
                    transformation = (h)TrendGraphs.d(a).get(k);
                    boolean flag2 = flag1;
                    boolean flag3 = flag;
                    if (transformation != null)
                    {
                        if (transformation.d())
                        {
                            flag3 = flag;
                            flag2 = flag1;
                        } else
                        if (!flag && transformation.a() == TrendGraphs.e(a))
                        {
                            flag2 = flag1;
                            flag3 = flag;
                            if (TrendGraphs.c(a) >= TrendGraphs.b(a) * 1.4F)
                            {
                                TrendGraphs.a(a, transformation);
                                flag3 = true;
                                flag2 = flag1;
                            }
                        } else
                        {
                            flag2 = flag1;
                            flag3 = flag;
                            if (!flag1)
                            {
                                flag2 = flag1;
                                flag3 = flag;
                                if (transformation.a() == TrendGraphs.f(a))
                                {
                                    TrendGraphs.a(a, transformation);
                                    flag2 = true;
                                    flag3 = flag;
                                }
                            }
                        }
                    }
                    k++;
                    flag1 = flag2;
                    flag = flag3;
                }
            }
        } else
        if (f == 1.0F)
        {
            TrendGraphs.a(a, TrendGraphs.b(a) * 2.0F);
            int j = 0;
            while (j < TrendGraphs.d(a).size()) 
            {
                transformation = (h)TrendGraphs.d(a).get(j);
                if (transformation != null)
                {
                    transformation.a(0.0F);
                }
                j++;
            }
        }
        a.invalidate();
    }
}
