// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifyNumber

class _a
    implements android.content.DialogInterface.OnClickListener
{

    final VerifyNumber a;

    _a(VerifyNumber verifynumber)
    {
        a = verifynumber;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(109);
    }
}
