// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            atr, Main

class _n
    implements android.content.DialogInterface.OnClickListener
{

    final Main a;

    _n(Main main)
    {
        a = main;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        atr.f();
        a.removeDialog(0);
        Main.a(a);
    }
}
