// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPayNowActivity

class g
    implements android.view.View.OnClickListener
{

    final String a;
    final WalletPayNowActivity b;

    g(WalletPayNowActivity walletpaynowactivity, String s)
    {
        b = walletpaynowactivity;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        WalletPayNowActivity.c(b, a);
    }
}
