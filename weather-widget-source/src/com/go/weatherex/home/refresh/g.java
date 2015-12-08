// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.b;

// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout

class g extends b
{

    final PullRefreshLayout a;

    g(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        PullRefreshLayout.a(a, 0.0F);
    }
}
