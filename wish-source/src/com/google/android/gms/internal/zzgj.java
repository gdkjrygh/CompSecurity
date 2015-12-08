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
import com.google.android.gms.ads.internal.zzh;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzge, zzgd, zzat, zzap, 
//            zzfl

public class zzgj extends zzge
{

    public zzgj(zzgd zzgd1, boolean flag)
    {
        super(zzgd1, flag);
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
            if (!(webview instanceof zzgd))
            {
                zzb.zzan("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            zzgd zzgd1 = (zzgd)webview;
            zzgd1.zzft().zzdv();
            if (zzgd1.zzah().zzpY)
            {
                s1 = (String)zzat.zzrB.get();
            } else
            {
                if (!zzgd1.zzfx())
                {
                    break label0;
                }
                s1 = (String)zzat.zzrA.get();
            }
        }
_L1:
        zzb.zzam((new StringBuilder()).append("shouldInterceptRequest(").append(s1).append(")").toString());
        return zzd(zzgd1.getContext(), zznp.zzfw().zzCI, s1);
        try
        {
            s1 = (String)zzat.zzrz.get();
        }
        catch (IOException ioexception)
        {
            zzb.zzan((new StringBuilder()).append("Could not fetch MRAID JS. ").append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
          goto _L1
    }

    protected WebResourceResponse zzd(Context context, String s, String s1)
        throws IOException
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        zzh.zzaQ().zza(context, s, true, s1, true);
        s1.addRequestProperty("Cache-Control", "max-stale=3600");
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(zzh.zzaQ().zza(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }
}
