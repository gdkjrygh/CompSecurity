// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.go.weatherex.home.dayforecast:
//            ColumnGraphs, b, a

class c extends Animation
{

    final ColumnGraphs a;

    private c(ColumnGraphs columngraphs)
    {
        a = columngraphs;
        super();
    }

    c(ColumnGraphs columngraphs, a a1)
    {
        this(columngraphs);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        if (ColumnGraphs.a(a))
        {
            int i = 0;
            while (i < ColumnGraphs.b(a).size()) 
            {
                transformation = (b)ColumnGraphs.b(a).get(i);
                float f1 = transformation.h() * 0.2F;
                if (f >= f1 && transformation.i() > 0.0F)
                {
                    f1 = (f - f1) / transformation.i();
                    if (f1 < 1.0F)
                    {
                        transformation.a(f1);
                        transformation.b(f1 * (transformation.c() / 2.0F));
                    } else
                    if (!transformation.l())
                    {
                        if (f < 1.0F)
                        {
                            if (transformation.k())
                            {
                                if (transformation.j() < ColumnGraphs.c(a))
                                {
                                    transformation.e(transformation.j() + 0.1F);
                                } else
                                {
                                    transformation.b(false);
                                }
                            } else
                            if (transformation.j() > 0.0F)
                            {
                                transformation.e(transformation.j() - 0.1F);
                            } else
                            {
                                transformation.c(true);
                            }
                        }
                        transformation.b(transformation.c() / 2.0F);
                        transformation.a(1.0F);
                    }
                }
                i++;
            }
            a.invalidate();
        }
    }
}
