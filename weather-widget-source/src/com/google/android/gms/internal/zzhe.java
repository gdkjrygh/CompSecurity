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
//            zzhq, zzhd, zzgx, zzgy, 
//            zzgz, zzea, zzdz, zzhj

public class zzhe extends zzhq
    implements zzhd
{

    private final Context mContext;
    private final zzhj.zza zzCF;
    private final HashSet zzGA = new HashSet();
    private final zzgx zzGB;
    private final String zzGh;
    private final ArrayList zzGy = new ArrayList();
    private final ArrayList zzGz = new ArrayList();
    private final Object zzpc = new Object();

    public zzhe(Context context, String s, zzhj.zza zza1, zzgx zzgx1)
    {
        mContext = context;
        zzGh = s;
        zzCF = zza1;
        zzGB = zzgx1;
    }

    static zzgx zza(zzhe zzhe1)
    {
        return zzhe1.zzGB;
    }

    private void zzk(String s, String s1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzgy zzgy1 = zzGB.zzar(s);
        if (zzgy1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (zzgy1.zzfR() != null && zzgy1.zzfQ() != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s1 = new zzgz(mContext, s, zzGh, s1, zzCF, zzgy1, this);
        zzGy.add(s1.zzgn());
        zzGz.add(s);
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

    public void zzas(String s)
    {
        synchronized (zzpc)
        {
            zzGA.add(s);
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

    public void zzdG()
    {
        int i;
        for (Iterator iterator = zzCF.zzGG.zzyu.iterator(); iterator.hasNext();)
        {
            Object obj3 = (zzdz)iterator.next();
            String s = ((zzdz) (obj3)).zzyr;
            obj3 = ((zzdz) (obj3)).zzym.iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                zzk((String)((Iterator) (obj3)).next(), s);
            }
        }

        i = 0;
_L2:
        if (i >= zzGy.size())
        {
            break MISSING_BLOCK_LABEL_371;
        }
        ((Future)zzGy.get(i)).get();
label0:
        {
            synchronized (zzpc)
            {
                if (!zzGA.contains(zzGz.get(i)))
                {
                    break label0;
                }
                Object obj2 = (String)zzGz.get(i);
                obj2 = new zzhj(zzCF.zzGL.zzDy, null, zzCF.zzGM.zzyw, -2, zzCF.zzGM.zzyx, zzCF.zzGM.zzDZ, zzCF.zzGM.orientation, zzCF.zzGM.zzyA, zzCF.zzGL.zzDB, zzCF.zzGM.zzDX, (zzdz)zzCF.zzGG.zzyu.get(i), null, ((String) (obj2)), zzCF.zzGG, null, zzCF.zzGM.zzDY, zzCF.zzqf, zzCF.zzGM.zzDW, zzCF.zzGI, zzCF.zzGM.zzEb, zzCF.zzGM.zzEc, zzCF.zzGF, null, zzCF.zzGL.zzDO);
                zza.zzIy.post(new Runnable(((zzhj) (obj2))) {

                    final zzhe zzGC;
                    final zzhj zzpx;

                    public void run()
                    {
                        com.google.android.gms.internal.zzhe.zza(zzGC).zzb(zzpx);
                    }

            
            {
                zzGC = zzhe.this;
                zzpx = zzhj1;
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
        zzhj zzhj1 = new zzhj(zzCF.zzGL.zzDy, null, zzCF.zzGM.zzyw, 3, zzCF.zzGM.zzyx, zzCF.zzGM.zzDZ, zzCF.zzGM.orientation, zzCF.zzGM.zzyA, zzCF.zzGL.zzDB, zzCF.zzGM.zzDX, null, null, null, zzCF.zzGG, null, zzCF.zzGM.zzDY, zzCF.zzqf, zzCF.zzGM.zzDW, zzCF.zzGI, zzCF.zzGM.zzEb, zzCF.zzGM.zzEc, zzCF.zzGF, null, zzCF.zzGL.zzDO);
        zza.zzIy.post(new Runnable(zzhj1) {

            final zzhe zzGC;
            final zzhj zzpx;

            public void run()
            {
                com.google.android.gms.internal.zzhe.zza(zzGC).zzb(zzpx);
            }

            
            {
                zzGC = zzhe.this;
                zzpx = zzhj1;
                super();
            }
        });
        return;
        zzhj1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
