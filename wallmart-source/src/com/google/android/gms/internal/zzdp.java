// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzdq, zzdr, zzhu, 
//            zzip

public class zzdp extends zzhq
{

    final zzip zzoL;
    final zzdr zzxr;
    private final String zzxs;

    zzdp(zzip zzip, zzdr zzdr1, String s)
    {
        zzoL = zzip;
        zzxr = zzdr1;
        zzxs = s;
        zzp.zzbK().zza(this);
    }

    public void onStop()
    {
        zzxr.abort();
    }

    public void zzdG()
    {
        zzxr.zzZ(zzxs);
        zzhu.zzHK.post(new Runnable() {

            final zzdp zzxt;

            public void run()
            {
                zzp.zzbK().zzb(zzxt);
            }

            
            {
                zzxt = zzdp.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        zzhu.zzHK.post(new _cls1());
        throw exception;
    }
}
