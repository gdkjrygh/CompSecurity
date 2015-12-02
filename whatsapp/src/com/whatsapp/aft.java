// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class aft
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final Runnable b;
    final AccountInfoActivity c;

    aft(AccountInfoActivity accountinfoactivity, int i, Runnable runnable)
    {
        c = accountinfoactivity;
        a = i;
        b = runnable;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        c.removeDialog(a);
        if (b != null)
        {
            b.run();
        }
    }
}
