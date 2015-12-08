// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh, zzgu, zzgo, zzgp, 
//            zzgq, zzdy, zzdx, zzha

public class zzgv extends zzhh
    implements zzgu
{

    private final Context mContext;
    private final zzha.zza zzBs;
    private final String zzEO;
    private final ArrayList zzFe = new ArrayList();
    private final ArrayList zzFf = new ArrayList();
    private final HashSet zzFg = new HashSet();
    private final zzgo zzFh;
    private final Object zzqt = new Object();

    public zzgv(Context context, String s, zzha.zza zza1, zzgo zzgo1)
    {
        mContext = context;
        zzEO = s;
        zzBs = zza1;
        zzFh = zzgo1;
    }

    static zzgo zza(zzgv zzgv1)
    {
        return zzgv1.zzFh;
    }

    private void zzj(String s, String s1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzgp zzgp1 = zzFh.zzao(s);
        if (zzgp1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (zzgp1.zzfN() != null && zzgp1.zzfM() != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s1 = new zzgq(mContext, s, zzEO, s1, zzBs, zzgp1, this);
        zzFe.add(s1.zzgi());
        zzFf.add(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void onStop()
    {
    }

    public void zzap(String s)
    {
        synchronized (zzqt)
        {
            zzFg.add(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzb(String s, int i)
    {
    }

    public void zzdP()
    {
        int i;
        for (Iterator iterator = zzBs.zzFm.zzxD.iterator(); iterator.hasNext();)
        {
            Object obj3 = (zzdx)iterator.next();
            String s = ((zzdx) (obj3)).zzxz;
            obj3 = ((zzdx) (obj3)).zzxu.iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                zzj((String)((Iterator) (obj3)).next(), s);
            }
        }

        i = 0;
_L2:
        if (i >= zzFe.size())
        {
            break MISSING_BLOCK_LABEL_371;
        }
        ((Future)zzFe.get(i)).get();
label0:
        {
            synchronized (zzqt)
            {
                if (!zzFg.contains(zzFf.get(i)))
                {
                    break label0;
                }
                Object obj2 = (String)zzFf.get(i);
                obj2 = new zzha(zzBs.zzFr.zzCm, null, zzBs.zzFs.zzxF, -2, zzBs.zzFs.zzxG, zzBs.zzFs.zzCM, zzBs.zzFs.orientation, zzBs.zzFs.zzxJ, zzBs.zzFr.zzCp, zzBs.zzFs.zzCK, (zzdx)zzBs.zzFm.zzxD.get(i), null, ((String) (obj2)), zzBs.zzFm, null, zzBs.zzFs.zzCL, zzBs.zzpN, zzBs.zzFs.zzCJ, zzBs.zzFo, zzBs.zzFs.zzCO, zzBs.zzFs.zzCP, zzBs.zzFl, null, zzBs.zzFr.zzCC);
                zza.zzGF.post(new Runnable(((zzha) (obj2))) {

                    final zzgv zzFi;
                    final zzha zzpd;

                    public void run()
                    {
                        com.google.android.gms.internal.zzgv.zza(zzFi).zzb(zzpd);
                    }

            
            {
                zzFi = zzgv.this;
                zzpd = zzha1;
                super();
            }
                });
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_565;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        zzha zzha1 = new zzha(zzBs.zzFr.zzCm, null, zzBs.zzFs.zzxF, 3, zzBs.zzFs.zzxG, zzBs.zzFs.zzCM, zzBs.zzFs.orientation, zzBs.zzFs.zzxJ, zzBs.zzFr.zzCp, zzBs.zzFs.zzCK, null, null, null, zzBs.zzFm, null, zzBs.zzFs.zzCL, zzBs.zzpN, zzBs.zzFs.zzCJ, zzBs.zzFo, zzBs.zzFs.zzCO, zzBs.zzFs.zzCP, zzBs.zzFl, null, zzBs.zzFr.zzCC);
        zza.zzGF.post(new Runnable(zzha1) {

            final zzgv zzFi;
            final zzha zzpd;

            public void run()
            {
                com.google.android.gms.internal.zzgv.zza(zzFi).zzb(zzpd);
            }

            
            {
                zzFi = zzgv.this;
                zzpd = zzha1;
                super();
            }
        });
        return;
        zzha1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
