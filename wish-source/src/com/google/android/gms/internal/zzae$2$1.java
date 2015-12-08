// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzae, zzab

class zzpt
    implements ValueCallback
{

    final ps zzpt;

    public void onReceiveValue(Object obj)
    {
        zzm((String)obj);
    }

    public void zzm(String s)
    {
        zzpt.pp.zza(zzpt.pr, zzpt.ps, s);
    }

    <init>(<init> <init>1)
    {
        zzpt = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzae$2

/* anonymous class */
    class zzae._cls2
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

            
            {
                zzpp = zzae1;
                zzpr = zzab;
                zzps = webview;
                super();
                zzpq = new zzae._cls2._cls1(this);
            }
    }

}
