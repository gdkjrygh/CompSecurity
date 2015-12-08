// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzid, zzij, zzii, 
//            zzik

public class zzhm
{
    static class zza extends zzhm
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.setShowRunningNotification(true);
            return true;
        }

        public int zzgq()
        {
            return 6;
        }

        public int zzgr()
        {
            return 7;
        }

        zza()
        {
        }
    }

    static class zzb extends zza
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        public boolean zza(Context context, WebSettings websettings)
        {
            if (context.getCacheDir() != null)
            {
                websettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                websettings.setAppCacheMaxSize(0L);
                websettings.setAppCacheEnabled(true);
            }
            websettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
            websettings.setDatabaseEnabled(true);
            websettings.setDomStorageEnabled(true);
            websettings.setDisplayZoomControls(false);
            websettings.setBuiltInZoomControls(true);
            websettings.setSupportZoom(true);
            return true;
        }

        public boolean zza(Window window)
        {
            window.setFlags(0x1000000, 0x1000000);
            return true;
        }

        public boolean zza(WebView webview)
        {
            webview.onPause();
            return true;
        }

        public zzie zzb(zzid zzid, boolean flag)
        {
            return new zzij(zzid, flag);
        }

        public boolean zzb(WebView webview)
        {
            webview.onResume();
            return true;
        }

        public Set zze(Uri uri)
        {
            return uri.getQueryParameterNames();
        }

        public WebChromeClient zzf(zzid zzid)
        {
            return new zzii(zzid);
        }

        public boolean zzl(View view)
        {
            view.setLayerType(0, null);
            return true;
        }

        public boolean zzm(View view)
        {
            view.setLayerType(1, null);
            return true;
        }

        zzb()
        {
        }
    }

    static class zzc extends zzb
    {

        public WebChromeClient zzf(zzid zzid)
        {
            return new zzik(zzid);
        }

        zzc()
        {
        }
    }

    static class zzd extends zzf
    {

        public String getDefaultUserAgent(Context context)
        {
            return WebSettings.getDefaultUserAgent(context);
        }

        public boolean zza(Context context, WebSettings websettings)
        {
            super.zza(context, websettings);
            websettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }

        zzd()
        {
        }
    }

    static class zze extends zzd
    {

        public int zzgs()
        {
            return 14;
        }

        public boolean zzk(View view)
        {
            return super.zzk(view) || view.getWindowId() != null;
        }

        zze()
        {
        }
    }

    static class zzf extends zzc
    {

        public void zza(View view, Drawable drawable)
        {
            view.setBackground(drawable);
        }

        public void zza(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
        }

        public void zzb(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            activity = activity.getWindow();
            if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            {
                zza(activity.getDecorView().getViewTreeObserver(), ongloballayoutlistener);
            }
        }

        zzf()
        {
        }
    }

    static class zzg extends zze
    {

        public android.view.ViewGroup.LayoutParams zzgt()
        {
            return new android.view.ViewGroup.LayoutParams(-1, -1);
        }

        public boolean zzk(View view)
        {
            return view.isAttachedToWindow();
        }

        zzg()
        {
        }
    }


    private zzhm()
    {
    }


    public static zzhm zzK(int i)
    {
        if (i >= 19)
        {
            return new zzg();
        }
        if (i >= 18)
        {
            return new zze();
        }
        if (i >= 17)
        {
            return new zzd();
        }
        if (i >= 16)
        {
            return new zzf();
        }
        if (i >= 14)
        {
            return new zzc();
        }
        if (i >= 11)
        {
            return new zzb();
        }
        if (i >= 9)
        {
            return new zza();
        } else
        {
            return new zzhm();
        }
    }

    public String getDefaultUserAgent(Context context)
    {
        return "";
    }

    public void zza(View view, Drawable drawable)
    {
        view.setBackgroundDrawable(drawable);
    }

    public void zza(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
    }

    public boolean zza(android.app.DownloadManager.Request request)
    {
        return false;
    }

    public boolean zza(Context context, WebSettings websettings)
    {
        return false;
    }

    public boolean zza(Window window)
    {
        return false;
    }

    public boolean zza(WebView webview)
    {
        return false;
    }

    public zzie zzb(zzid zzid, boolean flag)
    {
        return new zzie(zzid, flag);
    }

    public void zzb(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            zza(activity.getDecorView().getViewTreeObserver(), ongloballayoutlistener);
        }
    }

    public boolean zzb(WebView webview)
    {
        return false;
    }

    public Set zze(Uri uri)
    {
        if (uri.isOpaque())
        {
            return Collections.emptySet();
        }
        uri = uri.getEncodedQuery();
        if (uri == null)
        {
            return Collections.emptySet();
        }
        LinkedHashSet linkedhashset = new LinkedHashSet();
        int j = 0;
        do
        {
            int i;
            int k;
label0:
            {
                k = uri.indexOf('&', j);
                i = k;
                if (k == -1)
                {
                    i = uri.length();
                }
                int l = uri.indexOf('=', j);
                if (l <= i)
                {
                    k = l;
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                k = i;
            }
            linkedhashset.add(Uri.decode(uri.substring(j, k)));
            i++;
            j = i;
            if (i >= uri.length())
            {
                return Collections.unmodifiableSet(linkedhashset);
            }
        } while (true);
    }

    public WebChromeClient zzf(zzid zzid)
    {
        return null;
    }

    public int zzgq()
    {
        return 0;
    }

    public int zzgr()
    {
        return 1;
    }

    public int zzgs()
    {
        return 5;
    }

    public android.view.ViewGroup.LayoutParams zzgt()
    {
        return new android.view.ViewGroup.LayoutParams(-2, -2);
    }

    public boolean zzk(View view)
    {
        return view.getWindowToken() != null || view.getWindowVisibility() != 8;
    }

    public boolean zzl(View view)
    {
        return false;
    }

    public boolean zzm(View view)
    {
        return false;
    }
}
