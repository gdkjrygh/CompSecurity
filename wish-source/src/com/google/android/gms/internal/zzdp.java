// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdn, zzfl

public class zzdp
    implements zzdn
{

    private final Context mContext;
    final Set zzxh = Collections.synchronizedSet(new HashSet());

    public zzdp(Context context)
    {
        mContext = context;
    }

    public void zza(String s, String s1, String s2)
    {
        zzb.zzaj("Fetching assets for the given html");
        zzfl.zzCr.post(new Runnable(s1, s2) {

            final String zzxi;
            final String zzxj;
            final zzdp zzxk;

            public void run()
            {
                WebView webview = zzxk.zzdS();
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    final WebView zzps;
                    final _cls1 zzxl;

                    public void onPageFinished(WebView webview, String s)
                    {
                        zzb.zzaj("Loading assets have finished");
                        zzxl.zzxk.zzxh.remove(zzps);
                    }

                    public void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        zzb.zzan("Loading assets have failed.");
                        zzxl.zzxk.zzxh.remove(zzps);
                    }

            
            {
                zzxl = _pcls1;
                zzps = webview;
                super();
            }
                });
                zzxk.zzxh.add(webview);
                webview.loadDataWithBaseURL(zzxi, zzxj, "text/html", "UTF-8", null);
                zzb.zzaj("Fetching assets finished.");
            }

            
            {
                zzxk = zzdp.this;
                zzxi = s;
                zzxj = s1;
                super();
            }
        });
    }

    public WebView zzdS()
    {
        WebView webview = new WebView(mContext);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }
}
