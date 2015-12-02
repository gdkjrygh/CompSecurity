// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class adl
    implements android.view.View.OnClickListener
{

    final AccountInfoActivity a;

    adl(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onClick(View view)
    {
        a.findViewById(0x7f0b005f).setVisibility(8);
        a.findViewById(0x7f0b005d).setVisibility(0);
        AccountInfoActivity.a(a, null);
    }
}
