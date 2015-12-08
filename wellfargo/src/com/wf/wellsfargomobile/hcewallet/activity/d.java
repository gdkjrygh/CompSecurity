// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPayNowActivity

class d extends BroadcastReceiver
{

    final WalletPayNowActivity a;

    d(WalletPayNowActivity walletpaynowactivity)
    {
        a = walletpaynowactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.c();
    }
}
