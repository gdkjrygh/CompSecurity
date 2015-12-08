// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPayNowActivity

class h
    implements android.view.View.OnClickListener
{

    final WalletPayNowActivity a;

    h(WalletPayNowActivity walletpaynowactivity)
    {
        a = walletpaynowactivity;
        super();
    }

    public void onClick(View view)
    {
        WalletPayNowActivity.c(a, "WH");
    }
}
