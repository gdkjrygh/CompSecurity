// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            EULA

class l6
    implements android.content.DialogInterface.OnCancelListener
{

    final EULA a;

    l6(EULA eula)
    {
        a = eula;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.removeDialog(5);
        a.showDialog(6);
    }
}
