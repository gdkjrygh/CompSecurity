// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.zzl;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

class zzRp
    implements com.google.android.gms.common.api.cks
{

    final CastRemoteDisplayLocalService zzRp;

    public void onConnected(Bundle bundle)
    {
        CastRemoteDisplayLocalService.zzln().zzb("onConnected", new Object[0]);
        CastRemoteDisplayLocalService.zzf(zzRp);
    }

    public void onConnectionSuspended(int i)
    {
        CastRemoteDisplayLocalService.zzln().zzf(String.format("ConnectionSuspended %d", new Object[] {
            Integer.valueOf(i)
        }), new Object[0]);
    }

    Callbacks(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
