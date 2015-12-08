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
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.internal.zzif;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzo, zzp, InterstitialAdParameterParcel, 
//            zzn, zzd

public class zzj extends zzc
    implements zzdk
{

    protected transient boolean zzoT;

    public zzj(Context context, AdSizeParcel adsizeparcel, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzef, versioninfoparcel);
        zzoT = false;
    }

    private void zza(Bundle bundle)
    {
        com.google.android.gms.ads.internal.zzo.zzbv().zza(zzon.zzpH, zzon.zzpJ.zzGG, "gmob-apps", bundle, false);
    }

    private void zzbk()
    {
        if (zzon.zzbM())
        {
            zzon.zzbJ();
            zzon.zzpO = null;
            zzon.zzoU = false;
            zzoT = false;
        }
    }

    public void showInterstitial()
    {
        zzu.zzbY("showInterstitial must be called on the main UI thread.");
        if (zzon.zzpO == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("The interstitial has not loaded.");
        } else
        {
            Object obj;
            if (zzon.zzpH.getApplicationContext() != null)
            {
                obj = zzon.zzpH.getApplicationContext().getPackageName();
            } else
            {
                obj = zzon.zzpH.getPackageName();
            }
            if (!zzoT)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", ((String) (obj)));
                bundle.putString("action", "show_interstitial_before_load_finish");
                zza(bundle);
            }
            if (!com.google.android.gms.ads.internal.zzo.zzbv().zzM(zzon.zzpH))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle1 = new Bundle();
                bundle1.putString("appid", ((String) (obj)));
                bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                zza(bundle1);
            }
            if (!zzon.zzbN())
            {
                if (zzon.zzpO.zzzE.zzgJ())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("The interstitial is already showing.");
                    return;
                }
                zzon.zzpO.zzzE.zzB(true);
                if (zzon.zzpO.zzzE.zzgF().zzbU() || zzon.zzpO.zzFl != null)
                {
                    obj = zzop.zza(zzon.zzpN, zzon.zzpO);
                    if (zzon.zzpO.zzzE.zzgF().zzbU() && obj != null)
                    {
                        ((zzaz) (obj)).zza(this);
                    }
                }
                if (zzon.zzpO.zzCK)
                {
                    try
                    {
                        zzon.zzpO.zzya.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial.", remoteexception);
                    }
                    zzbk();
                    return;
                }
                remoteexception = new InterstitialAdParameterParcel(zzon.zzoU, zzbj());
                int j = zzon.zzpO.zzzE.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzon.zzpO.orientation;
                }
                remoteexception = new AdOverlayInfoParcel(this, this, this, zzon.zzpO.zzzE, i, zzon.zzpJ, zzon.zzpO.zzCP, remoteexception);
                zzo.zzbt().zza(zzon.zzpH, remoteexception);
                return;
            }
        }
    }

    protected zzid zza(com.google.android.gms.ads.internal.zzd zzd1)
    {
        zzid zzid1 = zzo.zzbw().zza(zzon.zzpH, zzon.zzpN, false, false, zzon.zzpI, zzon.zzpJ);
        zzid1.zzgF().zzb(this, null, this, this, ((Boolean)zzbz.zzuk.get()).booleanValue(), this, this, zzd1, null);
        return zzid1;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzha zzha1, boolean flag)
    {
        if (zzon.zzbM())
        {
            zzo.zzbx().zza(zzha1.zzzE.getWebView());
        }
        return zzom.zzbp();
    }

    public boolean zza(zzha zzha1, zzha zzha2)
    {
        if (!super.zza(zzha1, zzha2))
        {
            return false;
        }
        if (!zzon.zzbM()) goto _L2; else goto _L1
_L1:
        if (zzha2.zzzE != null)
        {
            zzha2.zzzE.zzgF().zzgS();
        }
_L4:
        return true;
_L2:
        if (zzon.zzqg != null && zzha2.zzFl != null)
        {
            zzop.zza(zzon.zzpN, zzha2, zzon.zzqg);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zzaT()
    {
        if (super.zzaT())
        {
            zzoT = true;
            return true;
        } else
        {
            return false;
        }
    }

    public void zzaV()
    {
        zzbk();
        super.zzaV();
    }

    public void zzaW()
    {
        recordImpression();
        super.zzaW();
    }

    public boolean zzb(AdRequestParcel adrequestparcel)
    {
        if (zzon.zzpO != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("An interstitial is already loading. Aborting.");
            return false;
        } else
        {
            return super.zzb(adrequestparcel);
        }
    }

    protected boolean zzbj()
    {
        Window window;
        if (zzon.zzpH instanceof Activity)
        {
            if ((window = ((Activity)zzon.zzpH).getWindow()) != null && window.getDecorView() != null)
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
        zzon.zzoU = flag;
    }
}
