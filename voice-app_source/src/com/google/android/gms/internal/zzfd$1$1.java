// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzfd

class zzrG extends WebViewClient
{

    final zzrG zzAx;
    final WebView zzrG;

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzay("Loading assets have finished");
        zzAx.Aw.zzAt.remove(zzrG);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzb.zzaC("Loading assets have failed.");
        zzAx.Aw.zzAt.remove(zzrG);
    }

    Av(Av av, WebView webview)
    {
        zzAx = av;
        zzrG = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzfd$1

/* anonymous class */
    class zzfd._cls1
        implements Runnable
    {

        final String zzAu;
        final String zzAv;
        final zzfd zzAw;

        public void run()
        {
            WebView webview = zzAw.zzeZ();
            webview.setWebViewClient(new zzfd._cls1._cls1(this, webview));
            zzAw.zzAt.add(webview);
            webview.loadDataWithBaseURL(zzAu, zzAv, "text/html", "UTF-8", null);
            zzb.zzay("Fetching assets finished.");
        }

            
            {
                zzAw = zzfd1;
                zzAu = s;
                zzAv = s1;
                super();
            }
    }

}
