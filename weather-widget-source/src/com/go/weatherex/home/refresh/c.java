// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout

class c extends Animation
{

    final PullRefreshLayout a;

    c(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void applyTransformation(float f, Transformation transformation)
    {
        int i = 0;
        if ((float)PullRefreshLayout.a(a) != PullRefreshLayout.c(a))
        {
            i = PullRefreshLayout.a(a) + (int)((PullRefreshLayout.c(a) - (float)PullRefreshLayout.a(a)) * f);
        }
        PullRefreshLayout.a(a, i);
    }
}
