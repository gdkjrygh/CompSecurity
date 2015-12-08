// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzgb, zzip, zziq, zzhu

class zzCJ
    implements Runnable
{

    final zzgb zzCJ;

    public void run()
    {
label0:
        {
            synchronized (zzCJ.zzpc)
            {
                if (zzCJ.zzCG.errorCode == -2)
                {
                    break label0;
                }
            }
            return;
        }
        zzCJ.zzoL.zzgS().zza(zzCJ);
        zzCJ.zzfp();
        zzb.v("Loading HTML in WebView.");
        zzCJ.zzoL.loadDataWithBaseURL(zzp.zzbx().zzaw(zzCJ.zzCG.zzAT), zzCJ.zzCG.body, "text/html", "UTF-8", null);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzgb zzgb1)
    {
        zzCJ = zzgb1;
        super();
    }
}
