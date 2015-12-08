// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzov, zzox

private static final class zzOs extends zzOs
{

    private final com.google.android.gms.common.api. zzOs;

    public void zza(int i, Bundle bundle, int j, Intent intent)
    {
        if (bundle != null)
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        } else
        {
            bundle = null;
        }
        bundle = new Status(i, null, bundle);
        zzOs.zm(new zzox(bundle, intent));
    }

    public (com.google.android.gms.common.api. )
    {
        zzOs = ;
    }
}
