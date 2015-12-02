// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class alt
    implements android.content.DialogInterface.OnClickListener
{

    final AccountInfoActivity a;
    final int b;

    alt(AccountInfoActivity accountinfoactivity, int i)
    {
        a = accountinfoactivity;
        b = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(b);
    }
}
