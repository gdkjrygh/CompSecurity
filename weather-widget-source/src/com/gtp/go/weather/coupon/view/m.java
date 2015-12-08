// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.view.View;
import com.gtp.go.weather.coupon.a.a;
import com.gtp.go.weather.coupon.b.b;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            k, CouponsActivity

class m
    implements android.view.View.OnClickListener
{

    final b a;
    final k b;

    m(k k1, b b1)
    {
        b = k1;
        a = b1;
        super();
    }

    public void onClick(View view)
    {
        if (!a.l())
        {
            a.c(true);
            CouponsActivity.g(b.a).notifyDataSetChanged();
            com.gtp.go.weather.coupon.a.a.a(b.a.getApplicationContext()).a(a);
        }
    }
}
