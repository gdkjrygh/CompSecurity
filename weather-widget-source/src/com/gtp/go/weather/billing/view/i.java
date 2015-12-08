// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class i
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final PayActivity b;

    i(PayActivity payactivity, boolean flag)
    {
        b = payactivity;
        a = flag;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(PayActivity.a(b, "http://market.android.com/support/bin/answer.py?answer=1050566&hl=%lang%&dl=%region%")));
        dialoginterface.addFlags(0x10000000);
        b.startActivity(dialoginterface);
        if (a)
        {
            b.finish();
        }
    }
}
