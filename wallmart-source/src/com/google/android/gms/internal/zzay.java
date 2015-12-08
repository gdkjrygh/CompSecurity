// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzhj, zzip, zzaz, 
//            zzdv

public class zzay
    implements zzba
{

    private final VersionInfoParcel zzpa;
    private final Object zzpc = new Object();
    private final WeakHashMap zzqM = new WeakHashMap();
    private final ArrayList zzqN = new ArrayList();
    private final Context zzqO;
    private final zzdv zzqP;

    public zzay(Context context, VersionInfoParcel versioninfoparcel, zzdv zzdv)
    {
        zzqO = context.getApplicationContext();
        zzpa = versioninfoparcel;
        zzqP = zzdv;
    }

    public zzaz zza(AdSizeParcel adsizeparcel, zzhj zzhj1)
    {
        return zza(adsizeparcel, zzhj1, ((View) (zzhj1.zzAR.getWebView())));
    }

    public zzaz zza(AdSizeParcel adsizeparcel, zzhj zzhj1, View view)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!zzd(zzhj1))
                {
                    break label0;
                }
                adsizeparcel = (zzaz)zzqM.get(zzhj1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new zzaz(adsizeparcel, zzhj1, zzpa, view, zzqP);
        adsizeparcel.zza(this);
        zzqM.put(zzhj1, adsizeparcel);
        zzqN.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzaz zzaz1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaz1.zzcd())
        {
            zzqN.remove(zzaz1);
            Iterator iterator = zzqM.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == zzaz1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        zzaz1;
        obj;
        JVM INSTR monitorexit ;
        throw zzaz1;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean zzd(zzhj zzhj1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzhj1 = (zzaz)zzqM.get(zzhj1);
        if (zzhj1 == null) goto _L2; else goto _L1
_L1:
        if (!zzhj1.zzcd()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        zzhj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhj1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zze(zzhj zzhj1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzhj1 = (zzaz)zzqM.get(zzhj1);
        if (zzhj1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhj1.zzcb();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhj1;
    }

    public void zzf(zzhj zzhj1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzhj1 = (zzaz)zzqM.get(zzhj1);
        if (zzhj1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhj1.stop();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhj1;
    }

    public void zzg(zzhj zzhj1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzhj1 = (zzaz)zzqM.get(zzhj1);
        if (zzhj1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhj1.pause();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhj1;
    }

    public void zzh(zzhj zzhj1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzhj1 = (zzaz)zzqM.get(zzhj1);
        if (zzhj1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhj1.resume();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhj1;
    }
}
