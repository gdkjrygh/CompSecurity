// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
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
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzd;
import com.google.android.gms.ads.internal.purchase.zzg;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzdx;
import com.google.android.gms.internal.zzdy;
import com.google.android.gms.internal.zzdz;
import com.google.android.gms.internal.zzea;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzkw;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzp, zzo, zzl, 
//            zzn

public abstract class zzb extends com.google.android.gms.ads.internal.zza
    implements zzf, zzj, zzdi, zzdz
{

    private final Messenger mMessenger;
    protected final zzef zzoq;
    protected transient boolean zzor;

    public zzb(Context context, AdSizeParcel adsizeparcel, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        this(new zzp(context, adsizeparcel, s, versioninfoparcel), zzef, null);
    }

    zzb(zzp zzp1, zzef zzef, zzn zzn1)
    {
        super(zzp1, zzn1);
        zzoq = zzef;
        mMessenger = new Messenger(new zzfc(zzon.zzpH));
        zzor = false;
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzon.zzpH.getApplicationInfo();
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
        boolean flag1;
        try
        {
            obj = zzon.zzpH.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        displaymetrics = zzon.zzpH.getResources().getDisplayMetrics();
        s = null;
        obj1 = s;
        if (zzon.zzpK != null)
        {
            obj1 = s;
            if (zzon.zzpK.getParent() != null)
            {
                obj1 = new int[2];
                zzon.zzpK.getLocationOnScreen(((int []) (obj1)));
                int l = obj1[0];
                int i1 = obj1[1];
                int j1 = zzon.zzpK.getWidth();
                int k1 = zzon.zzpK.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzon.zzpK.isShown())
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
        s = zzo.zzby().zzfW();
        zzon.zzpQ = new zzhb(s, zzon.zzpG);
        zzon.zzpQ.zzh(adrequestparcel);
        s1 = zzo.zzbv().zza(zzon.zzpH, zzon.zzpK, zzon.zzpN);
        k = zzl.zzq(zzon.zzpH).zzbn();
        flag1 = zzl.zzq(zzon.zzpH).zzbl();
        l2 = 0L;
        l1 = l2;
        if (zzon.zzpU != null)
        {
            try
            {
                l1 = zzon.zzpU.getValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        obj2 = UUID.randomUUID().toString();
        bundle1 = zzo.zzby().zza(zzon.zzpH, this, s);
        arraylist = new ArrayList();
        for (int j = 0; j < zzon.zzqa.size(); j++)
        {
            arraylist.add(zzon.zzqa.keyAt(j));
        }

        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj1)), adrequestparcel, zzon.zzpN, zzon.zzpG, applicationinfo, ((android.content.pm.PackageInfo) (obj)), s, zzo.zzby().getSessionId(), zzon.zzpJ, bundle1, zzon.zzqd, arraylist, bundle, zzo.zzby().zzga(), mMessenger, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag1, k, l1, ((String) (obj2)), zzbz.zzdb(), zzon.zzpF, zzon.zzqb);
    }

    public String getMediationAdapterClassName()
    {
        if (zzon.zzpO == null)
        {
            return null;
        } else
        {
            return zzon.zzpO.zzyb;
        }
    }

    public void onAdClicked()
    {
        if (zzon.zzpO == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (zzon.zzpO.zzFm != null && zzon.zzpO.zzFm.zzxF != null)
        {
            zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzon.zzpO, zzon.zzpG, false, zza(zzon.zzpO.zzFm.zzxF, zzon.zzpO.zzCC));
        }
        if (zzon.zzpO.zzxZ != null && zzon.zzpO.zzxZ.zzxx != null)
        {
            zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzon.zzpO, zzon.zzpG, false, zzon.zzpO.zzxZ.zzxx);
        }
        super.onAdClicked();
    }

    public void pause()
    {
        com.google.android.gms.common.internal.zzu.zzbY("pause must be called on the main UI thread.");
        if (zzon.zzpO != null && zzon.zzbM())
        {
            zzo.zzbx().zza(zzon.zzpO.zzzE.getWebView());
        }
        if (zzon.zzpO != null && zzon.zzpO.zzya != null)
        {
            try
            {
                zzon.zzpO.zzya.pause();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not pause mediation adapter.");
            }
        }
        zzop.zzi(zzon.zzpO);
        zzom.pause();
    }

    public void resume()
    {
        com.google.android.gms.common.internal.zzu.zzbY("resume must be called on the main UI thread.");
        if (zzon.zzpO != null && zzon.zzbM())
        {
            zzo.zzbx().zzb(zzon.zzpO.zzzE.getWebView());
        }
        if (zzon.zzpO != null && zzon.zzpO.zzya != null)
        {
            try
            {
                zzon.zzpO.zzya.resume();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not resume mediation adapter.");
            }
        }
        zzom.resume();
        zzop.zzj(zzon.zzpO);
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void zza(zzff zzff1)
    {
        com.google.android.gms.common.internal.zzu.zzbY("setInAppPurchaseListener must be called on the main UI thread.");
        zzon.zzpV = zzff1;
    }

    public void zza(zzfj zzfj1, String s)
    {
        com.google.android.gms.common.internal.zzu.zzbY("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzon.zzqe = new zzk(s);
        zzon.zzpW = zzfj1;
        if (!zzo.zzby().zzfZ() && zzfj1 != null)
        {
            (new zzc(zzon.zzpH, zzon.zzpW, zzon.zzqe)).zzgi();
        }
    }

    protected void zza(zzha zzha1, boolean flag)
    {
        if (zzha1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping impression URLs.");
        } else
        {
            super.zzc(zzha1);
            if (zzha1.zzFm != null && zzha1.zzFm.zzxG != null)
            {
                zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzha1, zzon.zzpG, flag, zza(zzha1.zzFm.zzxG, zzha1.zzCC));
            }
            if (zzha1.zzxZ != null && zzha1.zzxZ.zzxy != null)
            {
                zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzha1, zzon.zzpG, flag, zzha1.zzxZ.zzxy);
                return;
            }
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new zzd(s, arraylist, zzon.zzpH, zzon.zzpJ.zzGG);
        if (zzon.zzpV == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!com.google.android.gms.ads.internal.client.zzk.zzcA().zzP(zzon.zzpH))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzon.zzpW == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzon.zzqe == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzon.zzqi)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("An in-app purchase request is already in progress, abort");
                return;
            }
            zzon.zzqi = true;
            try
            {
                if (!zzon.zzpW.isValidPurchase(s))
                {
                    zzon.zzqi = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not start In-App purchase.");
                zzon.zzqi = false;
                return;
            }
            zzo.zzbF().zza(zzon.zzpH, zzon.zzpJ.zzGJ, new GInAppPurchaseManagerInfoParcel(zzon.zzpH, zzon.zzqe, arraylist, this));
            return;
        }
        try
        {
            zzon.zzpV.zza(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, com.google.android.gms.ads.internal.purchase.zzf zzf1)
    {
        try
        {
            if (zzon.zzpW != null)
            {
                zzon.zzpW.zza(new zzg(zzon.zzpH, s, flag, i, intent, zzf1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to invoke PlayStorePurchaseListener.");
        }
        zzhl.zzGk.postDelayed(new Runnable(intent) {

            final Intent zzos;
            final zzb zzot;

            public void run()
            {
                int j = zzo.zzbF().zzd(zzos);
                zzo.zzbF();
                if (j == 0 && zzot.zzon.zzpO != null && zzot.zzon.zzpO.zzzE != null && zzot.zzon.zzpO.zzzE.zzgD() != null)
                {
                    zzot.zzon.zzpO.zzzE.zzgD().close();
                }
                zzot.zzon.zzqi = false;
            }

            
            {
                zzot = zzb.this;
                zzos = intent;
                super();
            }
        }, 500L);
    }

    protected boolean zza(AdRequestParcel adrequestparcel, zzha zzha1, boolean flag)
    {
        if (flag || !zzon.zzbM()) goto _L2; else goto _L1
_L1:
        if (zzha1.zzxJ <= 0L) goto _L4; else goto _L3
_L3:
        zzom.zza(adrequestparcel, zzha1.zzxJ);
_L2:
        return zzom.zzbp();
_L4:
        if (zzha1.zzFm != null && zzha1.zzFm.zzxJ > 0L)
        {
            zzom.zza(adrequestparcel, zzha1.zzFm.zzxJ);
        } else
        if (!zzha1.zzCK && zzha1.errorCode == 2)
        {
            zzom.zzf(adrequestparcel);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    boolean zza(zzha zzha1)
    {
        boolean flag = false;
        if (zzoo == null) goto _L2; else goto _L1
_L1:
        AdRequestParcel adrequestparcel;
        adrequestparcel = zzoo;
        zzoo = null;
_L4:
        return zza(adrequestparcel, zzha1, flag);
_L2:
        AdRequestParcel adrequestparcel1 = zzha1.zzCm;
        adrequestparcel = adrequestparcel1;
        if (adrequestparcel1.extras != null)
        {
            flag = adrequestparcel1.extras.getBoolean("_noRefresh", false);
            adrequestparcel = adrequestparcel1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean zza(zzha zzha1, zzha zzha2)
    {
        int i = 0;
        if (zzha1 != null && zzha1.zzyc != null)
        {
            zzha1.zzyc.zza(null);
        }
        if (zzha2.zzyc != null)
        {
            zzha2.zzyc.zza(this);
        }
        int j;
        if (zzha2.zzFm != null)
        {
            j = zzha2.zzFm.zzxM;
            i = zzha2.zzFm.zzxN;
        } else
        {
            j = 0;
        }
        zzon.zzqf.zzf(j, i);
        return true;
    }

    protected boolean zzaU()
    {
        boolean flag = true;
        if (!zzo.zzbv().zza(zzon.zzpH.getPackageManager(), zzon.zzpH.getPackageName(), "android.permission.INTERNET") || !zzo.zzbv().zzG(zzon.zzpH))
        {
            flag = false;
        }
        return flag;
    }

    public void zzaV()
    {
        zzop.zzg(zzon.zzpO);
        zzor = false;
        zzaQ();
        zzon.zzpQ.zzfR();
    }

    public void zzaW()
    {
        zzor = true;
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

    public void zzb(zzha zzha1)
    {
        super.zzb(zzha1);
        if (zzha1.errorCode == 3 && zzha1.zzFm != null && zzha1.zzFm.zzxH != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Pinging no fill URLs.");
            zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzha1, zzon.zzpG, false, zzha1.zzFm.zzxH);
        }
    }

    public boolean zzb(AdRequestParcel adrequestparcel)
    {
        if (!zzaU())
        {
            return false;
        } else
        {
            Bundle bundle = zza(zzo.zzby().zzD(zzon.zzpH));
            zzom.cancel();
            zzon.zzqh = 0;
            adrequestparcel = zza(adrequestparcel, bundle);
            zzon.zzpL = zzo.zzbr().zza(zzon.zzpH, adrequestparcel, zzon.zzpI, this);
            return true;
        }
    }

    public void zzba()
    {
        zzaW();
    }

    public void zzbb()
    {
        if (zzon.zzpO != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Mediation adapter ").append(zzon.zzpO.zzyb).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zza(zzon.zzpO, true);
        zzaT();
    }

    protected boolean zzc(AdRequestParcel adrequestparcel)
    {
        return super.zzc(adrequestparcel) && !zzor;
    }
}
