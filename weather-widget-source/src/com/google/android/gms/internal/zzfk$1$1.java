// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

class zzrZ extends WebViewClient
{

    final zzrZ zzBI;
    final WebView zzrZ;

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaC("Loading assets have finished");
        zzBI.BH.zzBE.remove(zzrZ);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzb.zzaE("Loading assets have failed.");
        zzBI.BH.zzBE.remove(zzrZ);
    }

    BG(BG bg, WebView webview)
    {
        zzBI = bg;
        zzrZ = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzfk$1

/* anonymous class */
    class zzfk._cls1
        implements Runnable
    {

        final String zzBF;
        final String zzBG;
        final zzfk zzBH;

        public void run()
        {
            WebView webview = zzBH.zzfb();
            webview.setWebViewClient(new zzfk._cls1._cls1(this, webview));
            zzBH.zzBE.add(webview);
            webview.loadDataWithBaseURL(zzBF, zzBG, "text/html", "UTF-8", null);
            zzb.zzaC("Fetching assets finished.");
        }

            
            {
                zzBH = zzfk1;
                zzBF = s;
                zzBG = s1;
                super();
            }
    }

}
