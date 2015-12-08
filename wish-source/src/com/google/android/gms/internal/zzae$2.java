// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzae, zzab

class zzps
    implements Runnable
{

    final zzae zzpp;
    ValueCallback zzpq;
    final zzab zzpr;
    final WebView zzps;

    public void run()
    {
        if (!zzps.getSettings().getJavaScriptEnabled())
        {
            break MISSING_BLOCK_LABEL_26;
        }
        zzps.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzpq);
        return;
        Throwable throwable;
        throwable;
        zzpq.onReceiveValue("");
        return;
    }

    _cls1.zzpt(zzae zzae1, zzab zzab, WebView webview)
    {
        zzpp = zzae1;
        zzpr = zzab;
        zzps = webview;
        super();
        zzpq = new ValueCallback() {

            final zzae._cls2 zzpt;

            public void onReceiveValue(Object obj)
            {
                zzm((String)obj);
            }

            public void zzm(String s)
            {
                zzpt.zzpp.zza(zzpt.zzpr, zzpt.zzps, s);
            }

            
            {
                zzpt = zzae._cls2.this;
                super();
            }
        };
    }
}
