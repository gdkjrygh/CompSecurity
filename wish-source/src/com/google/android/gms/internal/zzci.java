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
//            zzcn, zzck, zzcj, zzco, 
//            zzfl, zzcr, zzcs

public final class zzci
{

    private final Context mContext;
    private final zzcr zzmv;
    private final Object zzoe = new Object();
    private final AdRequestInfoParcel zzul;
    private final zzck zzum;
    private boolean zzun;
    private zzcn zzuo;

    public zzci(Context context, AdRequestInfoParcel adrequestinfoparcel, zzcr zzcr, zzck zzck1)
    {
        zzun = false;
        mContext = context;
        zzul = adrequestinfoparcel;
        zzmv = zzcr;
        zzum = zzck1;
    }

    public void cancel()
    {
        synchronized (zzoe)
        {
            zzun = true;
            if (zzuo != null)
            {
                zzuo.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzco zza(long l, long l1)
    {
        Iterator iterator;
        zzb.zzaj("Starting mediation.");
        iterator = zzum.zzuA.iterator();
_L4:
        zzcj zzcj1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        zzcj1 = (zzcj)iterator.next();
        zzb.zzal((new StringBuilder()).append("Trying mediation network: ").append(zzcj1.zzus).toString());
        iterator1 = zzcj1.zzut.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            zzco zzco1;
            synchronized (zzoe)
            {
                if (!zzun)
                {
                    break label0;
                }
                zzco1 = new zzco(-1);
            }
            return zzco1;
        }
        zzuo = new zzcn(mContext, s, zzmv, zzum, zzcj1, zzul.zzyW, zzul.zzmP, zzul.zzmJ);
        obj;
        JVM INSTR monitorexit ;
        obj = zzuo.zzb(l, l1);
        if (((zzco) (obj)).zzuT == 0)
        {
            zzb.zzaj("Adapter succeeded.");
            return ((zzco) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((zzco) (obj)).zzuV != null)
        {
            zzfl.zzCr.post(new Runnable(((zzco) (obj))) {

                final zzco zzup;
                final zzci zzuq;

                public void run()
                {
                    try
                    {
                        zzup.zzuV.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                zzuq = zzci.this;
                zzup = zzco1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new zzco(1);
    }
}
