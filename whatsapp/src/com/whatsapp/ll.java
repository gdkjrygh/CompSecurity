// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber, RegisterPhone

class ll
    implements android.content.DialogInterface.OnClickListener
{

    final RegisterPhone a;

    ll(RegisterPhone registerphone)
    {
        a = registerphone;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        EnterPhoneNumber.y = 0;
        a.removeDialog(21);
    }
}
