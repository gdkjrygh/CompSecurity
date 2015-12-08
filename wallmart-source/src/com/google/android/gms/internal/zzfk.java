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
//            zzfi, zzhu

public class zzfk
    implements zzfi
{

    private final Context mContext;
    final Set zzBE = Collections.synchronizedSet(new HashSet());

    public zzfk(Context context)
    {
        mContext = context;
    }

    public void zza(String s, String s1, String s2)
    {
        zzb.zzaC("Fetching assets for the given html");
        zzhu.zzHK.post(new Runnable(s1, s2) {

            final String zzBF;
            final String zzBG;
            final zzfk zzBH;

            public void run()
            {
                WebView webview = zzBH.zzfb();
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    final _cls1 zzBI;
                    final WebView zzrZ;

                    public void onPageFinished(WebView webview, String s)
                    {
                        zzb.zzaC("Loading assets have finished");
                        zzBI.zzBH.zzBE.remove(zzrZ);
                    }

                    public void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        zzb.zzaE("Loading assets have failed.");
                        zzBI.zzBH.zzBE.remove(zzrZ);
                    }

            
            {
                zzBI = _pcls1;
                zzrZ = webview;
                super();
            }
                });
                zzBH.zzBE.add(webview);
                webview.loadDataWithBaseURL(zzBF, zzBG, "text/html", "UTF-8", null);
                zzb.zzaC("Fetching assets finished.");
            }

            
            {
                zzBH = zzfk.this;
                zzBF = s;
                zzBG = s1;
                super();
            }
        });
    }

    public WebView zzfb()
    {
        WebView webview = new WebView(mContext);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }
}
