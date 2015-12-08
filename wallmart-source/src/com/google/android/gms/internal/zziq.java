// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzfa, zzip, zzbq, zzby, 
//            zzbu, zzhu, zzhv, zzew, 
//            zzao, zzan, zzdc, zzdf, 
//            zzdm, zzdn, zzdj, zzdg, 
//            zzdd, zzdk, zzdi, zzfc

public class zziq extends WebViewClient
{
    public static interface zza
    {

        public abstract void zza(zzip zzip1, boolean flag);
    }

    public static interface zzb
    {

        public abstract void zzbf();
    }

    private static class zzc
        implements zzg
    {

        private zzg zzIX;
        private zzip zzJj;

        public void zzaV()
        {
            zzIX.zzaV();
            zzJj.zzgM();
        }

        public void zzaW()
        {
            zzIX.zzaW();
            zzJj.zzeD();
        }

        public zzc(zzip zzip1, zzg zzg1)
        {
            zzJj = zzip1;
            zzIX = zzg1;
        }
    }

    private class zzd
        implements zzdg
    {

        final zziq zzJi;

        public void zza(zzip zzip1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                com.google.android.gms.internal.zziq.zza(zzJi);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    com.google.android.gms.internal.zziq.zzb(zzJi);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    zziq.zzc(zzJi);
                    return;
                }
            }
        }

        private zzd()
        {
            zzJi = zziq.this;
            super();
        }

    }


    private static final String zzIU[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String zzIV[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    private zza zzCv;
    private final HashMap zzIW;
    private zzg zzIX;
    private zzb zzIY;
    private boolean zzIZ;
    private boolean zzJa;
    private zzn zzJb;
    private final zzfa zzJc;
    private boolean zzJd;
    private boolean zzJe;
    private boolean zzJf;
    private boolean zzJg;
    private int zzJh;
    protected final zzip zzoL;
    private final Object zzpc;
    private boolean zzqL;
    private com.google.android.gms.ads.internal.client.zza zzsn;
    private zzdd zzwH;
    private zzdk zzxh;
    private zze zzxj;
    private zzew zzxk;
    private zzdi zzxm;
    private zzfc zzzy;

    public zziq(zzip zzip1, boolean flag)
    {
        this(zzip1, flag, new zzfa(zzip1, zzip1.zzgO(), new zzbq(zzip1.getContext())), null);
    }

    zziq(zzip zzip1, boolean flag, zzfa zzfa1, zzew zzew1)
    {
        zzIW = new HashMap();
        zzpc = new Object();
        zzIZ = false;
        zzoL = zzip1;
        zzqL = flag;
        zzJc = zzfa1;
        zzxk = zzew1;
    }

    static zzb zza(zziq zziq1, zzb zzb1)
    {
        zziq1.zzIY = zzb1;
        return zzb1;
    }

    private void zza(Context context, String s, String s1, String s2)
    {
        if (!((Boolean)zzby.zzva.get()).booleanValue())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("err", s);
            bundle.putString("code", s1);
            bundle.putString("host", zzaI(s2));
            zzp.zzbx().zza(context, zzoL.zzgV().zzIz, "gmob-apps", bundle, true);
            return;
        }
    }

    static void zza(zziq zziq1)
    {
        zziq1.zzhe();
    }

    private String zzaI(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        }
        s = Uri.parse(s);
        if (s.getHost() != null)
        {
            return s.getHost();
        } else
        {
            return "";
        }
    }

    static void zzb(zziq zziq1)
    {
        zziq1.zzhf();
    }

    static void zzc(zziq zziq1)
    {
        zziq1.zzhg();
    }

    static zzb zzd(zziq zziq1)
    {
        return zziq1.zzIY;
    }

    private static boolean zzg(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void zzhe()
    {
        synchronized (zzpc)
        {
            zzJa = true;
        }
        zzJh = zzJh + 1;
        zzhh();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzhf()
    {
        zzJh = zzJh - 1;
        zzhh();
    }

    private void zzhg()
    {
        zzJg = true;
        zzhh();
    }

    public final void onLoadResource(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            zzh(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!zzJe || !"about:blank".equals(s))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.v("Blank page loaded, 1...");
                zzoL.zzgX();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        zzJf = true;
        zzhh();
        return;
        s;
        webview;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        String s2;
        if (i < 0 && -i - 1 < zzIU.length)
        {
            s2 = zzIU[-i - 1];
        } else
        {
            s2 = String.valueOf(i);
        }
        zza(zzoL.getContext(), "http_err", s2, s1);
        super.onReceivedError(webview, i, s, s1);
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (sslerror != null)
        {
            int i = sslerror.getPrimaryError();
            String s;
            if (i >= 0 && i < zzIV.length)
            {
                s = zzIV[i];
            } else
            {
                s = String.valueOf(i);
            }
            zza(zzoL.getContext(), "ssl_err", s, zzp.zzbz().zza(sslerror));
        }
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public final void reset()
    {
        synchronized (zzpc)
        {
            zzIW.clear();
            zzsn = null;
            zzIX = null;
            zzCv = null;
            zzwH = null;
            zzIZ = false;
            zzqL = false;
            zzJa = false;
            zzxm = null;
            zzJb = null;
            zzIY = null;
            if (zzxk != null)
            {
                zzxk.zzn(true);
                zzxk = null;
            }
            zzJd = false;
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
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        zzh(uri);
_L4:
        return true;
_L2:
        if (zzIZ && webview == zzoL && zzg(uri))
        {
            if (!zzJd)
            {
                zzJd = true;
                if (zzsn != null && ((Boolean)zzby.zzuO.get()).booleanValue())
                {
                    zzsn.onAdClicked();
                }
            }
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (zzoL.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_273;
        }
        zzan zzan1 = zzoL.zzgU();
        webview = uri;
        if (zzan1 != null)
        {
            webview = uri;
            try
            {
                if (zzan1.zzb(uri))
                {
                    webview = zzan1.zza(uri, zzoL.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        if (zzxj == null || zzxj.zzbe())
        {
            zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            zzxj.zzp(s);
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzF(boolean flag)
    {
        zzIZ = flag;
    }

    public void zza(int i, int j, boolean flag)
    {
        zzJc.zze(i, j);
        if (zzxk != null)
        {
            zzxk.zza(i, j, flag);
        }
    }

    public final void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        zzg zzg1 = null;
        boolean flag = zzoL.zzgW();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag && !zzoL.zzaN().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = zzsn;
        }
        if (!flag)
        {
            zzg1 = zzIX;
        }
        zza(new AdOverlayInfoParcel(adlauncherintentinfoparcel, zza1, zzg1, zzJb, zzoL.zzgV()));
    }

    public void zza(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        com.google.android.gms.ads.internal.overlay.zze zze1;
        Context context;
        boolean flag;
        if (zzxk != null)
        {
            flag = zzxk.zzdY();
        } else
        {
            flag = false;
        }
        zze1 = zzp.zzbv();
        context = zzoL.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zze1.zza(context, adoverlayinfoparcel, flag1);
    }

    public void zza(zza zza1)
    {
        zzCv = zza1;
    }

    public void zza(zzb zzb1)
    {
        zzIY = zzb1;
    }

    public final void zza(String s, zzdg zzdg1)
    {
        Object obj1 = zzpc;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)zzIW.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        zzIW.put(s, obj);
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
        if (zzoL.zzgW() && !zzoL.zzaN().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = zzsn;
        }
        zza(new AdOverlayInfoParcel(zza1, zzIX, zzJb, zzoL, flag, i, zzoL.zzgV()));
    }

    public final void zza(boolean flag, int i, String s)
    {
        Object obj = null;
        boolean flag1 = zzoL.zzgW();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag1 && !zzoL.zzaN().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = zzsn;
        }
        if (!flag1)
        {
            obj = new zzc(zzoL, zzIX);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), zzwH, zzJb, zzoL, flag, i, s, zzoL.zzgV(), zzxm));
    }

    public final void zza(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = zzoL.zzgW();
        com.google.android.gms.ads.internal.client.zza zza1;
        Object obj;
        if (flag1 && !zzoL.zzaN().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = zzsn;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new zzc(zzoL, zzIX);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), zzwH, zzJb, zzoL, flag, i, s, s1, zzoL.zzgV(), zzxm));
    }

    public void zzb(com.google.android.gms.ads.internal.client.zza zza1, zzg zzg1, zzdd zzdd, zzn zzn, boolean flag, zzdi zzdi, zzdk zzdk, 
            zze zze1, zzfc zzfc)
    {
        zze zze2 = zze1;
        if (zze1 == null)
        {
            zze2 = new zze(false);
        }
        zzxk = new zzew(zzoL, zzfc);
        zza("/appEvent", new zzdc(zzdd));
        zza("/backButton", zzdf.zzwR);
        zza("/canOpenURLs", zzdf.zzwJ);
        zza("/canOpenIntents", zzdf.zzwK);
        zza("/click", zzdf.zzwL);
        zza("/close", zzdf.zzwM);
        zza("/customClose", zzdf.zzwN);
        zza("/delayPageLoaded", new zzd());
        zza("/httpTrack", zzdf.zzwO);
        zza("/log", zzdf.zzwP);
        zza("/mraid", new zzdm(zze2, zzxk));
        zza("/mraidLoaded", zzJc);
        zza("/open", new zzdn(zzdi, zze2, zzxk));
        zza("/precache", zzdf.zzwT);
        zza("/touch", zzdf.zzwQ);
        zza("/video", zzdf.zzwS);
        if (zzdk != null)
        {
            zza("/setInterstitialProperties", new zzdj(zzdk));
        }
        zzsn = zza1;
        zzIX = zzg1;
        zzwH = zzdd;
        zzxm = zzdi;
        zzJb = zzn;
        zzxj = zze2;
        zzzy = zzfc;
        zzxh = zzdk;
        zzF(flag);
        zzJd = false;
    }

    public final void zzb(String s, zzdg zzdg1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        s = (List)zzIW.get(s);
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

    public boolean zzbY()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzqL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzd(int i, int j)
    {
        if (zzxk != null)
        {
            zzxk.zzd(i, j);
        }
    }

    public final void zzeA()
    {
        synchronized (zzpc)
        {
            zzIZ = false;
            zzqL = true;
            zzhu.runOnUiThread(new Runnable() {

                final zziq zzJi;

                public void run()
                {
                    zzJi.zzoL.zzgZ();
                    com.google.android.gms.ads.internal.overlay.zzd zzd1 = zzJi.zzoL.zzgQ();
                    if (zzd1 != null)
                    {
                        zzd1.zzeA();
                    }
                    if (zziq.zzd(zzJi) != null)
                    {
                        zziq.zzd(zzJi).zzbf();
                        com.google.android.gms.internal.zziq.zza(zzJi, null);
                    }
                }

            
            {
                zzJi = zziq.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzh(Uri uri)
    {
        String s = uri.getPath();
        Object obj = (List)zzIW.get(s);
        if (obj != null)
        {
            uri = zzp.zzbx().zze(uri);
            if (com.google.android.gms.ads.internal.util.client.zzb.zzM(2))
            {
                com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzdg)((Iterator) (obj)).next()).zza(zzoL, uri)) { }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
        }
    }

    public zze zzhb()
    {
        return zzxj;
    }

    public boolean zzhc()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzJa;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzhd()
    {
        synchronized (zzpc)
        {
            com.google.android.gms.ads.internal.util.client.zzb.v("Loading blank page in WebView, 2...");
            zzJe = true;
            zzoL.zzaF("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzhh()
    {
        if (zzCv != null && (zzJf && zzJh <= 0 || zzJg))
        {
            zza zza1 = zzCv;
            zzip zzip1 = zzoL;
            boolean flag;
            if (!zzJg)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zza1.zza(zzip1, flag);
            zzCv = null;
        }
    }

}
