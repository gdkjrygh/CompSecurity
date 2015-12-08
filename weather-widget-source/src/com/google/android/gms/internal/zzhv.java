// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
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
//            zziq, zzip, zziv, zziu, 
//            zziw

public class zzhv
{
    static class zza extends zzhv
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.setShowRunningNotification(true);
            return true;
        }

        public int zzgv()
        {
            return 6;
        }

        public int zzgw()
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

        public zziq zzb(zzip zzip, boolean flag)
        {
            return new zziv(zzip, flag);
        }

        public boolean zzb(WebView webview)
        {
            webview.onResume();
            return true;
        }

        public WebChromeClient zzf(zzip zzip)
        {
            return new zziu(zzip);
        }

        public Set zzf(Uri uri)
        {
            return uri.getQueryParameterNames();
        }

        public boolean zzk(View view)
        {
            view.setLayerType(0, null);
            return true;
        }

        public boolean zzl(View view)
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

        public String zza(SslError sslerror)
        {
            return sslerror.getUrl();
        }

        public WebChromeClient zzf(zzip zzip)
        {
            return new zziw(zzip);
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

        public boolean isAttachedToWindow(View view)
        {
            return super.isAttachedToWindow(view) || view.getWindowId() != null;
        }

        public int zzgx()
        {
            return 14;
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

        public boolean isAttachedToWindow(View view)
        {
            return view.isAttachedToWindow();
        }

        public android.view.ViewGroup.LayoutParams zzgy()
        {
            return new android.view.ViewGroup.LayoutParams(-1, -1);
        }

        zzg()
        {
        }
    }


    private zzhv()
    {
    }


    public static zzhv zzL(int i)
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
            return new zzhv();
        }
    }

    public String getDefaultUserAgent(Context context)
    {
        return "";
    }

    public boolean isAttachedToWindow(View view)
    {
        return view.getWindowToken() != null || view.getWindowVisibility() != 8;
    }

    public String zza(SslError sslerror)
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

    public zziq zzb(zzip zzip, boolean flag)
    {
        return new zziq(zzip, flag);
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

    public WebChromeClient zzf(zzip zzip)
    {
        return null;
    }

    public Set zzf(Uri uri)
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

    public int zzgv()
    {
        return 0;
    }

    public int zzgw()
    {
        return 1;
    }

    public int zzgx()
    {
        return 5;
    }

    public android.view.ViewGroup.LayoutParams zzgy()
    {
        return new android.view.ViewGroup.LayoutParams(-2, -2);
    }

    public boolean zzk(View view)
    {
        return false;
    }

    public boolean zzl(View view)
    {
        return false;
    }
}
