// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            OverlayAlert, Main

class ta
    implements android.content.DialogInterface.OnClickListener
{

    final Main a;

    ta(Main main)
    {
        a = main;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        OverlayAlert.a(a);
        a.removeDialog(1);
        a.finish();
    }
}
