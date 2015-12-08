// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzj, zzx

public final class zzadK
    implements ServiceConnection
{

    final zzj zzadH;
    private final int zzadK;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzx.zzb(ibinder, "Expecting a valid IBinder");
        zzj.zza(zzadH, zzaK(ibinder));
        zzadH.zzbA(zzadK);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzadH.mHandler.sendMessage(zzadH.mHandler.obtainMessage(4, zzadK, 1));
    }

    public (zzj zzj1, int i)
    {
        zzadH = zzj1;
        super();
        zzadK = i;
    }
}
