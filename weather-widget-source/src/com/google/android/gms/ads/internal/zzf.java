// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzq, zzp

public class zzf extends zzc
{

    private boolean zzoM;

    public zzf(Context context, AdSizeParcel adsizeparcel, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzeh, versioninfoparcel, null);
    }

    private boolean zzb(zzhj zzhj1, zzhj zzhj2)
    {
        if (!zzhj2.zzDX)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        View view;
        try
        {
            zzhj2 = zzhj2.zzyR.getView();
        }
        // Misplaced declaration of an exception variable
        catch (zzhj zzhj1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", zzhj1);
            return false;
        }
        if (zzhj2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("View in mediation adapter is null.");
        return false;
        zzhj2 = (View)zze.zzp(zzhj2);
        view = zzos.zzqc.getNextView();
        if (view != null)
        {
            if (view instanceof zzip)
            {
                ((zzip)view).destroy();
            }
            zzos.zzqc.removeView(view);
        }
        try
        {
            zzb(((View) (zzhj2)));
        }
        // Misplaced declaration of an exception variable
        catch (zzhj zzhj1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", zzhj1);
            return false;
        }
_L1:
        if (zzos.zzqc.getChildCount() > 1)
        {
            zzos.zzqc.showNext();
        }
        if (zzhj1 != null)
        {
            zzhj1 = zzos.zzqc.getNextView();
            if (zzhj1 instanceof zzip)
            {
                ((zzip)zzhj1).zza(zzos.context, zzos.zzqf);
            } else
            if (zzhj1 != null)
            {
                zzos.zzqc.removeView(zzhj1);
            }
            zzos.zzbO();
        }
        zzos.zzqc.setVisibility(0);
        return true;
        if (zzhj2.zzGH != null && zzhj2.zzAR != null)
        {
            zzhj2.zzAR.zza(zzhj2.zzGH);
            zzos.zzqc.removeAllViews();
            zzos.zzqc.setMinimumWidth(zzhj2.zzGH.widthPixels);
            zzos.zzqc.setMinimumHeight(zzhj2.zzGH.heightPixels);
            zzb(((View) (zzhj2.zzAR.getWebView())));
        }
          goto _L1
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        zzx.zzch("setManualImpressionsEnabled must be called from the main thread.");
        zzoM = flag;
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        return super.zza(zzd(adrequestparcel));
    }

    public boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        if (!super.zza(zzhj1, zzhj2))
        {
            return false;
        }
        if (zzos.zzbP() && !zzb(zzhj1, zzhj2))
        {
            zze(0);
            return false;
        }
        zza(zzhj2, false);
        if (!zzos.zzbP()) goto _L2; else goto _L1
_L1:
        if (zzhj2.zzAR != null)
        {
            if (zzhj2.zzGF != null)
            {
                zzou.zza(zzos.zzqf, zzhj2);
            }
            if (zzhj2.zzbY())
            {
                zzou.zza(zzos.zzqf, zzhj2).zza(zzhj2.zzAR);
            } else
            {
                zzhj2.zzAR.zzgS().zza(new com.google.android.gms.internal.zziq.zzb(zzhj2) {

                    final zzhj zzoN;
                    final zzf zzoO;

                    public void zzbf()
                    {
                        zzoO.zzou.zza(zzoO.zzos.zzqf, zzoN).zza(zzoN.zzAR);
                    }

            
            {
                zzoO = zzf.this;
                zzoN = zzhj1;
                super();
            }
                });
            }
        }
_L4:
        return true;
_L2:
        if (zzos.zzqy != null && zzhj2.zzGF != null)
        {
            zzou.zza(zzos.zzqf, zzhj2, zzos.zzqy);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzp.zzbx().zza(zzos.context.getPackageManager(), zzos.context.getPackageName(), "android.permission.INTERNET"))
        {
            zzk.zzcE().zza(zzos.zzqc, zzos.zzqf, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        if (!zzp.zzbx().zzI(zzos.context))
        {
            zzk.zzcE().zza(zzos.zzqc, zzos.zzqf, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && zzos.zzqc != null)
        {
            zzos.zzqc.setVisibility(0);
        }
        return flag;
    }

    AdRequestParcel zzd(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.zzsv == zzoM)
        {
            return adrequestparcel;
        }
        int i = adrequestparcel.versionCode;
        long l = adrequestparcel.zzsq;
        android.os.Bundle bundle = adrequestparcel.extras;
        int j = adrequestparcel.zzsr;
        java.util.List list = adrequestparcel.zzss;
        boolean flag1 = adrequestparcel.zzst;
        int k = adrequestparcel.zzsu;
        boolean flag;
        if (adrequestparcel.zzsv || zzoM)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new AdRequestParcel(i, l, bundle, j, list, flag1, k, flag, adrequestparcel.zzsw, adrequestparcel.zzsx, adrequestparcel.zzsy, adrequestparcel.zzsz, adrequestparcel.zzsA, adrequestparcel.zzsB, adrequestparcel.zzsC, adrequestparcel.zzsD, adrequestparcel.zzsE);
    }
}
