// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;


// Referenced classes of package com.go.weatherex.home.refresh:
//            PullRefreshLayout

class h
    implements Runnable
{

    final PullRefreshLayout a;

    h(PullRefreshLayout pullrefreshlayout)
    {
        a = pullrefreshlayout;
        super();
    }

    public void run()
    {
        PullRefreshLayout.a(a, true);
        PullRefreshLayout.a(a, PullRefreshLayout.g(a) + a.getPaddingTop(), PullRefreshLayout.h(a));
    }
}
