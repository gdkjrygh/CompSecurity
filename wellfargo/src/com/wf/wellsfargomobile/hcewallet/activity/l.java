// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.wf.wellsfargomobile.hcewallet.d.i;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPinActivity

class l
    implements TextWatcher
{

    final Button a;
    final WalletPinActivity b;

    l(WalletPinActivity walletpinactivity, Button button)
    {
        b = walletpinactivity;
        a = button;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
    }

    public void onTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
        if (WalletPinActivity.c(b).getText().toString().length() >= 4)
        {
            a.setEnabled(true);
            a.setBackgroundResource(0x7f02007d);
            if (i.isNfcEnabled(b))
            {
                WalletPinActivity.b(b).setEnabled(true);
                WalletPinActivity.b(b).setBackgroundResource(0x7f02007a);
                return;
            } else
            {
                WalletPinActivity.b(b).setEnabled(false);
                WalletPinActivity.b(b).setBackgroundResource(0x7f02007b);
                return;
            }
        } else
        {
            a.setEnabled(false);
            WalletPinActivity.b(b).setEnabled(false);
            WalletPinActivity.b(b).setBackgroundResource(0x7f02007b);
            a.setBackgroundResource(0x7f02007e);
            return;
        }
    }
}
