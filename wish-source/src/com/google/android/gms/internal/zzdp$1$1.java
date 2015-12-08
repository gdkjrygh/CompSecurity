// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp

class zzps extends WebViewClient
{

    final WebView zzps;
    final zzps zzxl;

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaj("Loading assets have finished");
        zzxl.xk.zzxh.remove(zzps);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzb.zzan("Loading assets have failed.");
        zzxl.xk.zzxh.remove(zzps);
    }

    xj(xj xj, WebView webview)
    {
        zzxl = xj;
        zzps = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdp$1

/* anonymous class */
    class zzdp._cls1
        implements Runnable
    {

        final String zzxi;
        final String zzxj;
        final zzdp zzxk;

        public void run()
        {
            WebView webview = zzxk.zzdS();
            webview.setWebViewClient(new zzdp._cls1._cls1(this, webview));
            zzxk.zzxh.add(webview);
            webview.loadDataWithBaseURL(zzxi, zzxj, "text/html", "UTF-8", null);
            zzb.zzaj("Fetching assets finished.");
        }

            
            {
                zzxk = zzdp1;
                zzxi = s;
                zzxj = s1;
                super();
            }
    }

}
