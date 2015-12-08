// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zziq, zzip, zzby, zzbu, 
//            zzhu, zzhy, zzih

public class zziv extends zziq
{

    public zziv(zzip zzip1, boolean flag)
    {
        super(zzip1, flag);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        String s1;
label0:
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof zzip))
            {
                zzb.zzaE("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            zzip zzip1 = (zzip)webview;
            zzip1.zzgS().zzeA();
            if (zzip1.zzaN().zzsH)
            {
                s1 = (String)zzby.zzuA.get();
            } else
            {
                if (!zzip1.zzgW())
                {
                    break label0;
                }
                s1 = (String)zzby.zzuz.get();
            }
        }
_L1:
        zzb.v((new StringBuilder()).append("shouldInterceptRequest(").append(s1).append(")").toString());
        return zze(zzip1.getContext(), zzoL.zzgV().zzIz, s1);
        s1 = (String)zzby.zzuy.get();
          goto _L1
        Object obj;
        obj;
_L3:
        zzb.zzaE((new StringBuilder()).append("Could not fetch MRAID JS. ").append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected WebResourceResponse zze(Context context, String s, String s1)
        throws IOException, ExecutionException, InterruptedException, TimeoutException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", zzp.zzbx().zzf(context, s));
        hashmap.put("Cache-Control", "max-stale=3600");
        context = (String)(new zzhy(context)).zzb(s1, hashmap).get(60L, TimeUnit.SECONDS);
        if (context == null)
        {
            return null;
        } else
        {
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(context.getBytes("UTF-8")));
        }
    }
}
