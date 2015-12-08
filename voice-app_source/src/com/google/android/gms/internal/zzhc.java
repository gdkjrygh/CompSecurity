// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzhd, zzbz, zzbv, 
//            zzlk, zzbj, zzbi, zzbk, 
//            zzgc, zzhf, zzhb, zzhe, 
//            zzhj, zzay, zzdt, zzca, 
//            zzcc, zzcb

public class zzhc
    implements zzhj.zzb
{

    private Context mContext;
    private boolean zzEd;
    private boolean zzEe;
    private final String zzFE;
    private final zzhd zzFF;
    private BigInteger zzFG;
    private final HashSet zzFH = new HashSet();
    private final HashMap zzFI = new HashMap();
    private boolean zzFJ;
    private int zzFK;
    private zzcb zzFL;
    private zzbk zzFM;
    private final LinkedList zzFN = new LinkedList();
    private Boolean zzFO;
    private String zzFP;
    private VersionInfoParcel zzoM;
    private zzay zzop;
    private boolean zzpb;
    private final Object zzqt = new Object();
    private zzbj zzrw;
    private zzbi zzrx;
    private final zzgc zzry = null;

    public zzhc(zzhl zzhl1)
    {
        zzFG = BigInteger.ONE;
        zzFJ = false;
        zzEd = true;
        zzFK = 0;
        zzpb = false;
        zzFL = null;
        zzEe = true;
        zzrw = null;
        zzFM = null;
        zzrx = null;
        zzFO = null;
        zzFE = zzhl1.zzgn();
        zzFF = new zzhd(zzFE);
    }

    public String getSessionId()
    {
        return zzFE;
    }

    public void zzA(boolean flag)
    {
        synchronized (zzqt)
        {
            zzEe = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzbk zzD(Context context)
    {
label0:
        {
            if (!((Boolean)zzbz.zzuc.get()).booleanValue() || !zzlk.zzoU() || zzfV())
            {
                return null;
            }
            synchronized (zzqt)
            {
                if (zzrw != null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                if (context instanceof Activity)
                {
                    break label0;
                }
            }
            return null;
        }
        zzrw = new zzbj((Application)context.getApplicationContext(), (Activity)context);
        if (zzrx == null)
        {
            zzrx = new zzbi();
        }
        if (zzFM == null)
        {
            zzFM = new zzbk(zzrw, zzrx, new zzgc(mContext, zzoM, null, null));
        }
        zzFM.zzcp();
        context = zzFM;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public Bundle zza(Context context, zzhe zzhe1, String s)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", zzFF.zzd(context, s));
        context = new Bundle();
        String s1;
        for (s = zzFI.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((zzhf)zzFI.get(s1)).toBundle()))
        {
            s1 = (String)s.next();
        }

        break MISSING_BLOCK_LABEL_105;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        bundle.putBundle("slots", context);
        context = new ArrayList();
        for (s = zzFH.iterator(); s.hasNext(); context.add(((zzhb)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        zzhe1.zza(zzFH);
        zzFH.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public Future zza(Context context, boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (flag == zzEd)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        zzEd = flag;
        context = zzhj.zza(context, flag);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(zzhb zzhb1)
    {
        synchronized (zzqt)
        {
            zzFH.add(zzhb1);
        }
        return;
        zzhb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhb1;
    }

    public void zza(String s, zzhf zzhf1)
    {
        synchronized (zzqt)
        {
            zzFI.put(s, zzhf1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(Thread thread)
    {
        com.google.android.gms.internal.zzgc.zza(mContext, thread, zzoM);
    }

    public void zzb(Context context, VersionInfoParcel versioninfoparcel)
    {
        synchronized (zzqt)
        {
            if (!zzpb)
            {
                mContext = context.getApplicationContext();
                zzoM = versioninfoparcel;
                zzhj.zza(context, this);
                com.google.android.gms.internal.zzhj.zzb(context, this);
                zza(Thread.currentThread());
                zzFP = zzo.zzbv().zzf(context, versioninfoparcel.zzGG);
                zzop = new zzay(context.getApplicationContext(), zzoM, new zzdt(context.getApplicationContext(), zzoM, (String)zzbz.zztD.get()));
                zzgf();
                zzpb = true;
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzb(Boolean boolean1)
    {
        synchronized (zzqt)
        {
            zzFO = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    public void zzb(HashSet hashset)
    {
        synchronized (zzqt)
        {
            zzFH.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    public String zzc(int i, String s)
    {
        Resources resources;
        if (zzoM.zzGJ)
        {
            resources = mContext.getResources();
        } else
        {
            resources = GooglePlayServicesUtil.getRemoteResource(mContext);
        }
        if (resources == null)
        {
            return s;
        } else
        {
            return resources.getString(i);
        }
    }

    public void zzc(Bundle bundle)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!bundle.containsKey("use_https")) goto _L2; else goto _L1
_L1:
        boolean flag = bundle.getBoolean("use_https");
_L5:
        zzEd = flag;
        if (!bundle.containsKey("webview_cache_version")) goto _L4; else goto _L3
_L3:
        int i = bundle.getInt("webview_cache_version");
_L6:
        zzFK = i;
        return;
_L2:
        flag = zzEd;
          goto _L5
_L4:
        i = zzFK;
          goto _L6
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
          goto _L5
    }

    public void zzc(Throwable throwable, boolean flag)
    {
        (new zzgc(mContext, zzoM, null, null)).zza(throwable, flag);
    }

    public boolean zzfV()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzEe;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzfW()
    {
        String s;
        synchronized (zzqt)
        {
            s = zzFG.toString();
            zzFG = zzFG.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzhd zzfX()
    {
        zzhd zzhd1;
        synchronized (zzqt)
        {
            zzhd1 = zzFF;
        }
        return zzhd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzcb zzfY()
    {
        zzcb zzcb;
        synchronized (zzqt)
        {
            zzcb = zzFL;
        }
        return zzcb;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzfZ()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzFJ;
            zzFJ = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzga()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzEd;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzgb()
    {
        String s;
        synchronized (zzqt)
        {
            s = zzFP;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean zzgc()
    {
        Boolean boolean1;
        synchronized (zzqt)
        {
            boolean1 = zzFO;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzay zzgd()
    {
        return zzop;
    }

    public boolean zzge()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzFK >= ((Integer)zzbz.zzup.get()).intValue())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzFK = ((Integer)zzbz.zzup.get()).intValue();
        zzhj.zza(mContext, zzFK);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzgf()
    {
        zzca zzca1 = new zzca();
        zzca1.zzb(mContext, zzoM.zzGG);
        try
        {
            zzFL = zzo.zzbA().zza(zzca1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot initialize CSI reporter.", illegalargumentexception);
        }
    }
}
