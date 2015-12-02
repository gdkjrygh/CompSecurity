// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifySms

class il
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final VerifySms b;

    il(VerifySms verifysms, int i)
    {
        b = verifysms;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(a);
        VerifySms.z(b);
    }
}
