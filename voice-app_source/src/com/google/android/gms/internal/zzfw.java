// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzdw, zzec, zzha, 
//            zzef, zzdy, zzid

public class zzfw extends zzfs
{

    private zzdw zzBA;
    protected zzec zzBB;
    private zzef zzoq;
    private zzdy zzxn;

    zzfw(Context context, zzha.zza zza, zzid zzid, zzef zzef, zzft.zza zza1)
    {
        super(context, zza, zzid, zza1);
        zzoq = zzef;
        zzxn = zza.zzFm;
    }

    public void onStop()
    {
        synchronized (zzBr)
        {
            super.onStop();
            if (zzBA != null)
            {
                zzBA.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzh(long l)
        throws zzfs.zza
    {
        synchronized (zzBr)
        {
            zzBA = new zzdw(mContext, zzBs.zzFr, zzoq, zzxn);
        }
        zzBB = zzBA.zza(l, 60000L);
        switch (zzBB.zzxY)
        {
        default:
            throw new zzfs.zza((new StringBuilder()).append("Unexpected mediation result: ").append(zzBB.zzxY).toString(), 0);

        case 1: // '\001'
            throw new zzfs.zza("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected zzha zzz(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = zzBs.zzFr;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.zzCm;
        zzid zzid = zzoA;
        java.util.List list = zzBt.zzxF;
        java.util.List list1 = zzBt.zzxG;
        java.util.List list2 = zzBt.zzCM;
        int j = zzBt.orientation;
        long l = zzBt.zzxJ;
        String s1 = adrequestinfoparcel.zzCp;
        boolean flag = zzBt.zzCK;
        zzdx zzdx;
        zzeg zzeg;
        String s;
        zzea zzea;
        zzdy zzdy;
        if (zzBB != null)
        {
            zzdx = zzBB.zzxZ;
        } else
        {
            zzdx = null;
        }
        if (zzBB != null)
        {
            zzeg = zzBB.zzya;
        } else
        {
            zzeg = null;
        }
        if (zzBB != null)
        {
            s = zzBB.zzyb;
        } else
        {
            s = com/google/ads/mediation/admob/AdMobAdapter.getName();
        }
        zzdy = zzxn;
        if (zzBB != null)
        {
            zzea = zzBB.zzyc;
        } else
        {
            zzea = null;
        }
        return new zzha(adrequestparcel, zzid, list, i, list1, list2, j, l, s1, flag, zzdx, zzeg, s, zzdy, zzea, zzBt.zzCL, zzBs.zzpN, zzBt.zzCJ, zzBs.zzFo, zzBt.zzCO, zzBt.zzCP, zzBs.zzFl, null, adrequestinfoparcel.zzCC);
    }
}
