// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzbh;
import com.google.android.gms.internal.zzbk;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzca;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzdd;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzho;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzq, zzo, zzd

public abstract class zza extends com.google.android.gms.ads.internal.client.zzr.zza
    implements com.google.android.gms.ads.internal.client.zza, zzn, com.google.android.gms.ads.internal.request.zza, zzdd, com.google.android.gms.internal.zzga.zza, zzhn
{

    private zzcd zzon;
    private zzcc zzoo;
    private zzcc zzop;
    boolean zzoq;
    protected final zzo zzor;
    protected final zzq zzos;
    protected transient AdRequestParcel zzot;
    protected final zzay zzou = zzp.zzbA().zzgh();
    protected final com.google.android.gms.ads.internal.zzd zzov;

    zza(zzq zzq1, zzo zzo1, com.google.android.gms.ads.internal.zzd zzd)
    {
        zzoq = false;
        zzos = zzq1;
        if (zzo1 == null)
        {
            zzo1 = new zzo(this);
        }
        zzor = zzo1;
        zzov = zzd;
        zzp.zzbx().zzJ(zzos.context);
        zzp.zzbA().zzb(zzos.context, zzos.zzqb);
    }

    private boolean zzaR()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad leaving application.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdLeftApplication();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
            return false;
        }
        return true;
    }

    public void destroy()
    {
        zzx.zzch("destroy must be called on the main UI thread.");
        zzor.cancel();
        zzou.zzf(zzos.zzqg);
        zzos.destroy();
    }

    public boolean isLoading()
    {
        return zzoq;
    }

    public boolean isReady()
    {
        zzx.zzch("isLoaded must be called on the main UI thread.");
        return zzos.zzqd == null && zzos.zzqe == null && zzos.zzqg != null;
    }

    public void onAdClicked()
    {
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging click URLs.");
            zzos.zzqi.zzfU();
            if (zzos.zzqg.zzyw != null)
            {
                zzp.zzbx().zza(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().zza(zzos.context, zzos.zzqg.zzyw, zzos.zzqg.zzDO));
            }
            if (zzos.zzqj != null)
            {
                try
                {
                    zzos.zzqj.onAdClicked();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not notify onAdClicked event.", remoteexception);
                }
                return;
            }
        }
    }

    public void onAppEvent(String s, String s1)
    {
        if (zzos.zzql == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzos.zzql.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        zzx.zzch("pause must be called on the main UI thread.");
    }

    protected void recordImpression()
    {
        zzc(zzos.zzqg);
    }

    public void resume()
    {
        zzx.zzch("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public void stopLoading()
    {
        zzx.zzch("stopLoading must be called on the main UI thread.");
        zzoq = false;
        zzos.zzf(true);
    }

    Bundle zza(zzbk zzbk1)
    {
        if (zzbk1 != null)
        {
            if (zzbk1.zzcx())
            {
                zzbk1.wakeup();
            }
            zzbh zzbh1 = zzbk1.zzcv();
            if (zzbh1 != null)
            {
                zzbk1 = zzbh1.zzcm();
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("In AdManger: loadAd, ").append(zzbh1.toString()).toString());
            } else
            {
                zzbk1 = null;
            }
            if (zzbk1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", zzbk1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        zzx.zzch("setAdSize must be called on the main UI thread.");
        zzos.zzqf = adsizeparcel;
        if (zzos.zzqg != null && zzos.zzqg.zzAR != null && zzos.zzqz == 0)
        {
            zzos.zzqg.zzAR.zza(adsizeparcel);
        }
        if (zzos.zzqc == null)
        {
            return;
        }
        if (zzos.zzqc.getChildCount() > 1)
        {
            zzos.zzqc.removeView(zzos.zzqc.getNextView());
        }
        zzos.zzqc.setMinimumWidth(adsizeparcel.widthPixels);
        zzos.zzqc.setMinimumHeight(adsizeparcel.heightPixels);
        zzos.zzqc.requestLayout();
    }

    public void zza(zzm zzm1)
    {
        zzx.zzch("setAdListener must be called on the main UI thread.");
        zzos.zzqj = zzm1;
    }

    public void zza(com.google.android.gms.ads.internal.client.zzn zzn1)
    {
        zzx.zzch("setAdListener must be called on the main UI thread.");
        zzos.zzqk = zzn1;
    }

    public void zza(zzt zzt1)
    {
        zzx.zzch("setAppEventListener must be called on the main UI thread.");
        zzos.zzql = zzt1;
    }

    public void zza(zzu zzu)
    {
        zzx.zzch("setCorrelationIdProvider must be called on the main UI thread");
        zzos.zzqm = zzu;
    }

    public void zza(zzch zzch)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzfm zzfm)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void zza(zzfq zzfq, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void zza(com.google.android.gms.internal.zzhj.zza zza1)
    {
        if (zza1.zzGM.zzEb != -1L && !TextUtils.isEmpty(zza1.zzGM.zzEl))
        {
            long l = zzo(zza1.zzGM.zzEl);
            if (l != -1L)
            {
                zzcc zzcc1 = zzon.zzb(l + zza1.zzGM.zzEb);
                zzon.zza(zzcc1, new String[] {
                    "stc"
                });
            }
        }
        zzon.zzR(zza1.zzGM.zzEl);
        zzon.zza(zzoo, new String[] {
            "arf"
        });
        zzop = zzon.zzdl();
        zzos.zzqd = null;
        zzos.zzqh = zza1;
        zza(zza1, zzon);
    }

    protected abstract void zza(com.google.android.gms.internal.zzhj.zza zza1, zzcd zzcd1);

    public void zza(HashSet hashset)
    {
        zzos.zza(hashset);
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        zzx.zzch("loadAd must be called on the main UI thread.");
        if (zzos.zzqd != null || zzos.zzqe != null)
        {
            if (zzot != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzot = adrequestparcel;
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Starting ad request.");
        zzoq = true;
        zzaL();
        zzoo = zzon.zzdl();
        if (!adrequestparcel.zzst)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(zzk.zzcE().zzQ(zzos.context)).append("\") to get test ads on this device.").toString());
        }
        return zza(adrequestparcel, zzon);
    }

    protected abstract boolean zza(AdRequestParcel adrequestparcel, zzcd zzcd1);

    boolean zza(zzhj zzhj1)
    {
        return false;
    }

    protected abstract boolean zza(zzhj zzhj1, zzhj zzhj2);

    void zzaL()
    {
        zzon = new zzcd(((Boolean)zzby.zzuB.get()).booleanValue(), "load_ad", zzos.zzqf.zzsG);
        zzoo = new zzcc(-1L, null, null);
        zzop = new zzcc(-1L, null, null);
    }

    public zzd zzaM()
    {
        zzx.zzch("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.zze.zzx(zzos.zzqc);
    }

    public AdSizeParcel zzaN()
    {
        zzx.zzch("getAdSize must be called on the main UI thread.");
        return zzos.zzqf;
    }

    public void zzaO()
    {
        zzaR();
    }

    public void zzaP()
    {
        zzx.zzch("recordManualImpression must be called on the main UI thread.");
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging manual tracking URLs.");
            if (zzos.zzqg.zzDZ != null)
            {
                zzp.zzbx().zza(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().zza(zzos.context, zzos.zzqg.zzDZ, zzos.zzqg.zzDO));
                return;
            }
        }
    }

    protected boolean zzaQ()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("Ad closing.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdClosed();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdClosed().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean zzaS()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad opening.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdOpened();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdOpened().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean zzaT()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad finished loading.");
        zzoq = false;
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdLoaded();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
            return false;
        }
        return true;
    }

    protected void zzb(View view)
    {
        zzos.zzqc.addView(view, zzp.zzbz().zzgy());
    }

    public void zzb(zzhj zzhj1)
    {
        zzon.zza(zzop, new String[] {
            "awr"
        });
        zzos.zzqe = null;
        if (zzhj1.errorCode != -2 && zzhj1.errorCode != 3)
        {
            zzp.zzbA().zzb(zzos.zzbL());
        }
        if (zzhj1.errorCode == -1)
        {
            zzoq = false;
        } else
        {
            if (zza(zzhj1))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad refresh scheduled.");
            }
            if (zzhj1.errorCode != -2)
            {
                zze(zzhj1.errorCode);
                return;
            }
            if (zzos.zzqx == null)
            {
                zzos.zzqx = new zzho(zzos.zzpZ);
            }
            zzou.zze(zzos.zzqg);
            if (zza(zzos.zzqg, zzhj1))
            {
                zzos.zzqg = zzhj1;
                zzos.zzbS();
                zzcd zzcd1 = zzon;
                if (zzos.zzqg.zzbY())
                {
                    zzhj1 = "1";
                } else
                {
                    zzhj1 = "0";
                }
                zzcd1.zzd("is_mraid", zzhj1);
                zzcd1 = zzon;
                if (zzos.zzqg.zzDX)
                {
                    zzhj1 = "1";
                } else
                {
                    zzhj1 = "0";
                }
                zzcd1.zzd("is_mediation", zzhj1);
                if (zzos.zzqg.zzAR != null && zzos.zzqg.zzAR.zzgS() != null)
                {
                    zzcd zzcd2 = zzon;
                    if (zzos.zzqg.zzAR.zzgS().zzhc())
                    {
                        zzhj1 = "1";
                    } else
                    {
                        zzhj1 = "0";
                    }
                    zzcd2.zzd("is_video", zzhj1);
                }
                zzon.zza(zzoo, new String[] {
                    "ttc"
                });
                if (zzp.zzbA().zzgc() != null)
                {
                    zzp.zzbA().zzgc().zza(zzon);
                }
                if (zzos.zzbP())
                {
                    zzaT();
                    return;
                }
            }
        }
    }

    protected boolean zzb(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = zzos.zzqc.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && zzp.zzbx().zzgq();
    }

    public void zzc(AdRequestParcel adrequestparcel)
    {
        if (zzb(adrequestparcel))
        {
            zza(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad is not visible. Not refreshing ad.");
            zzor.zzf(adrequestparcel);
            return;
        }
    }

    protected void zzc(zzhj zzhj1)
    {
        if (zzhj1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging Impression URLs.");
            zzos.zzqi.zzfT();
            if (zzhj1.zzyx != null)
            {
                zzp.zzbx().zza(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().zza(zzos.context, zzhj1.zzyx, zzhj1.zzDO));
                return;
            }
        }
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        zzoq = false;
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    long zzo(String s)
    {
        int i;
        int k;
        k = s.indexOf("ufe");
        int j = s.indexOf(',', k);
        i = j;
        if (j == -1)
        {
            i = s.length();
        }
        long l = Long.parseLong(s.substring(k + 4, i));
        return l;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Invalid index for Url fetch time in CSI latency info.");
_L2:
        return -1L;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot find valid format of Url fetch time in CSI latency info.");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
