// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.stats.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzb, zzh, zzf

public final class zzg extends com.google.android.gms.internal.zzfi.zza
    implements ServiceConnection
{

    private Context mContext;
    com.google.android.gms.ads.internal.purchase.zzb zzAE;
    private String zzAK;
    private zzf zzAO;
    private boolean zzAU;
    private int zzAV;
    private Intent zzAW;

    public zzg(Context context, String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        zzAU = false;
        zzAK = s;
        zzAV = i;
        zzAW = intent;
        zzAU = flag;
        mContext = context;
        zzAO = zzf;
    }

    public void finishPurchase()
    {
        int i = zzo.zzbF().zzd(zzAW);
        if (zzAV != -1 || i != 0)
        {
            return;
        } else
        {
            zzAE = new com.google.android.gms.ads.internal.purchase.zzb(mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zzb.zzoO().zza(mContext, intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return zzAK;
    }

    public Intent getPurchaseData()
    {
        return zzAW;
    }

    public int getResultCode()
    {
        return zzAV;
    }

    public boolean isVerified()
    {
        return zzAU;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service connected.");
        zzAE.zzK(ibinder);
        componentname = zzo.zzbF().zze(zzAW);
        componentname = zzo.zzbF().zzaj(componentname);
        if (componentname == null)
        {
            return;
        }
        if (zzAE.zzh(mContext.getPackageName(), componentname) == 0)
        {
            zzh.zzy(mContext).zza(zzAO);
        }
        zzb.zzoO().zza(mContext, this);
        zzAE.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service disconnected.");
        zzAE.destroy();
    }
}
