// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zza, zze

static final class zzari extends zza
{

    private final com.google.android.gms.common.api.zzj zzari;

    public void zzj(int i, Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        } else
        {
            bundle = null;
        }
        bundle = new Status(i, null, bundle);
        zzari.zzj(bundle);
    }

    public (com.google.android.gms.common.api.zf zf)
    {
        zzari = zf;
    }
}
