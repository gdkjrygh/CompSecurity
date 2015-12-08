// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzkw;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzp, zzn, zzo

public class zzm extends com.google.android.gms.ads.internal.zzb
{

    public zzm(Context context, AdSizeParcel adsizeparcel, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzef, versioninfoparcel);
    }

    private void zza(zzha zzha1, String s)
    {
        zzhl.zzGk.post(new _cls3(s, zzha1));
    }

    private void zzd(zzha zzha1)
    {
        zzhl.zzGk.post(new _cls1(zzha1));
    }

    private void zze(zzha zzha1)
    {
        zzhl.zzGk.post(new _cls2(zzha1));
    }

    public void pause()
    {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void resume()
    {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void zza(zzci zzci)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void zza(zzff zzff)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(zzkw zzkw1)
    {
        zzu.zzbY("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzon.zzqa = zzkw1;
    }

    public void zza(List list)
    {
        zzu.zzbY("setNativeTemplates must be called on the main UI thread.");
        zzon.zzqd = list;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzha zzha1, boolean flag)
    {
        return zzom.zzbp();
    }

    protected boolean zza(zzha zzha1, zzha zzha2)
    {
        zza(((List) (null)));
        if (!zzon.zzbM())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        com.google.android.gms.ads.internal.formats.zzg.zza zza1 = zzha2.zzFq;
        if ((zza1 instanceof zze) && zzon.zzpY != null)
        {
            zze(zzha2);
        } else
        if ((zza1 instanceof zzd) && zzon.zzpX != null)
        {
            zzd(zzha2);
        } else
        if ((zza1 instanceof zzf) && zzon.zzqa != null && zzon.zzqa.get(((zzf)zza1).getCustomTemplateId()) != null)
        {
            zza(zzha2, ((zzf)zza1).getCustomTemplateId());
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("No matching listener for retrieved native ad template.");
            zze(0);
            return false;
        }
        return super.zza(zzha1, zzha2);
    }

    public void zzb(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzu.zzbY("setNativeAdOptions must be called on the main UI thread.");
        zzon.zzqb = nativeadoptionsparcel;
    }

    public void zzb(zzcu zzcu)
    {
        zzu.zzbY("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzon.zzpX = zzcu;
    }

    public void zzb(zzcv zzcv)
    {
        zzu.zzbY("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzon.zzpY = zzcv;
    }

    public void zzb(zzkw zzkw1)
    {
        zzu.zzbY("setOnCustomClickListener must be called on the main UI thread.");
        zzon.zzpZ = zzkw1;
    }

    public boolean zzb(com.google.android.gms.internal.zzha.zza zza1)
    {
        if (zza1.zzpN != null)
        {
            zzon.zzpN = zza1.zzpN;
        }
        if (zza1.errorCode != -2)
        {
            zzb(new zzha(zza1, null, null, null, null, null, null));
            return false;
        } else
        {
            zzon.zzqh = 0;
            zzon.zzpM = zzo.zzbu().zza(zzon.zzpH, this, zza1, zzon.zzpI, null, zzoq, this);
            return true;
        }
    }

    public zzkw zzbo()
    {
        zzu.zzbY("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return zzon.zzqa;
    }

    public zzcw zzq(String s)
    {
        zzu.zzbY("getOnCustomClickListener must be called on the main UI thread.");
        return (zzcw)zzon.zzpZ.get(s);
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
