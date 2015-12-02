// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity, hr, App

class qw
    implements android.view.View.OnClickListener
{

    final AccountInfoActivity a;

    qw(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onClick(View view)
    {
        if (!AccountInfoActivity.l(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!AccountInfoActivity.i(a))
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.a(a, AccountInfoActivity.c(a), new hr(this));
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        AccountInfoActivity.h(a);
        return;
    }
}
