// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.view.animation.Animation;

// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout

class j
    implements Runnable
{

    final PullRefreshLayout a;

    j(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void run()
    {
        PullRefreshLayout.a(a, true);
        if (PullRefreshLayout.e(a) != null)
        {
            PullRefreshLayout.b(a, PullRefreshLayout.j(a));
            PullRefreshLayout.l(a).setDuration(PullRefreshLayout.k(a));
            PullRefreshLayout.l(a).setAnimationListener(PullRefreshLayout.m(a));
            PullRefreshLayout.l(a).reset();
            a.startAnimation(PullRefreshLayout.l(a));
        }
        PullRefreshLayout.a(a, PullRefreshLayout.g(a) + a.getPaddingTop(), PullRefreshLayout.h(a));
    }
}
