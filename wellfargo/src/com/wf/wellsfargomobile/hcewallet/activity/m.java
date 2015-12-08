// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPinActivity

class m
    implements Runnable
{

    final WalletPinActivity a;

    m(WalletPinActivity walletpinactivity)
    {
        a = walletpinactivity;
        super();
    }

    public void run()
    {
        ((InputMethodManager)a.getSystemService("input_method")).showSoftInput(WalletPinActivity.c(a), 1);
        WalletPinActivity.c(a).requestFocus();
    }
}
