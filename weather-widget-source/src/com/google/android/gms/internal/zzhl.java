// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
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
//            zzhu, zzhm, zzby, zzbu, 
//            zzlv, zzbj, zzbi, zzbk, 
//            zzgj, zzho, zzhk, zzhn, 
//            zzhs, zzay, zzdv, zzbz, 
//            zzcb, zzca

public class zzhl
    implements zzhs.zzb
{

    private Context mContext;
    private boolean zzFr;
    private boolean zzFs;
    private final String zzGY;
    private final zzhm zzGZ;
    private BigInteger zzHa;
    private final HashSet zzHb = new HashSet();
    private final HashMap zzHc = new HashMap();
    private boolean zzHd;
    private int zzHe;
    private zzca zzHf;
    private zzbk zzHg;
    private final LinkedList zzHh = new LinkedList();
    private Boolean zzHi;
    private String zzHj;
    private boolean zzHk;
    private zzay zzou;
    private VersionInfoParcel zzpa;
    private final Object zzpc = new Object();
    private boolean zzpr;
    private zzbj zzrP;
    private zzbi zzrQ;
    private final zzgj zzrR = null;

    public zzhl(zzhu zzhu1)
    {
        zzHa = BigInteger.ONE;
        zzHd = false;
        zzFr = true;
        zzHe = 0;
        zzpr = false;
        zzHf = null;
        zzFs = true;
        zzrP = null;
        zzHg = null;
        zzrQ = null;
        zzHi = null;
        zzHk = false;
        zzGY = zzhu1.zzgs();
        zzGZ = new zzhm(zzGY);
    }

    public String getSessionId()
    {
        return zzGY;
    }

    public void zzA(boolean flag)
    {
        synchronized (zzpc)
        {
            zzFs = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzB(boolean flag)
    {
        synchronized (zzpc)
        {
            zzHk = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzbk zzF(Context context)
    {
label0:
        {
            if (!((Boolean)zzby.zzuE.get()).booleanValue() || !zzlv.zzpR() || zzfZ())
            {
                return null;
            }
            synchronized (zzpc)
            {
                if (zzrP != null)
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
        zzrP = new zzbj((Application)context.getApplicationContext(), (Activity)context);
        if (zzrQ == null)
        {
            zzrQ = new zzbi();
        }
        if (zzHg == null)
        {
            zzHg = new zzbk(zzrP, zzrQ, new zzgj(mContext, zzpa, null, null));
        }
        zzHg.zzct();
        context = zzHg;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public Bundle zza(Context context, zzhn zzhn1, String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", zzGZ.zze(context, s));
        context = new Bundle();
        String s1;
        for (s = zzHc.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((zzho)zzHc.get(s1)).toBundle()))
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
        for (s = zzHb.iterator(); s.hasNext(); context.add(((zzhk)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        zzhn1.zza(zzHb);
        zzHb.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public Future zza(Context context, boolean flag)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (flag == zzFr)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        zzFr = flag;
        context = zzhs.zza(context, flag);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(zzhk zzhk1)
    {
        synchronized (zzpc)
        {
            zzHb.add(zzhk1);
        }
        return;
        zzhk1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhk1;
    }

    public void zza(String s, zzho zzho1)
    {
        synchronized (zzpc)
        {
            zzHc.put(s, zzho1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(Thread thread)
    {
        com.google.android.gms.internal.zzgj.zza(mContext, thread, zzpa);
    }

    public void zzb(Context context, VersionInfoParcel versioninfoparcel)
    {
        synchronized (zzpc)
        {
            if (!zzpr)
            {
                mContext = context.getApplicationContext();
                zzpa = versioninfoparcel;
                zzhs.zza(context, this);
                com.google.android.gms.internal.zzhs.zzb(context, this);
                zza(Thread.currentThread());
                zzHj = zzp.zzbx().zzf(context, versioninfoparcel.zzIz);
                zzou = new zzay(context.getApplicationContext(), zzpa, new zzdv(context.getApplicationContext(), zzpa, (String)zzby.zztW.get()));
                zzgk();
                zzp.zzbH().zzy(mContext);
                zzpr = true;
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
        synchronized (zzpc)
        {
            zzHi = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    public void zzb(HashSet hashset)
    {
        synchronized (zzpc)
        {
            zzHb.addAll(hashset);
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
        if (zzpa.zzIC)
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

    public void zzc(Throwable throwable, boolean flag)
    {
        (new zzgj(mContext, zzpa, null, null)).zza(throwable, flag);
    }

    public void zzd(Bundle bundle)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!bundle.containsKey("use_https")) goto _L2; else goto _L1
_L1:
        boolean flag = bundle.getBoolean("use_https");
_L5:
        zzFr = flag;
        if (!bundle.containsKey("webview_cache_version")) goto _L4; else goto _L3
_L3:
        int i = bundle.getInt("webview_cache_version");
_L6:
        zzHe = i;
        return;
_L2:
        flag = zzFr;
          goto _L5
_L4:
        i = zzHe;
          goto _L6
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
          goto _L5
    }

    public boolean zzfZ()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzFs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzga()
    {
        String s;
        synchronized (zzpc)
        {
            s = zzHa.toString();
            zzHa = zzHa.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzhm zzgb()
    {
        zzhm zzhm1;
        synchronized (zzpc)
        {
            zzhm1 = zzGZ;
        }
        return zzhm1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzca zzgc()
    {
        zzca zzca;
        synchronized (zzpc)
        {
            zzca = zzHf;
        }
        return zzca;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzgd()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzHd;
            zzHd = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzge()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzFr;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzgf()
    {
        String s;
        synchronized (zzpc)
        {
            s = zzHj;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean zzgg()
    {
        Boolean boolean1;
        synchronized (zzpc)
        {
            boolean1 = zzHi;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzay zzgh()
    {
        return zzou;
    }

    public boolean zzgi()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzHe >= ((Integer)zzby.zzuS.get()).intValue())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzHe = ((Integer)zzby.zzuS.get()).intValue();
        zzhs.zza(mContext, zzHe);
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

    public boolean zzgj()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzHk;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzgk()
    {
        zzbz zzbz1 = new zzbz(mContext, zzpa.zzIz);
        try
        {
            zzHf = zzp.zzbC().zza(zzbz1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot initialize CSI reporter.", illegalargumentexception);
        }
    }
}
