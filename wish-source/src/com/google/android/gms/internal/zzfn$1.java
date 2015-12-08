// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzfn

class zzCz
    implements android.content.nterface.OnClickListener
{

    final zzfn zzCA;
    final String zzCz;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzfn.zza(zzCA).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzCz), "Share via"));
    }

    Listener(zzfn zzfn1, String s)
    {
        zzCA = zzfn1;
        zzCz = s;
        super();
    }
}
