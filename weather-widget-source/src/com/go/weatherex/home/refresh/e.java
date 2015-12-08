// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.b;

// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout

class e extends b
{

    final PullRefreshLayout a;

    e(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        com.go.weatherex.home.refresh.PullRefreshLayout.b(a, 0);
        PullRefreshLayout.a(a, false);
        com.go.weatherex.home.refresh.PullRefreshLayout.b(a, false);
    }
}
