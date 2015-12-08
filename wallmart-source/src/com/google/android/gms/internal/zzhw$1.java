// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzhw

class zzHS
    implements android.content.nterface.OnClickListener
{

    final String zzHS;
    final zzhw zzHT;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzhw.zza(zzHT).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzHS), "Share via"));
    }

    Listener(zzhw zzhw1, String s)
    {
        zzHT = zzhw1;
        zzHS = s;
        super();
    }
}
