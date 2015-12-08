// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

class zzRp
    implements com.google.android.gms.common.api.edListener
{

    final CastRemoteDisplayLocalService zzRp;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        CastRemoteDisplayLocalService.zzln().zzc((new StringBuilder()).append("Connection failed: ").append(connectionresult).toString(), new Object[0]);
        CastRemoteDisplayLocalService.zzc(zzRp);
    }

    onFailedListener(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
