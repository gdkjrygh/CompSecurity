// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzfz, zzdy, zzee, zzhj, 
//            zzcd, zzeh, zzea, zzip

public class zzgd extends zzfz
{

    private zzdy zzCN;
    protected zzee zzCO;
    private final zzcd zzon;
    private zzeh zzow;
    private zzea zzye;

    zzgd(Context context, zzhj.zza zza, zzip zzip, zzeh zzeh, zzga.zza zza1, zzcd zzcd)
    {
        super(context, zza, zzip, zza1);
        zzow = zzeh;
        zzye = zza.zzGG;
        zzon = zzcd;
    }

    public void onStop()
    {
        synchronized (zzCE)
        {
            super.onStop();
            if (zzCN != null)
            {
                zzCN.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzh(long l)
        throws zzfz.zza
    {
        synchronized (zzCE)
        {
            zzCN = new zzdy(mContext, zzCF.zzGL, zzow, zzye, zzCG.zzsJ);
        }
        zzCO = zzCN.zza(l, 60000L, zzon);
        switch (zzCO.zzyP)
        {
        default:
            throw new zzfz.zza((new StringBuilder()).append("Unexpected mediation result: ").append(zzCO.zzyP).toString(), 0);

        case 1: // '\001'
            throw new zzfz.zza("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected zzhj zzz(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = zzCF.zzGL;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.zzDy;
        zzip zzip = zzoL;
        java.util.List list = zzCG.zzyw;
        java.util.List list1 = zzCG.zzyx;
        java.util.List list2 = zzCG.zzDZ;
        int j = zzCG.orientation;
        long l = zzCG.zzyA;
        String s1 = adrequestinfoparcel.zzDB;
        boolean flag = zzCG.zzDX;
        zzdz zzdz;
        zzei zzei;
        String s;
        zzec zzec;
        zzea zzea;
        if (zzCO != null)
        {
            zzdz = zzCO.zzyQ;
        } else
        {
            zzdz = null;
        }
        if (zzCO != null)
        {
            zzei = zzCO.zzyR;
        } else
        {
            zzei = null;
        }
        if (zzCO != null)
        {
            s = zzCO.zzyS;
        } else
        {
            s = com/google/ads/mediation/admob/AdMobAdapter.getName();
        }
        zzea = zzye;
        if (zzCO != null)
        {
            zzec = zzCO.zzyT;
        } else
        {
            zzec = null;
        }
        return new zzhj(adrequestparcel, zzip, list, i, list1, list2, j, l, s1, flag, zzdz, zzei, s, zzea, zzec, zzCG.zzDY, zzCF.zzqf, zzCG.zzDW, zzCF.zzGI, zzCG.zzEb, zzCG.zzEc, zzCF.zzGF, null, adrequestinfoparcel.zzDO);
    }
}
