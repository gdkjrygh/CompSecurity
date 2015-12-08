// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzet, zzid, zzbq, zzep, 
//            zzao, zzbz, zzbv, zzan, 
//            zzdd, zzdf, zzdm, zzdn, 
//            zzdj, zzhl, zzdg, zzde, 
//            zzdk, zzdi, zzev

public class zzie extends WebViewClient
{
    public static interface zza
    {

        public abstract void zza(zzid zzid1, boolean flag);
    }

    private static class zzb
        implements zzf
    {

        private zzf zzHc;
        private zzid zzHn;

        public void zzaV()
        {
            zzHc.zzaV();
            zzHn.zzgA();
        }

        public void zzaW()
        {
            zzHc.zzaW();
            zzHn.zzew();
        }

        public zzb(zzid zzid1, zzf zzf1)
        {
            zzHn = zzid1;
            zzHc = zzf1;
        }
    }

    private class zzc
        implements zzdg
    {

        final zzie zzHm;

        public void zza(zzid zzid1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                com.google.android.gms.internal.zzie.zza(zzHm);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    com.google.android.gms.internal.zzie.zzb(zzHm);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    com.google.android.gms.internal.zzie.zzc(zzHm);
                    return;
                }
            }
        }

        private zzc()
        {
            zzHm = zzie.this;
            super();
        }

    }


    private zza zzBi;
    private final HashMap zzHb;
    private zzf zzHc;
    private boolean zzHd;
    private com.google.android.gms.ads.internal.overlay.zzk zzHe;
    private final zzet zzHf;
    private boolean zzHg;
    private boolean zzHh;
    private boolean zzHi;
    private boolean zzHj;
    private int zzHk;
    protected final zzid zzoA;
    private boolean zzqs;
    private final Object zzqt;
    private com.google.android.gms.ads.internal.client.zza zzrU;
    private zzde zzvU;
    private zzdk zzwu;
    private zzd zzww;
    private zzep zzwx;
    private zzdi zzwz;
    private zzev zzyE;

    public zzie(zzid zzid1, boolean flag)
    {
        this(zzid1, flag, new zzet(zzid1, zzid1.zzgC(), new zzbq(zzid1.getContext())), null);
    }

    zzie(zzid zzid1, boolean flag, zzet zzet1, zzep zzep1)
    {
        zzHb = new HashMap();
        zzqt = new Object();
        zzHd = false;
        zzoA = zzid1;
        zzqs = flag;
        zzHf = zzet1;
        zzwx = zzep1;
    }

    static void zza(zzie zzie1)
    {
        zzie1.zzgO();
    }

    static void zzb(zzie zzie1)
    {
        zzie1.zzgP();
    }

    static void zzc(zzie zzie1)
    {
        zzie1.zzgQ();
    }

    private static boolean zzf(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void zzgO()
    {
        zzHk = zzHk + 1;
        zzgR();
    }

    private void zzgP()
    {
        zzHk = zzHk - 1;
        zzgR();
    }

    private void zzgQ()
    {
        zzHj = true;
        zzgR();
    }

    public final void onLoadResource(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            zzg(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!zzHh || !"about:blank".equals(s))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Blank page loaded, 1...");
                zzoA.zzgK();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        zzHi = true;
        zzgR();
        return;
        s;
        webview;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void reset()
    {
        synchronized (zzqt)
        {
            zzHb.clear();
            zzrU = null;
            zzHc = null;
            zzBi = null;
            zzvU = null;
            zzHd = false;
            zzqs = false;
            zzwz = null;
            zzHe = null;
            if (zzwx != null)
            {
                zzwx.zzn(true);
                zzwx = null;
            }
            zzHg = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
    {
        switch (keyevent.getKeyCode())
        {
        default:
            return false;

        case 79: // 'O'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        case 91: // '['
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 222: 
            return true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        zzg(uri);
_L4:
        return true;
_L2:
        if (zzHd && webview == zzoA && zzf(uri))
        {
            if (!zzHg)
            {
                zzHg = true;
                if (zzrU != null && ((Boolean)zzbz.zzul.get()).booleanValue())
                {
                    zzrU.onAdClicked();
                }
            }
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (zzoA.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_270;
        }
        zzan zzan1 = zzoA.zzgH();
        webview = uri;
        if (zzan1 != null)
        {
            webview = uri;
            try
            {
                if (zzan1.zzb(uri))
                {
                    webview = zzan1.zza(uri, zzoA.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        if (zzww == null || zzww.zzbd())
        {
            zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            zzww.zzo(s);
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzD(boolean flag)
    {
        zzHd = flag;
    }

    public void zza(int i, int j, boolean flag)
    {
        zzHf.zze(i, j);
        if (zzwx != null)
        {
            zzwx.zza(i, j, flag);
        }
    }

    public final void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        zzf zzf1 = null;
        boolean flag = zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag && !zzoA.zzaN().zzsn)
        {
            zza1 = null;
        } else
        {
            zza1 = zzrU;
        }
        if (!flag)
        {
            zzf1 = zzHc;
        }
        zza(new AdOverlayInfoParcel(adlauncherintentinfoparcel, zza1, zzf1, zzHe, zzoA.zzgI()));
    }

    public void zza(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        com.google.android.gms.ads.internal.overlay.zzd zzd1;
        android.content.Context context;
        boolean flag;
        if (zzwx != null)
        {
            flag = zzwx.zzee();
        } else
        {
            flag = false;
        }
        zzd1 = zzo.zzbt();
        context = zzoA.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zzd1.zza(context, adoverlayinfoparcel, flag1);
    }

    public void zza(zza zza1)
    {
        zzBi = zza1;
    }

    public final void zza(String s, zzdg zzdg1)
    {
        Object obj1 = zzqt;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)zzHb.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        zzHb.put(s, obj);
        ((List) (obj)).add(zzdg1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void zza(boolean flag, int i)
    {
        com.google.android.gms.ads.internal.client.zza zza1;
        if (zzoA.zzgJ() && !zzoA.zzaN().zzsn)
        {
            zza1 = null;
        } else
        {
            zza1 = zzrU;
        }
        zza(new AdOverlayInfoParcel(zza1, zzHc, zzHe, zzoA, flag, i, zzoA.zzgI()));
    }

    public final void zza(boolean flag, int i, String s)
    {
        Object obj = null;
        boolean flag1 = zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag1 && !zzoA.zzaN().zzsn)
        {
            zza1 = null;
        } else
        {
            zza1 = zzrU;
        }
        if (!flag1)
        {
            obj = new zzb(zzoA, zzHc);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzf) (obj)), zzvU, zzHe, zzoA, flag, i, s, zzoA.zzgI(), zzwz));
    }

    public final void zza(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza1;
        Object obj;
        if (flag1 && !zzoA.zzaN().zzsn)
        {
            zza1 = null;
        } else
        {
            zza1 = zzrU;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new zzb(zzoA, zzHc);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzf) (obj)), zzvU, zzHe, zzoA, flag, i, s, s1, zzoA.zzgI(), zzwz));
    }

    public void zzb(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf1, zzde zzde, com.google.android.gms.ads.internal.overlay.zzk zzk1, boolean flag, zzdi zzdi, zzdk zzdk, 
            zzd zzd1, zzev zzev)
    {
        zzd zzd2 = zzd1;
        if (zzd1 == null)
        {
            zzd2 = new zzd(false);
        }
        zzwx = new zzep(zzoA, zzev);
        zza("/appEvent", new zzdd(zzde));
        zza("/canOpenURLs", zzdf.zzvW);
        zza("/canOpenIntents", zzdf.zzvX);
        zza("/click", zzdf.zzvY);
        zza("/close", zzdf.zzvZ);
        zza("/customClose", zzdf.zzwa);
        zza("/delayPageLoaded", new zzc());
        zza("/httpTrack", zzdf.zzwb);
        zza("/log", zzdf.zzwc);
        zza("/mraid", new zzdm(zzd2, zzwx));
        zza("/open", new zzdn(zzdi, zzd2, zzwx));
        zza("/precache", zzdf.zzwf);
        zza("/touch", zzdf.zzwd);
        zza("/video", zzdf.zzwe);
        if (zzdk != null)
        {
            zza("/setInterstitialProperties", new zzdj(zzdk));
        }
        zzrU = zza1;
        zzHc = zzf1;
        zzvU = zzde;
        zzwz = zzdi;
        zzHe = zzk1;
        zzww = zzd2;
        zzyE = zzev;
        zzwu = zzdk;
        zzD(flag);
        zzHg = false;
    }

    public final void zzb(String s, zzdg zzdg1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        s = (List)zzHb.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s.remove(zzdg1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean zzbU()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzqs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzd(int i, int j)
    {
        if (zzwx != null)
        {
            zzwx.zzd(i, j);
        }
    }

    public final void zzet()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        com.google.android.gms.ads.internal.overlay.zzc zzc1;
        zzHd = false;
        zzqs = true;
        zzoA.zzgL();
        zzc1 = zzoA.zzgD();
        if (zzc1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (zzk.zzcA().zzgw())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzhl.zzGk.post(new Runnable(zzc1) {

            final com.google.android.gms.ads.internal.overlay.zzc zzHl;
            final zzie zzHm;

            public void run()
            {
                zzHl.zzet();
            }

            
            {
                zzHm = zzie.this;
                zzHl = zzc1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzc1.zzet();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzg(Uri uri)
    {
        String s = uri.getPath();
        Object obj = (List)zzHb.get(s);
        if (obj != null)
        {
            uri = zzo.zzbv().zzd(uri);
            if (com.google.android.gms.ads.internal.util.client.zzb.zzL(2))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzdg)((Iterator) (obj)).next()).zza(zzoA, uri)) { }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
        }
    }

    public zzd zzgM()
    {
        return zzww;
    }

    public void zzgN()
    {
        synchronized (zzqt)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("Loading blank page in WebView, 2...");
            zzHh = true;
            zzoA.zzaD("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzgR()
    {
        if (zzBi != null && (zzHi && zzHk <= 0 || zzHj))
        {
            zza zza1 = zzBi;
            zzid zzid1 = zzoA;
            boolean flag;
            if (!zzHj)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zza1.zza(zzid1, flag);
            zzBi = null;
        }
    }

    public void zzgS()
    {
        if (zzbU())
        {
            zzHf.zzek();
        }
    }
}
