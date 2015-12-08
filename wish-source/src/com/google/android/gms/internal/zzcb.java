// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzcd, zzcc, zzfl, 
//            zzgd

public class zzcb extends zzfh
{

    final zzgd zznp;
    final zzcd zztM;
    private final String zztN;

    zzcb(zzgd zzgd, String s)
    {
        zznp = zzgd;
        zztM = new zzcd(zzgd);
        zztN = s;
        zzh.zzbb().zza(this);
    }

    public void onStop()
    {
        zztM.abort();
    }

    public void zzcX()
    {
        zztM.zzI(zztN);
        zzfl.zzCr.post(new Runnable() {

            final zzcb zztO;

            public void run()
            {
                zzh.zzbb().zzb(zztO);
            }

            
            {
                zztO = zzcb.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        zzfl.zzCr.post(new _cls1());
        throw exception;
    }
}
