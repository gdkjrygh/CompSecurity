// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            h, CouponsActivity, f

class i
    implements com.gtp.go.weather.coupon.a.i
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            a.b.setText(a.c.getString(0x7f080286));
            CouponsActivity.j(a.c).a(a.c.getString(0x7f080287));
            CouponsActivity.j(a.c).d(a.c.getString(0x7f080283));
            return;
        } else
        {
            Toast.makeText(a.c.getApplicationContext(), a.c.getString(0x7f080288), 0).show();
            a.b.setClickable(true);
            a.b.setText(a.c.getString(0x7f080284));
            a.b.setBackgroundResource(0x7f020641);
            return;
        }
    }
}
