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
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzhv;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzh, zzi, zzk, GInAppPurchaseManagerInfoParcel, 
//            zzb, zzf, zzj

public class zze extends com.google.android.gms.internal.zzfn.zza
    implements ServiceConnection
{

    private final Activity mActivity;
    private com.google.android.gms.ads.internal.purchase.zzb zzBQ;
    zzh zzBR;
    private zzk zzBT;
    private Context zzBY;
    private zzfl zzBZ;
    private zzf zzCa;
    private zzj zzCb;
    private String zzCc;

    public zze(Activity activity)
    {
        zzCc = null;
        mActivity = activity;
        zzBR = zzh.zzx(mActivity.getApplicationContext());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        i = zzp.zzbH().zzd(intent);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        zzp.zzbH();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzBT.zza(zzCc, j, intent))
        {
            flag = true;
        }
_L3:
        zzBZ.recordPlayBillingResolution(i);
        mActivity.finish();
        zza(zzBZ.getProductId(), flag, j, intent);
        zzCc = null;
_L2:
        return;
        zzBR.zza(zzCa);
          goto _L3
        intent;
        zzb.zzaE("Fail to process purchase result.");
        mActivity.finish();
        zzCc = null;
        return;
        intent;
        zzCc = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.zzc(mActivity.getIntent());
        zzCb = ((GInAppPurchaseManagerInfoParcel) (obj)).zzBL;
        zzBT = ((GInAppPurchaseManagerInfoParcel) (obj)).zzqw;
        zzBZ = ((GInAppPurchaseManagerInfoParcel) (obj)).zzBJ;
        zzBQ = new com.google.android.gms.ads.internal.purchase.zzb(mActivity.getApplicationContext());
        zzBY = ((GInAppPurchaseManagerInfoParcel) (obj)).zzBK;
        if (mActivity.getResources().getConfiguration().orientation == 2)
        {
            mActivity.setRequestedOrientation(zzp.zzbz().zzgv());
        } else
        {
            mActivity.setRequestedOrientation(zzp.zzbz().zzgw());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        mActivity.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        mActivity.unbindService(this);
        zzBQ.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzBQ.zzM(ibinder);
        zzCc = zzBT.zzfk();
        componentname = zzBQ.zzb(mActivity.getPackageName(), zzBZ.getProductId(), zzCc);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = zzp.zzbH().zzc(componentname);
                zzBZ.recordPlayBillingResolution(i);
                zza(zzBZ.getProductId(), false, i, null);
                mActivity.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_182;
        }
        zzCa = new zzf(zzBZ.getProductId(), zzCc);
        zzBR.zzb(zzCa);
        mActivity.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        zzb.zzd("Error when connecting in-app billing service", componentname);
        mActivity.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaD("In-app billing service disconnected.");
        zzBQ.destroy();
    }

    protected void zza(String s, boolean flag, int i, Intent intent)
    {
        if (zzCb != null)
        {
            zzCb.zza(s, flag, i, intent, zzCa);
        }
    }
}
