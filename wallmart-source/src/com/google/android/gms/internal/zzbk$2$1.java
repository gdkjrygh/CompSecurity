// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzbk, zzbh

class zzsa
    implements ValueCallback
{

    final rZ zzsa;

    public void onReceiveValue(Object obj)
    {
        zzy((String)obj);
    }

    public void zzy(String s)
    {
        zzsa.rW.zza(zzsa.rY, zzsa.rZ, s);
    }

    <init>(<init> <init>1)
    {
        zzsa = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzbk$2

/* anonymous class */
    class zzbk._cls2
        implements Runnable
    {

        final zzbk zzrW;
        ValueCallback zzrX;
        final zzbh zzrY;
        final WebView zzrZ;

        public void run()
        {
            if (!zzrZ.getSettings().getJavaScriptEnabled())
            {
                break MISSING_BLOCK_LABEL_26;
            }
            zzrZ.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzrX);
            return;
            Throwable throwable;
            throwable;
            zzrX.onReceiveValue("");
            return;
        }

            
            {
                zzrW = zzbk1;
                zzrY = zzbh;
                zzrZ = webview;
                super();
                zzrX = new zzbk._cls2._cls1(this);
            }
    }

}
