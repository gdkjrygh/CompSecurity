// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.widget.TextView;
import android.widget.Toast;
import com.gtp.a.a.c.d;
import com.gtp.go.weather.coupon.a.e;
import com.gtp.go.weather.coupon.b.b;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            g, CouponCollectActivity, f, b

class a
    implements g
{

    final b a;
    final TextView b;
    final CouponCollectActivity c;

    a(CouponCollectActivity couponcollectactivity, b b1, TextView textview)
    {
        c = couponcollectactivity;
        a = b1;
        b = textview;
        super();
    }

    public void a()
    {
        switch (a.f())
        {
        default:
            return;

        case 1: // '\001'
            com.gtp.go.weather.coupon.c.a.a(c.getApplicationContext(), CouponCollectActivity.h(c).c());
            CouponCollectActivity.h(c).d(c.getString(0x7f08028c));
            b.setText(c.getString(0x7f08028e));
            b.setBackgroundResource(0x7f020642);
            b.setClickable(false);
            return;

        case 2: // '\002'
            break;
        }
        if (com.gtp.go.weather.coupon.c.a.b(CouponCollectActivity.h(c).e()))
        {
            if (d.b(c.getApplicationContext()))
            {
                b.setText(c.getString(0x7f080285));
                b.setClickable(false);
                b.setBackgroundResource(0x7f020642);
                (new e(c.getApplicationContext())).a(CouponCollectActivity.h(c).e(), a.c(), new com.gtp.go.weather.coupon.view.b(this));
                return;
            } else
            {
                Toast.makeText(c.getApplicationContext(), c.getString(0x7f0801d0), 0).show();
                return;
            }
        } else
        {
            Toast.makeText(c.getApplicationContext(), c.getString(0x7f080289), 0).show();
            return;
        }
    }
}
