// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class c
    implements android.view.View.OnClickListener
{

    final BillingActivity a;

    c(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    public void onClick(View view)
    {
        BillingActivity.c(a).dismiss();
    }
}
