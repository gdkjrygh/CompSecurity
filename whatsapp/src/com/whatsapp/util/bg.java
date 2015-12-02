// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.CorruptInstallationActivity;

final class bg
    implements Runnable
{

    final Context a;

    bg(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        a.startActivity((new Intent(a, com/whatsapp/CorruptInstallationActivity)).setFlags(0x10000000));
    }
}
