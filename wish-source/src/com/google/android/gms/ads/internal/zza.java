// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzg;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzab;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzav;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzbg;
import com.google.android.gms.internal.zzbh;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbn;
import com.google.android.gms.internal.zzbq;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzbw;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzcl;
import com.google.android.gms.internal.zzcm;
import com.google.android.gms.internal.zzcp;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzdo;
import com.google.android.gms.internal.zzdr;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzfa;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfn;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzt;
import com.google.android.gms.internal.zzw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzh, zzg, zzf, 
//            InterstitialAdParameterParcel, zzb, zzd

public class com.google.android.gms.ads.internal.zza extends com.google.android.gms.ads.internal.client.zzn.zza
    implements com.google.android.gms.ads.internal.client.zza, zzf, zzi, zzj, com.google.android.gms.ads.internal.request.zza, com.google.android.gms.ads.internal.zzc, zzbq, zzbu, zzbw, zzcl, zzdh, com.google.android.gms.internal.zzef.zza, zzfe, zzt
{
    public static final class zza extends ViewSwitcher
    {

        private final zzfn zzmF;

        static zzfn zza(zza zza1)
        {
            return zza1.zzmF;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzmF.zzc(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof zzgd))
                {
                    ((zzgd)view).destroy();
                }
            }

            super.removeAllViews();
        }

        public zza(Context context)
        {
            super(context);
            zzmF = new zzfn(context);
        }
    }

    static class zzb
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
    {

        public final String zzmG;
        public final Context zzmH;
        public final com.google.android.gms.internal.zzk zzmI;
        public final VersionInfoParcel zzmJ;
        public zzfh zzmK;
        public zzl zzmL;
        public zza zzmM;
        public zzm zzmN;
        public zzfh zzmO;
        public AdSizeParcel zzmP;
        public zzfa zzmQ;
        public com.google.android.gms.internal.zzfa.zza zzmR;
        public zzfb zzmS;
        public zzp zzmT;
        public zzdv zzmU;
        public zzdr zzmV;
        public zzbm zzmW;
        public zzbn zzmX;
        public zzbc zzmY;
        public List zzmZ;
        public zzk zzna;
        public zzff zznb;
        public View zznc;
        public int zznd;
        public boolean zzne;
        public boolean zznf;
        public zzq zzng;
        private HashSet zznh;
        private int zzni;
        private int zznj;
        private zzfq zznk;

        private void zzf(boolean flag)
        {
            boolean flag1;
            flag1 = true;
            break MISSING_BLOCK_LABEL_3;
            if (zzmM != null && zzmQ != null && zzmQ.zzwz != null && zzmQ.zzwz.zzft().zzbg() && (!flag || zznk.tryAcquire()))
            {
                int ai[] = new int[2];
                zzmM.getLocationOnScreen(ai);
                int i = com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(zzmH, ai[0]);
                int j = com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(zzmH, ai[1]);
                if (i != zzni || j != zznj)
                {
                    zzni = i;
                    zznj = j;
                    zzge zzge1 = zzmQ.zzwz.zzft();
                    i = zzni;
                    j = zznj;
                    if (!flag)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    zzge1.zza(i, j, flag);
                    return;
                }
            }
            return;
        }

        public void destroy()
        {
            zzmN = null;
            zzmT = null;
            zzmU = null;
            zzmV = null;
            zzmY = null;
            zzng = null;
            if (zzmH != null && (zzmH instanceof Activity) && zzmM != null)
            {
                zzh.zzaS().zzb((Activity)zzmH, this);
                zzh.zzaQ().zzb((Activity)zzmH, this);
            }
            zzg(false);
            if (zzmM != null)
            {
                zzmM.removeAllViews();
            }
            zzaC();
            zzaE();
            zzmQ = null;
        }

        public void onGlobalLayout()
        {
            zzf(false);
        }

        public void onScrollChanged()
        {
            zzf(true);
        }

        public void zza(HashSet hashset)
        {
            zznh = hashset;
        }

        public HashSet zzaB()
        {
            return zznh;
        }

        public void zzaC()
        {
            if (zzmQ != null && zzmQ.zzwz != null)
            {
                zzmQ.zzwz.destroy();
            }
        }

        public void zzaD()
        {
            if (zzmQ != null && zzmQ.zzwz != null)
            {
                zzmQ.zzwz.stopLoading();
            }
        }

        public void zzaE()
        {
            if (zzmQ == null || zzmQ.zzuV == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            zzmQ.zzuV.destroy();
            return;
            RemoteException remoteexception;
            remoteexception;
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not destroy mediation adapter.");
            return;
        }

        public void zzg(boolean flag)
        {
            if (zznd == 0)
            {
                zzaD();
            }
            if (zzmK != null)
            {
                zzmK.cancel();
            }
            if (zzmO != null)
            {
                zzmO.cancel();
            }
            if (flag)
            {
                zzmQ = null;
            }
        }

        public zzb(Context context, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel)
        {
            this(context, adsizeparcel, s, versioninfoparcel, null);
        }

        zzb(Context context, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel, com.google.android.gms.internal.zzk zzk1)
        {
            zznb = null;
            zznc = null;
            zznd = 0;
            zzne = false;
            zznf = false;
            zznh = null;
            zzni = -1;
            zznj = -1;
            com.google.android.gms.internal.zzat.zzo(context);
            if (adsizeparcel.zzpY || adsizeparcel.zzqa)
            {
                zzmM = null;
            } else
            {
                zzmM = new zza(context);
                zzmM.setMinimumWidth(adsizeparcel.widthPixels);
                zzmM.setMinimumHeight(adsizeparcel.heightPixels);
                zzmM.setVisibility(4);
            }
            if (context != null && (context instanceof Activity) && zzmM != null)
            {
                zzh.zzaQ().zza((Activity)context, this);
                zzh.zzaQ().zza((Activity)context, this);
            }
            zzmP = adsizeparcel;
            zzmG = s;
            zzmH = context;
            zzmJ = versioninfoparcel;
            if (zzk1 == null)
            {
                zzk1 = new com.google.android.gms.internal.zzk(new com.google.android.gms.ads.internal.zzd(this));
            }
            zzmI = zzk1;
            zznk = new zzfq(200L);
        }
    }


    private boolean zzmA;
    private boolean zzmB;
    private zzay zzmr;
    private zzax zzms;
    private zzax zzmt;
    private AdRequestParcel zzmu;
    private final zzcr zzmv;
    private final zzb zzmw;
    private final com.google.android.gms.ads.internal.zzg zzmx;
    private final com.google.android.gms.internal.zzv zzmy;
    private final Messenger zzmz;

    public com.google.android.gms.ads.internal.zza(Context context, AdSizeParcel adsizeparcel, String s, zzcr zzcr, VersionInfoParcel versioninfoparcel)
    {
        this(new zzb(context, adsizeparcel, s, versioninfoparcel), zzcr, null);
    }

    com.google.android.gms.ads.internal.zza(zzb zzb1, zzcr zzcr, com.google.android.gms.ads.internal.zzg zzg1)
    {
        zzmw = zzb1;
        zzmv = zzcr;
        if (zzg1 == null)
        {
            zzg1 = new com.google.android.gms.ads.internal.zzg(this);
        }
        zzmx = zzg1;
        zzh.zzaQ().zzw(zzmw.zzmH);
        zzh.zzaT().zzb(zzmw.zzmH, zzmw.zzmJ);
        zzmy = zzh.zzaT().zzeR();
        zzmz = new Messenger(new zzdo(zzmw.zzmH));
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = zzmw.zzmH.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        String s;
        DisplayMetrics displaymetrics;
        String s1;
        String s2;
        Bundle bundle1;
        int j;
        long l1;
        long l2;
        boolean flag1;
        try
        {
            packageinfo = zzmw.zzmH.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        displaymetrics = zzmw.zzmH.getResources().getDisplayMetrics();
        s = null;
        obj = s;
        if (zzmw.zzmM != null)
        {
            obj = s;
            if (zzmw.zzmM.getParent() != null)
            {
                obj = new int[2];
                zzmw.zzmM.getLocationOnScreen(((int []) (obj)));
                int k = obj[0];
                int l = obj[1];
                int i1 = zzmw.zzmM.getWidth();
                int j1 = zzmw.zzmM.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (zzmw.zzmM.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (k + i1 > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (l + j1 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (k <= displaymetrics.widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (l <= displaymetrics.heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj = new Bundle(5);
                ((Bundle) (obj)).putInt("x", k);
                ((Bundle) (obj)).putInt("y", l);
                ((Bundle) (obj)).putInt("width", i1);
                ((Bundle) (obj)).putInt("height", j1);
                ((Bundle) (obj)).putInt("visible", i);
            }
        }
        s = zzh.zzaT().zzeK();
        zzmw.zzmS = new zzfb(s, zzmw.zzmG);
        zzmw.zzmS.zze(adrequestparcel);
        s1 = zzh.zzaQ().zza(zzmw.zzmH, zzmw.zzmM, zzmw.zzmP);
        j = com.google.android.gms.ads.internal.zzf.zzl(zzmw.zzmH).zzaJ();
        flag1 = com.google.android.gms.ads.internal.zzf.zzl(zzmw.zzmH).isInitialized();
        l2 = 0L;
        l1 = l2;
        if (zzmw.zzng != null)
        {
            try
            {
                l1 = zzmw.zzng.getValue();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot get correlation id, default to 0.");
                l1 = l2;
            }
        }
        s2 = UUID.randomUUID().toString();
        bundle1 = zzh.zzaT().zza(zzmw.zzmH, this, s);
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(((Bundle) (obj)), adrequestparcel, zzmw.zzmP, zzmw.zzmG, applicationinfo, packageinfo, s, zzh.zzaT().getSessionId(), zzmw.zzmJ, bundle1, zzmw.zzmZ, bundle, zzh.zzaT().zzeO(), zzmz, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s1, flag1, j, l1, s2, com.google.android.gms.internal.zzat.zzcg());
    }

    static zzb zza(com.google.android.gms.ads.internal.zza zza1)
    {
        return zza1.zzmw;
    }

    private zzgd zza(com.google.android.gms.ads.internal.zzb zzb1)
    {
        if (zzmw.zzmP.zzpY)
        {
            zzgd zzgd1 = zzh.zzaR().zza(zzmw.zzmH, zzmw.zzmP, false, false, zzmw.zzmI, zzmw.zzmJ);
            zzgd1.zzft().zzb(this, null, this, this, ((Boolean)zzat.zzrO.get()).booleanValue(), this, this, zzb1, null);
            return zzgd1;
        }
        if (zzmw.zzmP.zzqa) goto _L2; else goto _L1
_L1:
        Object obj = zzmw.zzmM.getNextView();
        if (!(obj instanceof zzgd)) goto _L4; else goto _L3
_L3:
        obj = (zzgd)obj;
        ((zzgd) (obj)).zza(zzmw.zzmH, zzmw.zzmP);
_L5:
        ((zzgd) (obj)).zzft().zzb(this, this, this, this, false, this, null, zzb1, this);
        return ((zzgd) (obj));
_L4:
        if (obj != null)
        {
            zzmw.zzmM.removeView(((View) (obj)));
        }
        zzgd zzgd2 = zzh.zzaR().zza(zzmw.zzmH, zzmw.zzmP, false, false, zzmw.zzmI, zzmw.zzmJ);
        obj = zzgd2;
        if (zzmw.zzmP.zzpZ == null)
        {
            zzc(zzgd2.getWebView());
            obj = zzgd2;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    private void zza(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (zzmw.zzmN == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        zzmw.zzmN.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void zza(Bundle bundle)
    {
        zzh.zzaQ().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, "gmob-apps", bundle);
    }

    private void zzaA()
    {
        if (zzmw.zznd == 0)
        {
            zzmw.zzaC();
            zzmw.zzmQ = null;
            zzmw.zznf = false;
            zzmB = false;
        }
    }

    private void zzat()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad closing.");
        if (zzmw.zzmN == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.zzmN.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void zzau()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad leaving application.");
        if (zzmw.zzmN == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.zzmN.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void zzav()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad opening.");
        if (zzmw.zzmN == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzmw.zzmN.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void zzaw()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad finished loading.");
        if (zzmw.zzmN != null)
        {
            try
            {
                zzmw.zzmN.onAdLoaded();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
            }
        }
        zzmB = true;
    }

    private void zzax()
    {
        try
        {
            if ((zzmw.zzmQ.zzBx instanceof zzbg) && zzmw.zzmW != null)
            {
                zzmw.zzmW.zza((zzbg)zzmw.zzmQ.zzBx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    private void zzay()
    {
        try
        {
            if ((zzmw.zzmQ.zzBx instanceof zzbh) && zzmw.zzmX != null)
            {
                zzmw.zzmX.zza((zzbh)zzmw.zzmQ.zzBx);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    private boolean zzb(zzfa zzfa1)
    {
        if (zzfa1.zzzt)
        {
            View view;
            try
            {
                zzfa1 = (View)com.google.android.gms.dynamic.zze.zzg(zzfa1.zzuV.getView());
            }
            // Misplaced declaration of an exception variable
            catch (zzfa zzfa1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get View from mediation adapter.", zzfa1);
                return false;
            }
            view = zzmw.zzmM.getNextView();
            if (view != null)
            {
                if (view instanceof zzgd)
                {
                    ((zzgd)view).destroy();
                }
                zzmw.zzmM.removeView(view);
            }
            try
            {
                zzc(zzfa1);
            }
            // Misplaced declaration of an exception variable
            catch (zzfa zzfa1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not add mediation view to view hierarchy.", zzfa1);
                return false;
            }
        } else
        if (zzfa1.zzBu != null)
        {
            zzfa1.zzwz.zza(zzfa1.zzBu);
            zzmw.zzmM.removeAllViews();
            zzmw.zzmM.setMinimumWidth(zzfa1.zzBu.widthPixels);
            zzmw.zzmM.setMinimumHeight(zzfa1.zzBu.heightPixels);
            zzc(zzfa1.zzwz.getWebView());
        }
        if (zzmw.zzmM.getChildCount() > 1)
        {
            zzmw.zzmM.showNext();
        }
        if (zzmw.zzmQ != null)
        {
            zzfa1 = zzmw.zzmM.getNextView();
            if (zzfa1 instanceof zzgd)
            {
                ((zzgd)zzfa1).zza(zzmw.zzmH, zzmw.zzmP);
            } else
            if (zzfa1 != null)
            {
                zzmw.zzmM.removeView(zzfa1);
            }
            zzmw.zzaE();
        }
        zzmw.zzmM.setVisibility(0);
        return true;
    }

    private void zze(boolean flag)
    {
        if (zzmw.zzmQ == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging Impression URLs.");
            zzmw.zzmS.zzeD();
            if (zzmw.zzmQ.zzuD != null)
            {
                zzh.zzaQ().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzb(zzmw.zzmQ.zzuD));
            }
            if (zzmw.zzmQ.zzBt != null && zzmw.zzmQ.zzBt.zzuD != null)
            {
                zzh.zzba().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzmw.zzmQ, zzmw.zzmG, flag, zzb(zzmw.zzmQ.zzBt.zzuD));
            }
            if (zzmw.zzmQ.zzuU != null && zzmw.zzmQ.zzuU.zzux != null)
            {
                zzh.zzba().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzmw.zzmQ, zzmw.zzmG, flag, zzmw.zzmQ.zzuU.zzux);
                return;
            }
        }
    }

    public void destroy()
    {
        zzv.zzbI("destroy must be called on the main UI thread.");
        zzmx.cancel();
        zzmy.zze(zzmw.zzmQ);
        zzmw.destroy();
    }

    public String getMediationAdapterClassName()
    {
        if (zzmw.zzmQ != null)
        {
            return zzmw.zzmQ.zzuW;
        } else
        {
            return null;
        }
    }

    public boolean isReady()
    {
        zzv.zzbI("isLoaded must be called on the main UI thread.");
        return zzmw.zzmK == null && zzmw.zzmO == null && zzmw.zzmQ != null;
    }

    public void onAdClicked()
    {
        recordClick();
    }

    public void onAppEvent(String s, String s1)
    {
        if (zzmw.zzmT == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzmw.zzmT.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        zzv.zzbI("pause must be called on the main UI thread.");
        if (zzmw.zzmQ != null && zzmw.zznd == 0)
        {
            zzh.zzaS().zza(zzmw.zzmQ.zzwz.getWebView());
        }
        if (zzmw.zzmQ != null && zzmw.zzmQ.zzuV != null)
        {
            try
            {
                zzmw.zzmQ.zzuV.pause();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not pause mediation adapter.");
            }
        }
        zzmy.zzf(zzmw.zzmQ);
        zzmx.pause();
    }

    public void recordClick()
    {
        if (zzmw.zzmQ == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging click URLs.");
            zzmw.zzmS.zzeE();
            if (zzmw.zzmQ.zzuC != null)
            {
                zzh.zzaQ().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzb(zzmw.zzmQ.zzuC));
            }
            if (zzmw.zzmQ.zzBt != null && zzmw.zzmQ.zzBt.zzuC != null)
            {
                zzh.zzba().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzmw.zzmQ, zzmw.zzmG, false, zzb(zzmw.zzmQ.zzBt.zzuC));
            }
            if (zzmw.zzmQ.zzuU != null && zzmw.zzmQ.zzuU.zzuw != null)
            {
                zzh.zzba().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzmw.zzmQ, zzmw.zzmG, false, zzmw.zzmQ.zzuU.zzuw);
            }
            if (zzmw.zzmL != null)
            {
                try
                {
                    zzmw.zzmL.onAdClicked();
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

    public void recordImpression()
    {
        zze(false);
    }

    public void resume()
    {
        zzv.zzbI("resume must be called on the main UI thread.");
        if (zzmw.zzmQ != null && zzmw.zznd == 0)
        {
            zzh.zzaS().zzb(zzmw.zzmQ.zzwz.getWebView());
        }
        if (zzmw.zzmQ != null && zzmw.zzmQ.zzuV != null)
        {
            try
            {
                zzmw.zzmQ.zzuV.resume();
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not resume mediation adapter.");
            }
        }
        zzmx.resume();
        zzmy.zzg(zzmw.zzmQ);
    }

    public void showInterstitial()
    {
        zzv.zzbI("showInterstitial must be called on the main UI thread.");
        if (!zzmw.zzmP.zzpY)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (zzmw.zzmQ == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("The interstitial has not loaded.");
                return;
            }
            if (!zzmB)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", zzmw.zzmH.getApplicationContext().getPackageName());
                bundle.putString("action", "show_interstitial_before_load_finish");
                zza(bundle);
            }
            if (!zzh.zzaQ().zzB(zzmw.zzmH))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle1 = new Bundle();
                bundle1.putString("appid", zzmw.zzmH.getApplicationContext().getPackageName());
                bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                zza(bundle1);
            }
            if (zzmw.zznd != 1)
            {
                if (zzmw.zzmQ.zzwz.zzfx())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("The interstitial is already showing.");
                    return;
                }
                zzmw.zzmQ.zzwz.zzB(true);
                if (zzmw.zzmQ.zzwz.zzft().zzbg() || zzmw.zzmQ.zzBs != null)
                {
                    zzw zzw1 = zzmy.zza(zzmw.zzmP, zzmw.zzmQ);
                    if (zzmw.zzmQ.zzwz.zzft().zzbg() && zzw1 != null)
                    {
                        zzw1.zza(this);
                    }
                }
                if (zzmw.zzmQ.zzzt)
                {
                    try
                    {
                        zzmw.zzmQ.zzuV.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial.", remoteexception);
                    }
                    zzaA();
                    return;
                }
                Object obj = new InterstitialAdParameterParcel(zzmw.zznf, zzas());
                int j = zzmw.zzmQ.zzwz.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzmw.zzmQ.orientation;
                }
                obj = new AdOverlayInfoParcel(this, this, this, zzmw.zzmQ.zzwz, i, zzmw.zzmJ, zzmw.zzmQ.zzzy, ((InterstitialAdParameterParcel) (obj)));
                zzh.zzaO().zza(zzmw.zzmH, ((AdOverlayInfoParcel) (obj)));
                return;
            }
        }
    }

    public void stopLoading()
    {
        zzv.zzbI("stopLoading must be called on the main UI thread.");
        zzmw.zzg(true);
    }

    Bundle zza(zzae zzae1)
    {
        if (zzae1 != null)
        {
            if (zzae1.zzbD())
            {
                zzae1.wakeup();
            }
            zzab zzab1 = zzae1.zzbB();
            if (zzab1 != null)
            {
                zzae1 = zzab1.zzbs();
                com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("In AdManger: loadAd, ").append(zzab1.toString()).toString());
            } else
            {
                zzae1 = null;
            }
            if (zzae1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", zzae1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public String zza(String s, String s1, int i)
    {
        String s2 = s;
        if (((Boolean)zzat.zzrQ.get()).booleanValue())
        {
            s2 = s;
            if (com.google.android.gms.ads.internal.zzf.zzl(zzmw.zzmH).isInitialized())
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

    public void zza(int i, int j, int k, int l)
    {
        zzav();
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        zzv.zzbI("setAdSize must be called on the main UI thread.");
        zzmw.zzmP = adsizeparcel;
        if (zzmw.zzmQ != null && zzmw.zznd == 0)
        {
            zzmw.zzmQ.zzwz.zza(adsizeparcel);
        }
        if (zzmw.zzmM.getChildCount() > 1)
        {
            zzmw.zzmM.removeView(zzmw.zzmM.getNextView());
        }
        zzmw.zzmM.setMinimumWidth(adsizeparcel.widthPixels);
        zzmw.zzmM.setMinimumHeight(adsizeparcel.heightPixels);
        zzmw.zzmM.requestLayout();
    }

    public void zza(zzl zzl1)
    {
        zzv.zzbI("setAdListener must be called on the main UI thread.");
        zzmw.zzmL = zzl1;
    }

    public void zza(zzm zzm1)
    {
        zzv.zzbI("setAdListener must be called on the main UI thread.");
        zzmw.zzmN = zzm1;
    }

    public void zza(zzp zzp1)
    {
        zzv.zzbI("setAppEventListener must be called on the main UI thread.");
        zzmw.zzmT = zzp1;
    }

    public void zza(zzq zzq1)
    {
        zzv.zzbI("setCorrelationIdProvider must be called on the main UI thread");
        zzmw.zzng = zzq1;
    }

    public void zza(zzbc zzbc1)
    {
        zzv.zzbI("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzmw.zzmY = zzbc1;
    }

    public void zza(zzdr zzdr1)
    {
        zzv.zzbI("setInAppPurchaseListener must be called on the main UI thread.");
        zzmw.zzmV = zzdr1;
    }

    public void zza(zzdv zzdv1, String s)
    {
        zzv.zzbI("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzmw.zzna = new zzk(s);
        zzmw.zzmU = zzdv1;
        if (!zzh.zzaT().zzeN() && zzdv1 != null)
        {
            (new zzc(zzmw.zzmH, zzmw.zzmU, zzmw.zzna)).zzeW();
        }
    }

    public void zza(com.google.android.gms.internal.zzfa.zza zza1)
    {
        Object obj = null;
        zzmr.zza(zzms, new String[] {
            "arf"
        });
        zzmt = zzmr.zzct();
        zzmw.zzmK = null;
        zzmw.zzmR = zza1;
        zzgd zzgd1;
        if (!zzmw.zzmP.zzqa)
        {
            com.google.android.gms.ads.internal.zzb zzb1 = new com.google.android.gms.ads.internal.zzb();
            zzgd1 = zza(zzb1);
            zzb1.zza(new zzb.zzb(zza1, zzgd1));
            zzgd1.setOnTouchListener(new android.view.View.OnTouchListener(zzb1) {

                final com.google.android.gms.ads.internal.zzb zzmC;
                final com.google.android.gms.ads.internal.zza zzmD;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    zzmC.recordClick();
                    return false;
                }

            
            {
                zzmD = com.google.android.gms.ads.internal.zza.this;
                zzmC = zzb1;
                super();
            }
            });
            zzgd1.setOnClickListener(new android.view.View.OnClickListener(zzb1) {

                final com.google.android.gms.ads.internal.zzb zzmC;
                final com.google.android.gms.ads.internal.zza zzmD;

                public void onClick(View view)
                {
                    zzmC.recordClick();
                }

            
            {
                zzmD = com.google.android.gms.ads.internal.zza.this;
                zzmC = zzb1;
                super();
            }
            });
        } else
        {
            zzgd1 = null;
        }
        if (zza1.zzmP != null)
        {
            zzmw.zzmP = zza1.zzmP;
        }
        if (zza1.errorCode != -2)
        {
            zza(new zzfa(zza1, zzgd1, null, null, null, null, null));
            return;
        }
        if (!zza1.zzBz.zzzt && zza1.zzBz.zzzC)
        {
            if (zza1.zzBz.zzwB != null)
            {
                obj = Uri.parse(zza1.zzBz.zzwB).buildUpon().query(null).build().toString();
            }
            obj = new zzaz(this, ((String) (obj)), zza1.zzBz.zzzr);
            try
            {
                if (zzmw.zzmY != null)
                {
                    zzmw.zznd = 1;
                    zzmw.zzmY.zza(((com.google.android.gms.internal.zzbb) (obj)));
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
            catch (RuntimeException runtimeexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Exception happens when invoking onCustomRenderedAdLoaded.", runtimeexception);
                zzh.zzaT().zzc(runtimeexception, true);
            }
        }
        zzmw.zznd = 0;
        zzmw.zzmO = zzh.zzaP().zza(zzmw.zzmH, this, zza1, zzmw.zzmI, zzgd1, zzmv, this);
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("AdRenderer: ").append(zzmw.zzmO.getClass().getName()).toString());
    }

    public void zza(zzfa zzfa1)
    {
        zzmr.zza(zzmt, new String[] {
            "awr"
        });
        zzmr.zza(zzms, new String[] {
            "ttc"
        });
        zzmw.zzmO = null;
        boolean flag = zzmw.zzmP.zzqa;
        zza(((List) (null)));
        if (zzfa1.errorCode != -2 && zzfa1.errorCode != 3)
        {
            zzh.zzaT().zzb(zzmw.zzaB());
        }
        if (zzfa1.errorCode != -1)
        {
            if (zza(zzfa1, flag))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Ad refresh scheduled.");
            }
            if (zzfa1.errorCode == 3 && zzfa1.zzBt != null && zzfa1.zzBt.zzuE != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging no fill URLs.");
                zzh.zzba().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzfa1, zzmw.zzmG, false, zzfa1.zzBt.zzuE);
            }
            if (zzfa1.errorCode != -2)
            {
                zza(zzfa1.errorCode);
                return;
            }
            if (!zzmw.zzmP.zzpY && !flag && zzmw.zznd == 0)
            {
                if (!zzb(zzfa1))
                {
                    zza(0);
                    return;
                }
                if (zzmw.zzmM != null)
                {
                    zza.zza(zzmw.zzmM).zzag(zzfa1.zzzy);
                }
            }
            if (zzmw.zzmQ != null && zzmw.zzmQ.zzuX != null)
            {
                zzmw.zzmQ.zzuX.zza(null);
            }
            if (zzfa1.zzuX != null)
            {
                zzfa1.zzuX.zza(this);
            }
            zzmy.zzd(zzmw.zzmQ);
            zzmw.zzmQ = zzfa1;
            zzmw.zzmS.zzj(zzfa1.zzBv);
            zzmw.zzmS.zzk(zzfa1.zzBw);
            zzmw.zzmS.zzy(zzmw.zzmP.zzpY);
            zzmw.zzmS.zzz(zzfa1.zzzt);
            if (!zzmw.zzmP.zzpY && !flag && zzmw.zznd == 0)
            {
                zze(false);
            }
            if (zzmw.zznb == null)
            {
                zzmw.zznb = new zzff(zzmw.zzmG);
            }
            int i;
            int j;
            if (zzfa1.zzBt != null)
            {
                j = zzfa1.zzBt.zzuH;
                i = zzfa1.zzBt.zzuI;
            } else
            {
                i = 0;
                j = 0;
            }
            zzmw.zznb.zzf(j, i);
            if (zzmw.zznd == 0)
            {
                if (!zzmw.zzmP.zzpY && zzfa1.zzwz != null && (zzfa1.zzwz.zzft().zzbg() || zzfa1.zzBs != null))
                {
                    zzw zzw1 = zzmy.zza(zzmw.zzmP, zzmw.zzmQ);
                    if (zzfa1.zzwz.zzft().zzbg() && zzw1 != null)
                    {
                        zzw1.zza(this);
                    }
                }
                if (zzmw.zzmQ.zzwz != null)
                {
                    zzmw.zzmQ.zzwz.zzft().zzfG();
                }
                if (flag)
                {
                    zzfa1 = zzfa1.zzBx;
                    if ((zzfa1 instanceof zzbh) && zzmw.zzmX != null)
                    {
                        zzay();
                    } else
                    if ((zzfa1 instanceof zzbg) && zzmw.zzmW != null)
                    {
                        zzax();
                    } else
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzan("No matching listener for retrieved native ad template.");
                        zza(0);
                        return;
                    }
                }
                zzaw();
            } else
            if (zzmw.zznc != null && zzfa1.zzBs != null)
            {
                zzmy.zza(zzmw.zzmP, zzmw.zzmQ, zzmw.zznc);
            }
            if (zzh.zzaT().zzeM() != null)
            {
                zzh.zzaT().zzeM().zza(zzmr);
                return;
            }
        }
    }

    public void zza(zzw zzw1, boolean flag)
    {
        if (zzmw.zzmQ != null && zzmw.zzmQ.zzwz != null)
        {
            HashMap hashmap = new HashMap();
            if (flag)
            {
                zzw1 = "1";
            } else
            {
                zzw1 = "0";
            }
            hashmap.put("isVisible", zzw1);
            zzmw.zzmQ.zzwz.zzb("onAdVisibilityChanged", hashmap);
        }
    }

    public void zza(String s, ArrayList arraylist)
    {
        arraylist = new com.google.android.gms.ads.internal.purchase.zzd(s, arraylist, zzmw.zzmH, zzmw.zzmJ.zzCI);
        if (zzmw.zzmV == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!com.google.android.gms.ads.internal.client.zzj.zzbJ().zzD(zzmw.zzmH))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (zzmw.zzmU == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("PlayStorePurchaseListener is not set.");
                return;
            }
            if (zzmw.zzna == null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (zzmw.zzne)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("An in-app purchase request is already in progress, abort");
                return;
            }
            zzmw.zzne = true;
            try
            {
                if (!zzmw.zzmU.isValidPurchase(s))
                {
                    zzmw.zzne = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not start In-App purchase.");
                zzmw.zzne = false;
                return;
            }
            zzh.zzaZ().zza(zzmw.zzmH, zzmw.zzmJ.zzCL, new GInAppPurchaseManagerInfoParcel(zzmw.zzmH, zzmw.zzna, arraylist, this));
            return;
        }
        try
        {
            zzmw.zzmV.zza(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not start In-App purchase.");
        }
    }

    public void zza(String s, boolean flag, int i, Intent intent, com.google.android.gms.ads.internal.purchase.zzf zzf1)
    {
        try
        {
            if (zzmw.zzmU != null)
            {
                zzmw.zzmU.zza(new zzg(zzmw.zzmH, s, flag, i, intent, zzf1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to invoke PlayStorePurchaseListener.");
        }
        zzfl.zzCr.postDelayed(new Runnable(intent) {

            final com.google.android.gms.ads.internal.zza zzmD;
            final Intent zzmE;

            public void run()
            {
                int j = zzh.zzaZ().zzd(zzmE);
                zzh.zzaZ();
                if (j == 0 && com.google.android.gms.ads.internal.zza.zza(zzmD).zzmQ != null && com.google.android.gms.ads.internal.zza.zza(zzmD).zzmQ.zzwz != null && com.google.android.gms.ads.internal.zza.zza(zzmD).zzmQ.zzwz.zzfr() != null)
                {
                    com.google.android.gms.ads.internal.zza.zza(zzmD).zzmQ.zzwz.zzfr().close();
                }
                com.google.android.gms.ads.internal.zza.zza(zzmD).zzne = false;
            }

            
            {
                zzmD = com.google.android.gms.ads.internal.zza.this;
                zzmE = intent;
                super();
            }
        }, 500L);
    }

    public void zza(HashSet hashset)
    {
        zzmw.zza(hashset);
    }

    public void zza(List list)
    {
        zzv.zzbI("setNativeTemplates must be called on the main UI thread.");
        zzmw.zzmZ = list;
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        zzv.zzbI("loadAd must be called on the main UI thread.");
        if (zzmw.zzmK != null || zzmw.zzmO != null)
        {
            if (zzmu != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzmu = adrequestparcel;
        } else
        {
            if (zzmw.zzmP.zzpY && zzmw.zzmQ != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("An interstitial is already loading. Aborting.");
                return false;
            }
            if (zzaz())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzal("Starting ad request.");
                zzaf();
                zzms = zzmr.zzct();
                if (!adrequestparcel.zzpL)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzal((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(com.google.android.gms.ads.internal.client.zzj.zzbJ().zzC(zzmw.zzmH)).append("\") to get test ads on this device.").toString());
                }
                Bundle bundle = zza(zzh.zzaT().zzs(zzmw.zzmH));
                zzmx.cancel();
                zzmw.zznd = 0;
                adrequestparcel = zza(adrequestparcel, bundle);
                zzmw.zzmK = zzh.zzaM().zza(zzmw.zzmH, adrequestparcel, zzmw.zzmI, this);
                return true;
            }
        }
        return false;
    }

    boolean zza(zzfa zzfa1, boolean flag)
    {
        boolean flag1 = false;
        AdRequestParcel adrequestparcel;
        if (zzmu != null)
        {
            adrequestparcel = zzmu;
            zzmu = null;
        } else
        {
            AdRequestParcel adrequestparcel1 = zzfa1.zzyW;
            adrequestparcel = adrequestparcel1;
            if (adrequestparcel1.extras != null)
            {
                flag1 = adrequestparcel1.extras.getBoolean("_noRefresh", false);
                adrequestparcel = adrequestparcel1;
            }
        }
        if (zzmw.zzmP.zzpY)
        {
            if (zzmw.zznd == 0)
            {
                zzh.zzaS().zza(zzfa1.zzwz.getWebView());
            }
        } else
        if (!(flag1 | flag) && zzmw.zznd == 0)
        {
            if (zzfa1.zzuG > 0L)
            {
                zzmx.zza(adrequestparcel, zzfa1.zzuG);
            } else
            if (zzfa1.zzBt != null && zzfa1.zzBt.zzuG > 0L)
            {
                zzmx.zza(adrequestparcel, zzfa1.zzBt.zzuG);
            } else
            if (!zzfa1.zzzt && zzfa1.errorCode == 2)
            {
                zzmx.zzc(adrequestparcel);
            }
        }
        return zzmx.zzaK();
    }

    void zzaf()
    {
        zzmr = new zzay("load_ad");
        zzms = new zzax(-1L, null, null);
        zzmt = new zzax(-1L, null, null);
    }

    public com.google.android.gms.dynamic.zzd zzag()
    {
        zzv.zzbI("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.zze.zzt(zzmw.zzmM);
    }

    public AdSizeParcel zzah()
    {
        zzv.zzbI("getAdSize must be called on the main UI thread.");
        return zzmw.zzmP;
    }

    public void zzai()
    {
        zzau();
    }

    public void zzaj()
    {
        zzmy.zzd(zzmw.zzmQ);
        if (zzmw.zzmP.zzpY)
        {
            zzaA();
        }
        zzmA = false;
        zzat();
        zzmw.zzmS.zzeF();
    }

    public void zzak()
    {
        if (zzmw.zzmP.zzpY)
        {
            zze(false);
        }
        zzmA = true;
        zzav();
    }

    public void zzal()
    {
        onAdClicked();
    }

    public void zzam()
    {
        zzaj();
    }

    public void zzan()
    {
        zzai();
    }

    public void zzao()
    {
        zzak();
    }

    public void zzap()
    {
        if (zzmw.zzmQ != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Mediation adapter ").append(zzmw.zzmQ.zzuW).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zze(true);
        zzaw();
    }

    public void zzaq()
    {
        zzat();
    }

    public void zzar()
    {
        zzv.zzbI("recordManualImpression must be called on the main UI thread.");
        if (zzmw.zzmQ == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Pinging manual tracking URLs.");
            if (zzmw.zzmQ.zzzv != null)
            {
                zzh.zzaQ().zza(zzmw.zzmH, zzmw.zzmJ.zzCI, zzmw.zzmQ.zzzv);
                return;
            }
        }
    }

    protected boolean zzas()
    {
        Window window;
        if (zzmw.zzmH instanceof Activity)
        {
            if ((window = ((Activity)zzmw.zzmH).getWindow()) != null && window.getDecorView() != null)
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

    public boolean zzaz()
    {
        boolean flag = true;
        if (!zzh.zzaQ().zza(zzmw.zzmH.getPackageManager(), zzmw.zzmH.getPackageName(), "android.permission.INTERNET"))
        {
            if (!zzmw.zzmP.zzpY)
            {
                com.google.android.gms.ads.internal.client.zzj.zzbJ().zza(zzmw.zzmM, zzmw.zzmP, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!zzh.zzaQ().zzv(zzmw.zzmH))
        {
            if (!zzmw.zzmP.zzpY)
            {
                com.google.android.gms.ads.internal.client.zzj.zzbJ().zza(zzmw.zzmM, zzmw.zzmP, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && zzmw.zzmM != null)
        {
            zzmw.zzmM.setVisibility(0);
        }
        return flag;
    }

    public ArrayList zzb(List list)
    {
        String s = zzmw.zzmQ.zzzm;
        int i = com.google.android.gms.ads.internal.zzf.zzl(zzmw.zzmH).zzaJ();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zza((String)list.next(), s, i))) { }
        return arraylist;
    }

    public void zzb(View view)
    {
        zzmw.zznc = view;
        zza(new zzfa(zzmw.zzmR, null, null, null, null, null, null));
    }

    public void zzb(AdRequestParcel adrequestparcel)
    {
        android.view.ViewParent viewparent = zzmw.zzmM.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && zzh.zzaQ().zzeZ() && !zzmA)
        {
            zza(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Ad is not visible. Not refreshing ad.");
            zzmx.zzc(adrequestparcel);
            return;
        }
    }

    protected void zzc(View view)
    {
        zzmw.zzmM.addView(view, zzh.zzaS().zzfh());
    }

    public void zzd(boolean flag)
    {
        zzmw.zznf = flag;
    }
}
