// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzaw;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbh;
import com.google.android.gms.internal.zzbk;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzde;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo, zzp, zzn, zzl

public abstract class zza extends com.google.android.gms.ads.internal.client.zzr.zza
    implements com.google.android.gms.ads.internal.client.zza, zzk, com.google.android.gms.ads.internal.request.zza, zzaw, zzde, com.google.android.gms.internal.zzft.zza, zzhe
{

    private zzce zzoj;
    private zzcd zzok;
    private zzcd zzol;
    protected final com.google.android.gms.ads.internal.zzn zzom;
    protected final zzp zzon;
    protected transient AdRequestParcel zzoo;
    protected final zzay zzop = zzo.zzby().zzgd();

    zza(zzp zzp1, com.google.android.gms.ads.internal.zzn zzn1)
    {
        zzon = zzp1;
        if (zzn1 == null)
        {
            zzn1 = new com.google.android.gms.ads.internal.zzn(this);
        }
        zzom = zzn1;
        com.google.android.gms.ads.internal.zzo.zzbv().zzH(zzon.zzpH);
        zzo.zzby().zzb(zzon.zzpH, zzon.zzpJ);
    }

    private boolean zzaR()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("Ad leaving application.");
        if (zzon.zzpS == null)
        {
            return false;
        }
        try
        {
            zzon.zzpS.onAdLeftApplication();
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
        zzu.zzbY("destroy must be called on the main UI thread.");
        zzom.cancel();
        zzop.zzh(zzon.zzpO);
        zzon.destroy();
    }

    public boolean isReady()
    {
        zzu.zzbY("isLoaded must be called on the main UI thread.");
        return zzon.zzpL == null && zzon.zzpM == null && zzon.zzpO != null;
    }

    public void onAdClicked()
    {
        if (zzon.zzpO == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Pinging click URLs.");
            zzon.zzpQ.zzfQ();
            if (zzon.zzpO.zzxF != null)
            {
                com.google.android.gms.ads.internal.zzo.zzbv().zza(zzon.zzpH, zzon.zzpJ.zzGG, zza(zzon.zzpO.zzxF, zzon.zzpO.zzCC));
            }
            if (zzon.zzpR != null)
            {
                try
                {
                    zzon.zzpR.onAdClicked();
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
        if (zzon.zzpT == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzon.zzpT.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        zzu.zzbY("pause must be called on the main UI thread.");
    }

    protected void recordImpression()
    {
        zzc(zzon.zzpO);
    }

    public void resume()
    {
        zzu.zzbY("resume must be called on the main UI thread.");
    }

    public void stopLoading()
    {
        zzu.zzbY("stopLoading must be called on the main UI thread.");
        zzon.zzf(true);
    }

    Bundle zza(zzbk zzbk1)
    {
        if (zzbk1 != null)
        {
            if (zzbk1.zzct())
            {
                zzbk1.wakeup();
            }
            zzbh zzbh1 = zzbk1.zzcr();
            if (zzbh1 != null)
            {
                zzbk1 = zzbh1.zzci();
                com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("In AdManger: loadAd, ").append(zzbh1.toString()).toString());
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

    String zza(String s, String s1, int i)
    {
        String s2 = s;
        if (((Boolean)zzbz.zzun.get()).booleanValue())
        {
            s2 = s;
            if (zzl.zzq(zzon.zzpH).zzbl())
            {
                s2 = s;
                if (!TextUtils.isEmpty(s))
                {
                    s2 = Uri.parse(s).buildUpon().appendQueryParameter("ga_cid", s1).appendQueryParameter("ga_hid", String.valueOf(i)).build().toString();
                }
            }
        }
        return s2;
    }

    ArrayList zza(List list, String s)
    {
        int i = zzl.zzq(zzon.zzpH).zzbn();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zza((String)list.next(), s, i))) { }
        return arraylist;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        zzu.zzbY("setAdSize must be called on the main UI thread.");
        zzon.zzpN = adsizeparcel;
        if (zzon.zzpO != null && zzon.zzqh == 0)
        {
            zzon.zzpO.zzzE.zza(adsizeparcel);
        }
        if (zzon.zzpK == null)
        {
            return;
        }
        if (zzon.zzpK.getChildCount() > 1)
        {
            zzon.zzpK.removeView(zzon.zzpK.getNextView());
        }
        zzon.zzpK.setMinimumWidth(adsizeparcel.widthPixels);
        zzon.zzpK.setMinimumHeight(adsizeparcel.heightPixels);
        zzon.zzpK.requestLayout();
    }

    public void zza(zzm zzm1)
    {
        zzu.zzbY("setAdListener must be called on the main UI thread.");
        zzon.zzpR = zzm1;
    }

    public void zza(zzn zzn1)
    {
        zzu.zzbY("setAdListener must be called on the main UI thread.");
        zzon.zzpS = zzn1;
    }

    public void zza(zzt zzt1)
    {
        zzu.zzbY("setAppEventListener must be called on the main UI thread.");
        zzon.zzpT = zzt1;
    }

    public void zza(com.google.android.gms.ads.internal.client.zzu zzu1)
    {
        zzu.zzbY("setCorrelationIdProvider must be called on the main UI thread");
        zzon.zzpU = zzu1;
    }

    public void zza(zzaz zzaz, boolean flag)
    {
        if (zzon.zzpO != null && zzon.zzpO.zzzE != null)
        {
            HashMap hashmap = new HashMap();
            if (flag)
            {
                zzaz = "1";
            } else
            {
                zzaz = "0";
            }
            hashmap.put("isVisible", zzaz);
            zzon.zzpO.zzzE.zzc("onAdVisibilityChanged", hashmap);
        }
    }

    public void zza(zzci zzci)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzff zzff)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void zza(zzfj zzfj, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void zza(com.google.android.gms.internal.zzha.zza zza1)
    {
        zzoj.zza(zzok, new String[] {
            "arf"
        });
        zzol = zzoj.zzdo();
        zzon.zzpL = null;
        zzon.zzpP = zza1;
        if (zzb(zza1))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("AdRenderer: ").append(zzon.zzpM.getClass().getName()).toString());
        }
    }

    public void zza(HashSet hashset)
    {
        zzon.zza(hashset);
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        zzu.zzbY("loadAd must be called on the main UI thread.");
        if (zzon.zzpL != null || zzon.zzpM != null)
        {
            if (zzoo != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzoo = adrequestparcel;
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("Starting ad request.");
        zzaL();
        zzok = zzoj.zzdo();
        if (!adrequestparcel.zzsa)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(com.google.android.gms.ads.internal.client.zzk.zzcA().zzO(zzon.zzpH)).append("\") to get test ads on this device.").toString());
        }
        return zzb(adrequestparcel);
    }

    boolean zza(zzha zzha1)
    {
        return false;
    }

    protected abstract boolean zza(zzha zzha1, zzha zzha2);

    void zzaL()
    {
        zzoj = new zzce("load_ad");
        zzok = new zzcd(-1L, null, null);
        zzol = new zzcd(-1L, null, null);
    }

    public zzd zzaM()
    {
        zzu.zzbY("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.zze.zzw(zzon.zzpK);
    }

    public AdSizeParcel zzaN()
    {
        zzu.zzbY("getAdSize must be called on the main UI thread.");
        return zzon.zzpN;
    }

    public void zzaO()
    {
        zzaR();
    }

    public void zzaP()
    {
        zzu.zzbY("recordManualImpression must be called on the main UI thread.");
        if (zzon.zzpO == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Pinging manual tracking URLs.");
            if (zzon.zzpO.zzCM != null)
            {
                com.google.android.gms.ads.internal.zzo.zzbv().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzon.zzpO.zzCM);
                return;
            }
        }
    }

    protected boolean zzaQ()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Ad closing.");
        if (zzon.zzpS == null)
        {
            return false;
        }
        try
        {
            zzon.zzpS.onAdClosed();
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("Ad opening.");
        if (zzon.zzpS == null)
        {
            return false;
        }
        try
        {
            zzon.zzpS.onAdOpened();
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("Ad finished loading.");
        if (zzon.zzpS == null)
        {
            return false;
        }
        try
        {
            zzon.zzpS.onAdLoaded();
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
        zzon.zzpK.addView(view, zzo.zzbx().zzgt());
    }

    public void zzb(zzha zzha1)
    {
        zzoj.zza(zzol, new String[] {
            "awr"
        });
        zzoj.zza(zzok, new String[] {
            "ttc"
        });
        zzon.zzpM = null;
        if (zzha1.errorCode != -2 && zzha1.errorCode != 3)
        {
            zzo.zzby().zzb(zzon.zzbI());
        }
        if (zzha1.errorCode != -1)
        {
            if (zza(zzha1))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzay("Ad refresh scheduled.");
            }
            if (zzha1.errorCode != -2)
            {
                zze(zzha1.errorCode);
                return;
            }
            if (zzon.zzqf == null)
            {
                zzon.zzqf = new zzhf(zzon.zzpG);
            }
            zzop.zzg(zzon.zzpO);
            if (zza(zzon.zzpO, zzha1))
            {
                zzon.zzpO = zzha1;
                zzon.zzbO();
                if (zzo.zzby().zzfY() != null)
                {
                    zzo.zzby().zzfY().zza(zzoj);
                }
                if (zzon.zzbM())
                {
                    zzaT();
                    return;
                }
            }
        }
    }

    protected abstract boolean zzb(AdRequestParcel adrequestparcel);

    protected abstract boolean zzb(com.google.android.gms.internal.zzha.zza zza1);

    protected void zzc(zzha zzha1)
    {
        if (zzha1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Pinging Impression URLs.");
            zzon.zzpQ.zzfP();
            if (zzha1.zzxG != null)
            {
                com.google.android.gms.ads.internal.zzo.zzbv().zza(zzon.zzpH, zzon.zzpJ.zzGG, zza(zzha1.zzxG, zzha1.zzCC));
                return;
            }
        }
    }

    protected boolean zzc(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = zzon.zzpK.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && com.google.android.gms.ads.internal.zzo.zzbv().zzgl();
    }

    public void zzd(AdRequestParcel adrequestparcel)
    {
        if (zzc(adrequestparcel))
        {
            zza(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("Ad is not visible. Not refreshing ad.");
            zzom.zzf(adrequestparcel);
            return;
        }
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (zzon.zzpS == null)
        {
            return false;
        }
        try
        {
            zzon.zzpS.onAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }
}
