// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzeb, zzdy, zzdx, zzec, 
//            zzhl, zzef, zzeg

public final class zzdw
{

    private final Context mContext;
    private final zzef zzoq;
    private final Object zzqt = new Object();
    private final AdRequestInfoParcel zzxm;
    private final zzdy zzxn;
    private boolean zzxo;
    private zzeb zzxp;

    public zzdw(Context context, AdRequestInfoParcel adrequestinfoparcel, zzef zzef, zzdy zzdy1)
    {
        zzxo = false;
        mContext = context;
        zzxm = adrequestinfoparcel;
        zzoq = zzef;
        zzxn = zzdy1;
    }

    public void cancel()
    {
        synchronized (zzqt)
        {
            zzxo = true;
            if (zzxp != null)
            {
                zzxp.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzec zza(long l, long l1)
    {
        Iterator iterator;
        zzb.zzay("Starting mediation.");
        iterator = zzxn.zzxD.iterator();
_L4:
        zzdx zzdx1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        zzdx1 = (zzdx)iterator.next();
        zzb.zzaA((new StringBuilder()).append("Trying mediation network: ").append(zzdx1.zzxt).toString());
        iterator1 = zzdx1.zzxu.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            zzec zzec1;
            synchronized (zzqt)
            {
                if (!zzxo)
                {
                    break label0;
                }
                zzec1 = new zzec(-1);
            }
            return zzec1;
        }
        zzxp = new zzeb(mContext, s, zzoq, zzxn, zzdx1, zzxm.zzCm, zzxm.zzpN, zzxm.zzpJ);
        obj;
        JVM INSTR monitorexit ;
        obj = zzxp.zzb(l, l1);
        if (((zzec) (obj)).zzxY == 0)
        {
            zzb.zzay("Adapter succeeded.");
            return ((zzec) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((zzec) (obj)).zzya != null)
        {
            zzhl.zzGk.post(new Runnable(((zzec) (obj))) {

                final zzec zzxq;
                final zzdw zzxr;

                public void run()
                {
                    try
                    {
                        zzxq.zzya.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                zzxr = zzdw.this;
                zzxq = zzec1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new zzec(1);
    }
}
