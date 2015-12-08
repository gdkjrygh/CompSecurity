// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class d
    implements android.content.DialogInterface.OnKeyListener
{

    final BillingActivity a;

    d(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            BillingActivity.c(a).dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
