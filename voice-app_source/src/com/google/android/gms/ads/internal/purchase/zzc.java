// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzb, zzh, zzf, zzi, 
//            zzk, zzg

public class zzc extends zzhh
    implements ServiceConnection
{

    private Context mContext;
    private boolean zzAC;
    private zzfj zzAD;
    private com.google.android.gms.ads.internal.purchase.zzb zzAE;
    private zzh zzAF;
    private List zzAG;
    private zzk zzAH;
    private final Object zzqt;

    public zzc(Context context, zzfj zzfj, zzk zzk)
    {
        this(context, zzfj, zzk, new com.google.android.gms.ads.internal.purchase.zzb(context), zzh.zzy(context.getApplicationContext()));
    }

    zzc(Context context, zzfj zzfj, zzk zzk, com.google.android.gms.ads.internal.purchase.zzb zzb1, zzh zzh1)
    {
        zzqt = new Object();
        zzAC = false;
        zzAG = null;
        mContext = context;
        zzAD = zzfj;
        zzAH = zzk;
        zzAE = zzb1;
        zzAF = zzh1;
        zzAG = zzAF.zzf(10L);
    }

    static zzk zza(zzc zzc1)
    {
        return zzc1.zzAH;
    }

    static Context zzb(zzc zzc1)
    {
        return zzc1.mContext;
    }

    static zzfj zzc(zzc zzc1)
    {
        return zzc1.zzAD;
    }

    private void zzd(long l)
    {
        do
        {
            if (!zze(l))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Timeout waiting for pending transaction to be processed.");
            }
        } while (!zzAC);
    }

    private boolean zze(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzqt.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (zzqt)
        {
            zzAE.zzK(ibinder);
            zzfe();
            zzAC = true;
            zzqt.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service disconnected.");
        zzAE.destroy();
    }

    public void onStop()
    {
        synchronized (zzqt)
        {
            com.google.android.gms.common.stats.zzb.zzoO().zza(mContext, this);
            zzAE.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zza(final zzf final_zzf1, String s, String s1)
    {
        Intent intent = new Intent();
        zzo.zzbF();
        intent.putExtra("RESPONSE_CODE", 0);
        zzo.zzbF();
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        zzo.zzbF();
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        zzhl.zzGk.post(new Runnable(intent) {

            final Intent val$intent;
            final zzf zzAI;
            final zzc zzAJ;

            public void run()
            {
                if (zzc.zza(zzAJ).zza(zzAI.zzAS, -1, intent))
                {
                    zzc.zzc(zzAJ).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzAJ), zzAI.zzAT, true, -1, intent, zzAI));
                    return;
                }
                try
                {
                    zzc.zzc(zzAJ).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzAJ), zzAI.zzAT, false, -1, intent, zzAI));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                zzAJ = zzc.this;
                zzAI = final_zzf1;
                intent = intent1;
                super();
            }
        });
    }

    public void zzdP()
    {
        synchronized (zzqt)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.zzb.zzoO().zza(mContext, intent, this, 1);
            zzd(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.zzb.zzoO().zza(mContext, this);
            zzAE.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzfe()
    {
        if (!zzAG.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        zzf zzf1;
        for (Iterator iterator = zzAG.iterator(); iterator.hasNext(); hashmap.put(zzf1.zzAT, zzf1))
        {
            zzf1 = (zzf)iterator.next();
        }

        obj = null;
_L6:
        obj = zzAE.zzi(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            zzAF.zza((zzf)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || zzo.zzbF().zzb(((Bundle) (obj))) != 0) goto _L5; else goto _L4
_L4:
        ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
        for (int i = 0; i < arraylist.size(); i++)
        {
            if (!hashmap.containsKey(arraylist.get(i)))
            {
                continue;
            }
            String s1 = (String)arraylist.get(i);
            String s2 = (String)arraylist1.get(i);
            String s3 = (String)arraylist2.get(i);
            zzf zzf2 = (zzf)hashmap.get(s1);
            String s4 = zzo.zzbF().zzai(s2);
            if (zzf2.zzAS.equals(s4))
            {
                zza(zzf2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }
}
