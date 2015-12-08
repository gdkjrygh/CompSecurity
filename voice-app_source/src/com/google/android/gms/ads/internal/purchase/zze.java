// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzhm;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzh, zzi, zzk, GInAppPurchaseManagerInfoParcel, 
//            zzb, zzf, zzj

public class zze extends com.google.android.gms.internal.zzfg.zza
    implements ServiceConnection
{

    private final Activity mActivity;
    private com.google.android.gms.ads.internal.purchase.zzb zzAE;
    zzh zzAF;
    private zzk zzAH;
    private Context zzAM;
    private zzfe zzAN;
    private zzf zzAO;
    private zzj zzAP;
    private String zzAQ;

    public zze(Activity activity)
    {
        zzAQ = null;
        mActivity = activity;
        zzAF = zzh.zzy(mActivity.getApplicationContext());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        i = zzo.zzbF().zzd(intent);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        zzo.zzbF();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzAH.zza(zzAQ, j, intent))
        {
            flag = true;
        }
_L3:
        zzAN.recordPlayBillingResolution(i);
        mActivity.finish();
        zza(zzAN.getProductId(), flag, j, intent);
        zzAQ = null;
_L2:
        return;
        zzAF.zza(zzAO);
          goto _L3
        intent;
        zzb.zzaC("Fail to process purchase result.");
        mActivity.finish();
        zzAQ = null;
        return;
        intent;
        zzAQ = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.zzc(mActivity.getIntent());
        zzAP = ((GInAppPurchaseManagerInfoParcel) (obj)).zzAA;
        zzAH = ((GInAppPurchaseManagerInfoParcel) (obj)).zzqe;
        zzAN = ((GInAppPurchaseManagerInfoParcel) (obj)).zzAy;
        zzAE = new com.google.android.gms.ads.internal.purchase.zzb(mActivity.getApplicationContext());
        zzAM = ((GInAppPurchaseManagerInfoParcel) (obj)).zzAz;
        if (mActivity.getResources().getConfiguration().orientation == 2)
        {
            mActivity.setRequestedOrientation(zzo.zzbx().zzgq());
        } else
        {
            mActivity.setRequestedOrientation(zzo.zzbx().zzgr());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        mActivity.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        mActivity.unbindService(this);
        zzAE.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzAE.zzK(ibinder);
        zzAQ = zzAH.zzfi();
        componentname = zzAE.zzb(mActivity.getPackageName(), zzAN.getProductId(), zzAQ);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = zzo.zzbF().zzb(componentname);
                zzAN.recordPlayBillingResolution(i);
                zza(zzAN.getProductId(), false, i, null);
                mActivity.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_182;
        }
        zzAO = new zzf(zzAN.getProductId(), zzAQ);
        zzAF.zzb(zzAO);
        mActivity.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        zzb.zzd("Error when connecting in-app billing service", componentname);
        mActivity.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaA("In-app billing service disconnected.");
        zzAE.destroy();
    }

    protected void zza(String s, boolean flag, int i, Intent intent)
    {
        if (zzAP != null)
        {
            zzAP.zza(s, flag, i, intent, zzAO);
        }
    }
}
