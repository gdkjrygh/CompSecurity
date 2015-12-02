// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            DeleteAccount

class auq
    implements android.content.DialogInterface.OnClickListener
{

    final DeleteAccount a;

    auq(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(109);
    }
}
