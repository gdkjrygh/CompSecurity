// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzek;
import com.google.android.gms.internal.zzel;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzlh;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzq, zzp, zzo

public class zzn extends com.google.android.gms.ads.internal.zzb
{

    public zzn(Context context, AdSizeParcel adsizeparcel, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzeh, versioninfoparcel, null);
    }

    private static zzd zza(zzek zzek1)
        throws RemoteException
    {
        String s = zzek1.getHeadline();
        List list = zzek1.getImages();
        String s1 = zzek1.getBody();
        com.google.android.gms.internal.zzcj zzcj;
        if (zzek1.zzds() != null)
        {
            zzcj = zzek1.zzds();
        } else
        {
            zzcj = null;
        }
        return new zzd(s, list, s1, zzcj, zzek1.getCallToAction(), zzek1.getStarRating(), zzek1.getStore(), zzek1.getPrice(), null, zzek1.getExtras());
    }

    private static zze zza(zzel zzel1)
        throws RemoteException
    {
        String s = zzel1.getHeadline();
        List list = zzel1.getImages();
        String s1 = zzel1.getBody();
        com.google.android.gms.internal.zzcj zzcj;
        if (zzel1.zzdw() != null)
        {
            zzcj = zzel1.zzdw();
        } else
        {
            zzcj = null;
        }
        return new zze(s, list, s1, zzcj, zzel1.getCallToAction(), zzel1.getAdvertiser(), null, zzel1.getExtras());
    }

    private void zza(zzd zzd1)
    {
        zzhu.zzHK.post(new Runnable(zzd1) {

            final zzn zzpt;
            final zzd zzpu;

            public void run()
            {
                try
                {
                    zzpt.zzos.zzqp.zza(zzpu);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpu = zzd1;
                super();
            }
        });
    }

    private void zza(zze zze1)
    {
        zzhu.zzHK.post(new Runnable(zze1) {

            final zzn zzpt;
            final zze zzpv;

            public void run()
            {
                try
                {
                    zzpt.zzos.zzqq.zza(zzpv);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpv = zze1;
                super();
            }
        });
    }

    private void zza(zzhj zzhj1, String s)
    {
        zzhu.zzHK.post(new Runnable(s, zzhj1) {

            final zzn zzpt;
            final String zzpw;
            final zzhj zzpx;

            public void run()
            {
                try
                {
                    ((zzcw)zzpt.zzos.zzqs.get(zzpw)).zza((zzf)zzpx.zzGK);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpw = s;
                zzpx = zzhj1;
                super();
            }
        });
    }

    public void pause()
    {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void recordImpression()
    {
        zza(zzos.zzqg, false);
    }

    public void resume()
    {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void zza(zzch zzch)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void zza(zzfm zzfm)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(com.google.android.gms.internal.zzhj.zza zza1, zzcd zzcd)
    {
        if (zza1.zzqf != null)
        {
            zzos.zzqf = zza1.zzqf;
        }
        if (zza1.errorCode != -2)
        {
            zzhu.zzHK.post(new Runnable(zza1) {

                final com.google.android.gms.internal.zzhj.zza zzoA;
                final zzn zzpt;

                public void run()
                {
                    zzpt.zzb(new zzhj(zzoA, null, null, null, null, null, null));
                }

            
            {
                zzpt = zzn.this;
                zzoA = zza1;
                super();
            }
            });
            return;
        } else
        {
            zzos.zzqz = 0;
            zzos.zzqe = zzp.zzbw().zza(zzos.context, this, zza1, zzos.zzqa, null, zzow, this, zzcd);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(zzos.zzqe.getClass().getName()).toString());
            return;
        }
    }

    public void zza(zzlh zzlh1)
    {
        zzx.zzch("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzos.zzqs = zzlh1;
    }

    public void zza(List list)
    {
        zzx.zzch("setNativeTemplates must be called on the main UI thread.");
        zzos.zzqv = list;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzhj zzhj1, boolean flag)
    {
        return zzor.zzbr();
    }

    protected boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        zza(((List) (null)));
        if (!zzos.zzbP())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (!zzhj2.zzDX) goto _L2; else goto _L1
_L1:
        zzek zzek1;
        Object obj;
        zzek1 = zzhj2.zzyR.zzdS();
        obj = zzhj2.zzyR.zzdT();
        if (zzek1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            obj = zza(zzek1);
            ((zzd) (obj)).zza(new zzg(zzos.context, this, zzos.zzqa, zzek1));
            zza(((zzd) (obj)));
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get native ad mapper", remoteexception);
        }
_L6:
        return super.zza(zzhj1, zzhj2);
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        zze zze1 = zza(((zzel) (obj)));
        zze1.zza(new zzg(zzos.context, this, zzos.zzqa, ((zzel) (obj))));
        zza(zze1);
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("No matching mapper for retrieved native ad template.");
        zze(0);
        return false;
_L2:
        com.google.android.gms.ads.internal.formats.zzh.zza zza1 = zzhj2.zzGK;
        if ((zza1 instanceof zze) && zzos.zzqq != null)
        {
            zza((zze)zzhj2.zzGK);
        } else
        if ((zza1 instanceof zzd) && zzos.zzqp != null)
        {
            zza((zzd)zzhj2.zzGK);
        } else
        if ((zza1 instanceof zzf) && zzos.zzqs != null && zzos.zzqs.get(((zzf)zza1).getCustomTemplateId()) != null)
        {
            zza(zzhj2, ((zzf)zza1).getCustomTemplateId());
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("No matching listener for retrieved native ad template.");
            zze(0);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void zzb(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzx.zzch("setNativeAdOptions must be called on the main UI thread.");
        zzos.zzqt = nativeadoptionsparcel;
    }

    public void zzb(zzct zzct)
    {
        zzx.zzch("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzos.zzqp = zzct;
    }

    public void zzb(zzcu zzcu)
    {
        zzx.zzch("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzos.zzqq = zzcu;
    }

    public void zzb(zzlh zzlh1)
    {
        zzx.zzch("setOnCustomClickListener must be called on the main UI thread.");
        zzos.zzqr = zzlh1;
    }

    public zzlh zzbq()
    {
        zzx.zzch("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return zzos.zzqs;
    }

    public zzcv zzr(String s)
    {
        zzx.zzch("getOnCustomClickListener must be called on the main UI thread.");
        return (zzcv)zzos.zzqr.get(s);
    }
}
