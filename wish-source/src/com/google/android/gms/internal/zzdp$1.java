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

class zzxj
    implements Runnable
{

    final String zzxi;
    final String zzxj;
    final zzdp zzxk;

    public void run()
    {
        WebView webview = zzxk.zzdS();
        webview.setWebViewClient(new WebViewClient(webview) {

            final WebView zzps;
            final zzdp._cls1 zzxl;

            public void onPageFinished(WebView webview1, String s)
            {
                zzb.zzaj("Loading assets have finished");
                zzxl.zzxk.zzxh.remove(zzps);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                zzb.zzan("Loading assets have failed.");
                zzxl.zzxk.zzxh.remove(zzps);
            }

            
            {
                zzxl = zzdp._cls1.this;
                zzps = webview;
                super();
            }
        });
        zzxk.zzxh.add(webview);
        webview.loadDataWithBaseURL(zzxi, zzxj, "text/html", "UTF-8", null);
        zzb.zzaj("Fetching assets finished.");
    }

    _cls1.zzps(zzdp zzdp1, String s, String s1)
    {
        zzxk = zzdp1;
        zzxi = s;
        zzxj = s1;
        super();
    }
}
