// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.support.v7.media.MediaRouter;
import com.google.android.gms.cast.internal.zzl;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService, CastDevice

class zzRp extends android.support.v7.media.._cls1
{

    final CastRemoteDisplayLocalService zzRp;

    public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.._cls1 _pcls1)
    {
        CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected", new Object[0]);
        if (CastRemoteDisplayLocalService.zza(zzRp) == null)
        {
            CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected, no device was selected", new Object[0]);
            return;
        }
        if (!CastDevice.getFromBundle(_pcls1.zzln()).getDeviceId().equals(CastRemoteDisplayLocalService.zza(zzRp).getDeviceId()))
        {
            CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected, device does not match", new Object[0]);
            return;
        } else
        {
            CastRemoteDisplayLocalService.stopService();
            return;
        }
    }

    A(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
