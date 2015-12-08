// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.widget.TextView;
import android.widget.Toast;
import com.gtp.a.a.c.d;
import com.gtp.go.weather.coupon.a.e;
import com.gtp.go.weather.coupon.b.b;
import com.gtp.go.weather.coupon.c.a;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            g, CouponsActivity, f, i

class h
    implements g
{

    final b a;
    final TextView b;
    final CouponsActivity c;

    h(CouponsActivity couponsactivity, b b1, TextView textview)
    {
        c = couponsactivity;
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
            com.gtp.go.weather.coupon.c.a.a(c.getApplicationContext(), CouponsActivity.j(c).c());
            CouponsActivity.j(c).d(c.getString(0x7f08028c));
            b.setText(c.getString(0x7f08028e));
            b.setBackgroundResource(0x7f020642);
            b.setClickable(false);
            return;

        case 2: // '\002'
            break;
        }
        if (com.gtp.go.weather.coupon.c.a.b(CouponsActivity.j(c).e()))
        {
            if (d.b(c.getApplicationContext()))
            {
                b.setText(c.getString(0x7f080285));
                b.setClickable(false);
                b.setBackgroundResource(0x7f020642);
                CouponsActivity.f(c).a(CouponsActivity.j(c).e(), a.c(), new i(this));
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
