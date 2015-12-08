// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.content.DialogInterface;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class h
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final PayActivity b;

    h(PayActivity payactivity, boolean flag)
    {
        b = payactivity;
        a = flag;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a)
        {
            b.finish();
        }
    }
}
