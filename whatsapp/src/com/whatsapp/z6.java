// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifySms

class z6
    implements android.content.DialogInterface.OnClickListener
{

    final VerifySms a;
    final int b;

    z6(VerifySms verifysms, int i)
    {
        a = verifysms;
        b = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(b);
        VerifySms.z(a);
    }
}
