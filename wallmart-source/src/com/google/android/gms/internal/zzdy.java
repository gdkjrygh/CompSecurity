// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzed, zzcd, zzea, zzdz, 
//            zzee, zzhu, zzeh, zzei

public final class zzdy
{

    private final Context mContext;
    private final zzeh zzow;
    private final Object zzpc = new Object();
    private final AdRequestInfoParcel zzyd;
    private final zzea zzye;
    private final boolean zzyf;
    private boolean zzyg;
    private zzed zzyh;

    public zzdy(Context context, AdRequestInfoParcel adrequestinfoparcel, zzeh zzeh, zzea zzea1, boolean flag)
    {
        zzyg = false;
        mContext = context;
        zzyd = adrequestinfoparcel;
        zzow = zzeh;
        zzye = zzea1;
        zzyf = flag;
    }

    public void cancel()
    {
        synchronized (zzpc)
        {
            zzyg = true;
            if (zzyh != null)
            {
                zzyh.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzee zza(long l, long l1, zzcd zzcd1)
    {
        ArrayList arraylist;
        zzcc zzcc;
        Iterator iterator;
        zzb.zzaC("Starting mediation.");
        arraylist = new ArrayList();
        zzcc = zzcd1.zzdl();
        iterator = zzye.zzyu.iterator();
_L4:
        zzdz zzdz1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        zzdz1 = (zzdz)iterator.next();
        zzb.zzaD((new StringBuilder()).append("Trying mediation network: ").append(zzdz1.zzyl).toString());
        iterator1 = zzdz1.zzym.iterator();
_L2:
        String s;
        zzcc zzcc1;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            zzcc1 = zzcd1.zzdl();
            synchronized (zzpc)
            {
                if (!zzyg)
                {
                    break label0;
                }
                zzcd1 = new zzee(-1);
            }
            return zzcd1;
        }
        zzyh = new zzed(mContext, s, zzow, zzye, zzdz1, zzyd.zzDy, zzyd.zzqf, zzyd.zzqb, zzyf, zzyd.zzqt, zzyd.zzqv);
        obj;
        JVM INSTR monitorexit ;
        obj = zzyh.zza(l, l1);
        if (((zzee) (obj)).zzyP == 0)
        {
            zzb.zzaC("Adapter succeeded.");
            zzcd1.zzd("mediation_network_succeed", s);
            if (!arraylist.isEmpty())
            {
                zzcd1.zzd("mediation_networks_fail", TextUtils.join(",", arraylist));
            }
            zzcd1.zza(zzcc1, new String[] {
                "mls"
            });
            zzcd1.zza(zzcc, new String[] {
                "ttm"
            });
            return ((zzee) (obj));
        }
        break MISSING_BLOCK_LABEL_327;
        zzcd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzcd1;
        arraylist.add(s);
        zzcd1.zza(zzcc1, new String[] {
            "mlf"
        });
        if (((zzee) (obj)).zzyR != null)
        {
            zzhu.zzHK.post(new Runnable(((zzee) (obj))) {

                final zzee zzyi;
                final zzdy zzyj;

                public void run()
                {
                    try
                    {
                        zzyi.zzyR.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                zzyj = zzdy.this;
                zzyi = zzee1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (!arraylist.isEmpty())
        {
            zzcd1.zzd("mediation_networks_fail", TextUtils.join(",", arraylist));
        }
        return new zzee(1);
    }
}
