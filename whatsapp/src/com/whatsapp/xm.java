// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.RadioButton;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class xm
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final AccountInfoActivity a;
    private boolean b;

    xm(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        if (flag)
        {
            if (AccountInfoActivity.k(a).getId() != compoundbutton.getId())
            {
                AccountInfoActivity.k(a).setChecked(false);
            }
            if (AccountInfoActivity.m(a).getId() != compoundbutton.getId())
            {
                AccountInfoActivity.m(a).setChecked(false);
            }
            if (AccountInfoActivity.f(a).getId() != compoundbutton.getId())
            {
                AccountInfoActivity.f(a).setChecked(false);
            }
        }
        b = false;
    }
}
