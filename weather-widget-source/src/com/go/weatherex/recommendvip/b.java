// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import com.gau.go.launcherex.gowidget.weather.scroller.AnimViewScrollGroup;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class b
    implements Runnable
{

    final RecommendVipActivity a;

    b(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    public void run()
    {
        int i = RecommendVipActivity.a(a).getChildCount();
        int j = RecommendVipActivity.b(a);
        RecommendVipActivity.a(a).a((j + 1) % i);
    }
}
