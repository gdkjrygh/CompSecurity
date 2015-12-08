// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzev

class zzzn
    implements android.content.nterface.OnClickListener
{

    final zzev zzzn;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = zzzn.createIntent();
        zzev.zza(zzzn).startActivity(dialoginterface);
    }

    Listener(zzev zzev1)
    {
        zzzn = zzev1;
        super();
    }
}
