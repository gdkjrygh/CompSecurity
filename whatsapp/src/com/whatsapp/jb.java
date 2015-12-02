// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, AccountInfoActivity, ha

class jb
    implements android.view.View.OnClickListener
{

    final AccountInfoActivity a;

    jb(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onClick(View view)
    {
        int i = App.am;
        if (!AccountInfoActivity.l(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!AccountInfoActivity.i(a))
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.a(a, AccountInfoActivity.c(a), new ha(this));
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (!AccountInfoActivity.d(a))
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.n(a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        a.showDialog(9);
        return;
    }
}
