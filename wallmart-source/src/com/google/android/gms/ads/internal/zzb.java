// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzd;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzdz;
import com.google.android.gms.internal.zzea;
import com.google.android.gms.internal.zzeb;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzho;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzlh;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzq, zzp, zzm, 
//            zzo, zzd

public abstract class zzb extends com.google.android.gms.ads.internal.zza
    implements zzg, zzj, zzdi, zzeb
{

    private final Messenger mMessenger;
    protected final zzeh zzow;
    protected transient boolean zzox;

    public zzb(Context context, AdSizeParcel adsizeparcel, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        this(new zzq(context, adsizeparcel, s, versioninfoparcel), zzeh, null, zzd1);
    }

    zzb(zzq zzq1, zzeh zzeh, zzo zzo1, com.google.android.gms.ads.internal.zzd zzd1)
    {
        super(zzq1, zzo1, zzd1);
        zzow = zzeh;
        mMessenger = new Messenger(new zzfj(zzos.context));
        zzox = false;
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzos.context.getApplicationInfo();
        Object obj;
        Object obj1;
        String s;
        DisplayMetrics displaymetrics;
        String s1;
        Object obj2;
        Bundle bundle1;
        ArrayList arraylist;
        int k;
        long l1;
        long l2;
        boolean flag3;
        try
        {
            obj = zzos.context.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        displaymetrics = zzos.context.getResources().getDisplayMetrics();
        s = null;
        obj1 = s;
        if (zzos.zzqc != null)
        {
            obj1 = s;
            if (zzos.zzqc.getParent() != null)
            {
                obj1 = new int[2];
                zzos.zzqc.getLocationOnScreen(((int []) (obj1)));
                int l = obj1[0];
                int i1 = obj1[1];
                int j1 = zzos.zzqc.getWidth();
                int k1 = zzos.zzqc.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzos.zzqc.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (l + j1 > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (i1 + k1 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (l <= displaymetrics.widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (i1 <= displaymetrics.heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj1 = new Bundle(5);
                ((Bundle) (obj1)).putInt("x", l);
                ((Bundle) (obj1)).putInt("y", i1);
                ((Bundle) (obj1)).putInt("width", j1);
                ((Bundle) (obj1)).putInt("height", k1);
                ((Bundle) (obj1)).putInt("visible", i);
            }
        }
        s = zzp.zzbA().zzga();
        zzos.zzqi = new zzhk(s, zzos.zzpZ);
        zzos.zzqi.zzh(adrequestparcel);
        s1 = zzp.zzbx().zza(zzos.context, zzos.zzqc, zzos.zzqf);
        k = zzm.zzq(zzos.context).zzbp();
        flag3 = zzm.zzq(zzos.context).zzbn();
        l2 = 0L;
        l1 = l2;
        if (zzos.zzqm != null)
        {
            try
            {
                l1 = zzos.zzqm.getValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle1 = zzp.zzbA().zza(zzos.context, this, s);
        arraylist = new ArrayList();
        for (int j = 0; j < zzos.zzqs.size(); j++)
        {
            arraylist.add(zzos.zzqs.keyAt(j));
        }

        boolean flag1;
        boolean flag2;
        if (zzos.zzqn != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (zzos.zzqo != null && zzp.zzbA().zzgj())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj1)), adrequestparcel, zzos.zzqf, zzos.zzpZ, applicationinfo, ((PackageInfo) (obj)), s, zzp.zzbA().getSessionId(), zzos.zzqb, bundle1, zzos.zzqv, arraylist, bundle, zzp.zzbA().zzge(), mMessenger, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag3, k, l1, ((String) (obj2)), zzby.zzde(), zzos.zzpY, zzos.zzqt, new CapabilityParcel(flag1, flag2));
    }

    public String getMediationAdapterClassName()
    {
        if (zzos.zzqg == null)
        {
            return null;
        } else
        {
            return zzos.zzqg.zzyS;
        }
    }

    public void onAdClicked()
    {
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (zzos.zzqg.zzGG != null && zzos.zzqg.zzGG.zzyw != null)
        {
            zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzp.zzbx().zza(zzos.context, zzos.zzqg.zzGG.zzyw, zzos.zzqg.zzDO));
        }
        if (zzos.zzqg.zzyQ != null && zzos.zzqg.zzyQ.zzyp != null)
        {
            zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzp.zzbx().zza(zzos.context, zzos.zzqg.zzyQ.zzyp, zzos.zzqg.zzDO));
        }
        super.onAdClicked();
    }

    public void pause()
    {
        zzx.zzch("pause must be called on the main UI thread.");
        if (zzos.zzqg != null && zzos.zzqg.zzAR != null && zzos.zzbP())
        {
            zzp.zzbz().zza(zzos.zzqg.zzAR.getWebView());
        }
        if (zzos.zzqg != null && zzos.zzqg.zzyR != null)
        {
            try
            {
                zzos.zzqg.zzyR.pause();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not pause mediation adapter.");
            }
        }
        zzou.zzg(zzos.zzqg);
        zzor.pause();
    }

    public void resume()
    {
        zzx.zzch("resume must be called on the main UI thread.");
        if (zzos.zzqg != null && zzos.zzqg.zzAR != null && zzos.zzbP())
        {
            zzp.zzbz().zzb(zzos.zzqg.zzAR.getWebView());
        }
        if (zzos.zzqg != null && zzos.zzqg.zzyR != null)
        {
            try
            {
                zzos.zzqg.zzyR.resume();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not resume mediation adapter.");
            }
        }
        zzor.resume();
        zzou.zzh(zzos.zzqg);
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void zza(zzfm zzfm1)
    {
        zzx.zzch("setInAppPurchaseListener must be called on the main UI thread.");
        zzos.zzqn = zzfm1;
    }

    public void zza(zzfq zzfq1, String s)
    {
        zzx.zzch("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzos.zzqw = new zzk(s);
        zzos.zzqo = zzfq1;
        if (!zzp.zzbA().zzgd() && zzfq1 != null)
        {
            (new zzc(zzos.context, zzos.zzqo, zzos.zzqw)).zzgn();
        }
    }

    protected void zza(zzhj zzhj1, boolean flag)
    {
        if (zzhj1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.zzc(zzhj1);
            if (zzhj1.zzGG != null && zzhj1.zzGG.zzyx != null)
            {
                zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzhj1, zzos.zzpZ, flag, zzp.zzbx().zza(zzos.context, zzhj1.zzGG.zzyx, zzhj1.zzDO));
            }
            if (zzhj1.zzyQ != null && zzhj1.zzyQ.zzyq != null)
            {
                zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzhj1, zzos.zzpZ, flag, zzp.zzbx().zza(zzos.context, zzhj1.zzyQ.zzyq, zzhj1.zzDO));
                return;
            }
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new zzd(s, arraylist, zzos.context, zzos.zzqb.zzIz);
        if (zzos.zzqn == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!com.google.android.gms.ads.internal.client.zzk.zzcE().zzR(zzos.context))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzos.zzqo == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzos.zzqw == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzos.zzqA)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("An in-app purchase request is already in progress, abort");
                return;
            }
            zzos.zzqA = true;
            try
            {
                if (!zzos.zzqo.isValidPurchase(s))
                {
                    zzos.zzqA = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not start In-App purchase.");
                zzos.zzqA = false;
                return;
            }
            zzp.zzbH().zza(zzos.context, zzos.zzqb.zzIC, new GInAppPurchaseManagerInfoParcel(zzos.context, zzos.zzqw, arraylist, this));
            return;
        }
        try
        {
            zzos.zzqn.zza(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        try
        {
            if (zzos.zzqo != null)
            {
                zzos.zzqo.zza(new com.google.android.gms.ads.internal.purchase.zzg(zzos.context, s, flag, i, intent, zzf));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to invoke PlayStorePurchaseListener.");
        }
        zzhu.zzHK.postDelayed(new Runnable(intent) {

            final Intent zzoy;
            final zzb zzoz;

            public void run()
            {
                int j = zzp.zzbH().zzd(zzoy);
                zzp.zzbH();
                if (j == 0 && zzoz.zzos.zzqg != null && zzoz.zzos.zzqg.zzAR != null && zzoz.zzos.zzqg.zzAR.zzgQ() != null)
                {
                    zzoz.zzos.zzqg.zzAR.zzgQ().close();
                }
                zzoz.zzos.zzqA = false;
            }

            
            {
                zzoz = zzb.this;
                zzoy = intent;
                super();
            }
        }, 500L);
    }

    public boolean zza(AdRequestParcel adrequestparcel, zzcd zzcd1)
    {
        if (!zzaU())
        {
            return false;
        }
        Bundle bundle = zza(zzp.zzbA().zzF(zzos.context));
        zzor.cancel();
        zzos.zzqz = 0;
        adrequestparcel = zza(adrequestparcel, bundle);
        zzcd1.zzd("seq_num", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDB);
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDQ != null)
        {
            zzcd1.zzd("request_id", ((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDQ);
        }
        if (((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDz != null)
        {
            zzcd1.zzd("app_version", String.valueOf(((com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza) (adrequestparcel)).zzDz.versionCode));
        }
        zzos.zzqd = zzp.zzbt().zza(zzos.context, adrequestparcel, zzos.zzqa, this);
        return true;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzhj zzhj1, boolean flag)
    {
        if (flag || !zzos.zzbP()) goto _L2; else goto _L1
_L1:
        if (zzhj1.zzyA <= 0L) goto _L4; else goto _L3
_L3:
        zzor.zza(adrequestparcel, zzhj1.zzyA);
_L2:
        return zzor.zzbr();
_L4:
        if (zzhj1.zzGG != null && zzhj1.zzGG.zzyA > 0L)
        {
            zzor.zza(adrequestparcel, zzhj1.zzGG.zzyA);
        } else
        if (!zzhj1.zzDX && zzhj1.errorCode == 2)
        {
            zzor.zzf(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    boolean zza(zzhj zzhj1)
    {
        boolean flag = false;
        if (zzot == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = zzot;
        zzot = null;
_L4:
        return zza(adrequestparcel, zzhj1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = zzhj1.zzDy;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.extras != null)
        {
            flag = adrequestparcel1.extras.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        int i = 0;
        if (zzhj1 != null && zzhj1.zzyT != null)
        {
            zzhj1.zzyT.zza(null);
        }
        if (zzhj2.zzyT != null)
        {
            zzhj2.zzyT.zza(this);
        }
        int j;
        if (zzhj2.zzGG != null)
        {
            j = zzhj2.zzGG.zzyD;
            i = zzhj2.zzGG.zzyE;
        } else
        {
            j = 0;
        }
        zzos.zzqx.zzf(j, i);
        return true;
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzp.zzbx().zza(zzos.context.getPackageManager(), zzos.context.getPackageName(), "android.permission.INTERNET") || !zzp.zzbx().zzI(zzos.context))
        {
            flag = false;
        }
        return flag;
    }

    public void zzaV()
    {
        zzou.zze(zzos.zzqg);
        zzox = false;
        zzaQ();
        zzos.zzqi.zzfV();
    }

    public void zzaW()
    {
        zzox = true;
        zzaS();
    }

    public void zzaX()
    {
        onAdClicked();
    }

    public void zzaY()
    {
        zzaV();
    }

    public void zzaZ()
    {
        zzaO();
    }

    public void zzb(zzhj zzhj1)
    {
        super.zzb(zzhj1);
        if (zzhj1.errorCode == 3 && zzhj1.zzGG != null && zzhj1.zzGG.zzyy != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging no fill URLs.");
            zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzhj1, zzos.zzpZ, false, zzhj1.zzGG.zzyy);
        }
    }

    protected boolean zzb(AdRequestParcel adrequestparcel)
    {
        return super.zzb(adrequestparcel) && !zzox;
    }

    public void zzba()
    {
        zzaW();
    }

    public void zzbb()
    {
        if (zzos.zzqg != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Mediation adapter ").append(zzos.zzqg.zzyS).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zza(zzos.zzqg, true);
        zzaT();
    }
}
