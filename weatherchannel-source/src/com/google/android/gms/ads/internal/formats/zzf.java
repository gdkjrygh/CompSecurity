// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzkw;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzg, zza

public class zzf extends com.google.android.gms.internal.zzcs.zza
    implements zzg.zza
{

    private final Object zzqt = new Object();
    private final zza zzvp;
    private zzg zzvq;
    private final String zzvt;
    private final zzkw zzvu;
    private final zzkw zzvv;

    public zzf(String s, zzkw zzkw1, zzkw zzkw2, zza zza1)
    {
        zzvt = s;
        zzvu = zzkw1;
        zzvv = zzkw2;
        zzvp = zza1;
    }

    public List getAvailableAssetNames()
    {
        boolean flag = false;
        String as[] = new String[zzvu.size() + zzvv.size()];
        int j = 0;
        int i = 0;
        int k;
        int l;
        do
        {
            k = ((flag) ? 1 : 0);
            l = i;
            if (j >= zzvu.size())
            {
                break;
            }
            as[i] = (String)zzvu.keyAt(j);
            i++;
            j++;
        } while (true);
        while (k < zzvv.size()) 
        {
            as[l] = (String)zzvv.keyAt(k);
            k++;
            l++;
        }
        return Arrays.asList(as);
    }

    public String getCustomTemplateId()
    {
        return zzvt;
    }

    public void performClick(String s)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzvq != null)
                {
                    break label0;
                }
                zzb.zzaz("Attempt to call performClick before ad initialized.");
            }
            return;
        }
        zzvq.performClick(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void recordImpression()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzvq != null)
                {
                    break label0;
                }
                zzb.zzaz("Attempt to perform recordImpression before ad initialized.");
            }
            return;
        }
        zzvq.recordImpression();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzQ(String s)
    {
        return (String)zzvv.get(s);
    }

    public zzck zzR(String s)
    {
        return (zzck)zzvu.get(s);
    }

    public void zza(zzg zzg1)
    {
        synchronized (zzqt)
        {
            zzvq = zzg1;
        }
        return;
        zzg1;
        obj;
        JVM INSTR monitorexit ;
        throw zzg1;
    }

    public String zzdE()
    {
        return "3";
    }

    public zza zzdF()
    {
        return zzvp;
    }
}
