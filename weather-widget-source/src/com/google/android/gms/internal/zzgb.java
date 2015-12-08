// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzfw, zzhu, zzip, zziq

public class zzgb extends zzfw
{

    zzgb(Context context, zzhj.zza zza, zzip zzip, zzga.zza zza1)
    {
        super(context, zza, zzip, zza1);
    }

    protected void zzfp()
    {
    }

    protected void zzh(long l)
        throws zzfz.zza
    {
        zzhu.zzHK.post(new Runnable() {

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

            
            {
                zzCJ = zzgb.this;
                super();
            }
        });
        zzg(l);
    }
}
