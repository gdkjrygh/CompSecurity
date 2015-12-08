// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.widget.AbsListView;
import android.widget.Toast;
import com.gtp.a.a.c.d;
import com.gtp.go.weather.coupon.a.e;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            CouponsActivity, h

class p
    implements android.widget.AbsListView.OnScrollListener
{

    final CouponsActivity a;

    private p(CouponsActivity couponsactivity)
    {
        a = couponsactivity;
        super();
    }

    p(CouponsActivity couponsactivity, h h)
    {
        this(couponsactivity);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
label0:
        {
            if (abslistview != null && abslistview.getLastVisiblePosition() == abslistview.getCount() - 1 && !CouponsActivity.a(a) && !CouponsActivity.b(a) && CouponsActivity.c(a).size() > 0)
            {
                if (!d.b(a.getApplicationContext()))
                {
                    break label0;
                }
                CouponsActivity.a(a, true);
                CouponsActivity.b(a, true);
                com.gtp.go.weather.coupon.view.CouponsActivity.d(a);
                CouponsActivity.f(a).a(com.gtp.go.weather.coupon.view.CouponsActivity.e(a), CouponsActivity.c(a));
            }
            return;
        }
        Toast.makeText(a.getApplicationContext(), a.getString(0x7f0801d0), 0).show();
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
