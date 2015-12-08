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

class zzBG
    implements Runnable
{

    final String zzBF;
    final String zzBG;
    final zzfk zzBH;

    public void run()
    {
        WebView webview = zzBH.zzfb();
        webview.setWebViewClient(new WebViewClient(webview) {

            final zzfk._cls1 zzBI;
            final WebView zzrZ;

            public void onPageFinished(WebView webview1, String s)
            {
                zzb.zzaC("Loading assets have finished");
                zzBI.zzBH.zzBE.remove(zzrZ);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                zzb.zzaE("Loading assets have failed.");
                zzBI.zzBH.zzBE.remove(zzrZ);
            }

            
            {
                zzBI = zzfk._cls1.this;
                zzrZ = webview;
                super();
            }
        });
        zzBH.zzBE.add(webview);
        webview.loadDataWithBaseURL(zzBF, zzBG, "text/html", "UTF-8", null);
        zzb.zzaC("Fetching assets finished.");
    }

    _cls1.zzrZ(zzfk zzfk1, String s, String s1)
    {
        zzBH = zzfk1;
        zzBF = s;
        zzBG = s1;
        super();
    }
}
