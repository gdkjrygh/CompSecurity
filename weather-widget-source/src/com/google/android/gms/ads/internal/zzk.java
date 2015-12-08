// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzir;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzp, zzq, InterstitialAdParameterParcel, 
//            zzo, zzd, zze

public class zzk extends zzc
    implements zzdk
{

    protected transient boolean zzpj;

    public zzk(Context context, AdSizeParcel adsizeparcel, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel, zzd zzd1)
    {
        super(context, adsizeparcel, s, zzeh, versioninfoparcel, zzd1);
        zzpj = false;
    }

    private void zzb(Bundle bundle)
    {
        zzp.zzbx().zzb(zzos.context, zzos.zzqb.zzIz, "gmob-apps", bundle, false);
    }

    private void zzbm()
    {
        if (zzos.zzbP())
        {
            zzos.zzbM();
            zzos.zzqg = null;
            zzos.zzpk = false;
            zzpj = false;
        }
    }

    public void showInterstitial()
    {
        zzx.zzch("showInterstitial must be called on the main UI thread.");
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial has not loaded.");
        } else
        {
            if (((Boolean)zzby.zzuZ.get()).booleanValue())
            {
                Object obj;
                if (zzos.context.getApplicationContext() != null)
                {
                    obj = zzos.context.getApplicationContext().getPackageName();
                } else
                {
                    obj = zzos.context.getPackageName();
                }
                if (!zzpj)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", ((String) (obj)));
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    zzb(bundle);
                }
                if (!zzp.zzbx().zzO(zzos.context))
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("appid", ((String) (obj)));
                    bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                    zzb(bundle1);
                }
            }
            if (!zzos.zzbQ())
            {
                if (zzos.zzqg.zzDX)
                {
                    try
                    {
                        zzos.zzqg.zzyR.showInterstitial();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial.", ((Throwable) (obj)));
                    }
                    zzbm();
                    return;
                }
                if (zzos.zzqg.zzAR == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial failed to load.");
                    return;
                }
                if (zzos.zzqg.zzAR.zzgW())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial is already showing.");
                    return;
                }
                zzos.zzqg.zzAR.zzC(true);
                if (zzos.zzqg.zzGF != null)
                {
                    zzou.zza(zzos.zzqf, zzos.zzqg);
                }
                Object obj1 = new InterstitialAdParameterParcel(zzos.zzpk, zzbl());
                int j = zzos.zzqg.zzAR.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzos.zzqg.orientation;
                }
                obj1 = new AdOverlayInfoParcel(this, this, this, zzos.zzqg.zzAR, i, zzos.zzqb, zzos.zzqg.zzEc, ((InterstitialAdParameterParcel) (obj1)));
                zzp.zzbv().zza(zzos.context, ((AdOverlayInfoParcel) (obj1)));
                return;
            }
        }
    }

    protected zzip zza(com.google.android.gms.internal.zzhj.zza zza1, com.google.android.gms.ads.internal.zze zze1)
    {
        zzip zzip1 = com.google.android.gms.ads.internal.zzp.zzby().zza(zzos.context, zzos.zzqf, false, false, zzos.zzqa, zzos.zzqb, zzov);
        zzip1.zzgS().zzb(this, null, this, this, ((Boolean)zzby.zzuN.get()).booleanValue(), this, this, zze1, null);
        zzip1.zzaG(zza1.zzGL.zzDQ);
        return zzip1;
    }

    public boolean zza(AdRequestParcel adrequestparcel, zzcd zzcd)
    {
        if (zzos.zzqg != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("An interstitial is already loading. Aborting.");
            return false;
        } else
        {
            return super.zza(adrequestparcel, zzcd);
        }
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzhj zzhj1, boolean flag)
    {
        if (zzos.zzbP() && zzhj1.zzAR != null)
        {
            zzp.zzbz().zza(zzhj1.zzAR.getWebView());
        }
        return zzor.zzbr();
    }

    public boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        if (!super.zza(zzhj1, zzhj2))
        {
            return false;
        }
        if (!zzos.zzbP() && zzos.zzqy != null && zzhj2.zzGF != null)
        {
            zzou.zza(zzos.zzqf, zzhj2, zzos.zzqy);
        }
        return true;
    }

    protected boolean zzaT()
    {
        if (super.zzaT())
        {
            zzpj = true;
            return true;
        } else
        {
            return false;
        }
    }

    public void zzaV()
    {
        zzbm();
        super.zzaV();
    }

    public void zzaW()
    {
        recordImpression();
        super.zzaW();
    }

    protected boolean zzbl()
    {
        Window window;
        if (zzos.context instanceof Activity)
        {
            if ((window = ((Activity)zzos.context).getWindow()) != null && window.getDecorView() != null)
            {
                Rect rect = new Rect();
                Rect rect1 = new Rect();
                window.getDecorView().getGlobalVisibleRect(rect, null);
                window.getDecorView().getWindowVisibleDisplayFrame(rect1);
                boolean flag;
                if (rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public void zzd(boolean flag)
    {
        zzos.zzpk = flag;
    }
}
