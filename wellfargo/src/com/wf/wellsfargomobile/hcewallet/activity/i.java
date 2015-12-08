// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.View;
import com.wf.wellsfargomobile.WFApp;
import java.util.UUID;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPayNowActivity

class i
    implements android.view.View.OnClickListener
{

    final WalletPayNowActivity a;

    i(WalletPayNowActivity walletpaynowactivity)
    {
        a = walletpaynowactivity;
        super();
    }

    public void onClick(View view)
    {
        String s = WFApp.o();
        view = s;
        if (s == null)
        {
            WFApp.d(UUID.randomUUID().toString());
            view = WFApp.o();
        }
        a.a(view);
    }
}
