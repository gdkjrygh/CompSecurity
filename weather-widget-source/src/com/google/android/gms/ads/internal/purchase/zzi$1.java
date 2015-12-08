// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.zzhl;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzb

class zzrn
    implements ServiceConnection
{

    final zzi zzCn;
    final Context zzrn;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        boolean flag = false;
        componentname = new zzb(zzrn.getApplicationContext(), false);
        componentname.zzM(ibinder);
        int i = componentname.zza(3, zzrn.getPackageName(), "inapp");
        ibinder = zzp.zzbA();
        if (i == 0)
        {
            flag = true;
        }
        ibinder.zzB(flag);
        zzrn.unbindService(this);
        componentname.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    (zzi zzi1, Context context)
    {
        zzCn = zzi1;
        zzrn = context;
        super();
    }
}
