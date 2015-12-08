// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.d;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity, a

class g extends BroadcastReceiver
{

    final RecommendVipActivity a;

    private g(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    g(RecommendVipActivity recommendvipactivity, a a1)
    {
        this(recommendvipactivity);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        context = intent.getAction();
        if (context != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        com.go.weatherex.recommendvip.RecommendVipActivity.d(a);
        if (com.go.weatherex.recommendvip.RecommendVipActivity.e(a).b())
        {
            com.go.weatherex.recommendvip.RecommendVipActivity.f(a);
            context = new d(a.getApplicationContext(), "428");
            context.b("p000");
            context.d("2");
            context.e("1");
            context = context.b();
            e.a(a.getApplicationContext()).a(context);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION")) goto _L2; else goto _L4
_L4:
        com.go.weatherex.recommendvip.RecommendVipActivity.d(a);
        if (com.go.weatherex.recommendvip.RecommendVipActivity.e(a).c())
        {
            context = new d(a.getApplicationContext(), "428");
            context.b("p000");
            context.d("1");
            context.e("1");
            context = context.b();
            e.a(a.getApplicationContext()).a(context);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
