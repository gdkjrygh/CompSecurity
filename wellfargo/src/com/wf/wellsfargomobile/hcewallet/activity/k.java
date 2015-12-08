// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPinActivity

class k
    implements android.widget.TextView.OnEditorActionListener
{

    final WalletPinActivity a;

    k(WalletPinActivity walletpinactivity)
    {
        a = walletpinactivity;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if ((i == 2 || i == 0) && (keyevent == null || keyevent.getAction() == 0))
        {
            if (WalletPinActivity.b(a).isEnabled())
            {
                WalletPinActivity.a(a, "PN");
            }
            return true;
        } else
        {
            return false;
        }
    }
}
