// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout, a

class d extends Animation
{

    final PullRefreshLayout a;

    d(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void applyTransformation(float f, Transformation transformation)
    {
        float f1 = PullRefreshLayout.d(a);
        float f2 = PullRefreshLayout.d(a);
        PullRefreshLayout.e(a).a(f1 + (0.0F - f2) * f);
    }
}
