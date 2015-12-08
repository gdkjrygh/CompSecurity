// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService, CastDevice

static final class zzRt
    implements ServiceConnection
{

    final String zzQC;
    final CastDevice zzRq;
    final tificationSettings zzRr;
    final Context zzRs;
    final llbacks zzRt;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = ((a)ibinder).zzlp();
        if (componentname != null)
        {
            CastRemoteDisplayLocalService.zza(componentname, zzQC, zzRq, zzRr, zzRs, this, zzRt);
            return;
        } else
        {
            CastRemoteDisplayLocalService.zzln().zzc("Connected but unable to get the service instance", new Object[0]);
            zzRt.onRemoteDisplaySessionError(new Status(2200));
            CastRemoteDisplayLocalService.zzlo().set(false);
            zzRs.unbindService(this);
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        CastRemoteDisplayLocalService.zzln().zzb("onServiceDisconnected", new Object[0]);
        zzRt.onRemoteDisplaySessionError(new Status(2201, "Service Disconnected"));
        CastRemoteDisplayLocalService.zzlo().set(false);
        zzRs.unbindService(this);
    }

    llbacks(String s, CastDevice castdevice, tificationSettings tificationsettings, Context context, llbacks llbacks)
    {
        zzQC = s;
        zzRq = castdevice;
        zzRr = tificationsettings;
        zzRs = context;
        zzRt = llbacks;
        super();
    }
}
