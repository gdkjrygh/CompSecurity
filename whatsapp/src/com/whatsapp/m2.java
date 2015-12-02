// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            m7

final class m2
    implements android.content.DialogInterface.OnDismissListener
{

    m2()
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        m7.c(System.currentTimeMillis());
    }
}
