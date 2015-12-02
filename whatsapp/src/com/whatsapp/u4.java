// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            RegisterPhone

class u4
    implements android.content.DialogInterface.OnClickListener
{

    final RegisterPhone a;

    u4(RegisterPhone registerphone)
    {
        a = registerphone;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(22);
    }
}
