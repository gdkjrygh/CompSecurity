// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber

class a95
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final EnterPhoneNumber b;

    a95(EnterPhoneNumber enterphonenumber, String s)
    {
        b = enterphonenumber;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(22);
        b.b(a);
    }
}
