// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.view.View;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class g
    implements android.view.View.OnClickListener
{

    final PayActivity a;

    g(PayActivity payactivity)
    {
        a = payactivity;
        super();
    }

    public void onClick(View view)
    {
        PayActivity.a(a, null);
        if (PayActivity.d(a))
        {
            PayActivity.n(a);
            return;
        } else
        {
            PayActivity.g(a);
            return;
        }
    }
}
